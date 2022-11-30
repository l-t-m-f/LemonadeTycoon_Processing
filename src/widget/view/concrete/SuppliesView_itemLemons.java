package src.widget.view.concrete;
class SuppliesView_itemLemons extends View {

  public SuppliesView_itemLemons(GraphicLook graphicLook, Point offset) {
    super("Lemons", graphicLook, offset);
    setButtonCommands(new Runnable[] {
        new ButtonCommand_SubtractPreSaleLemons12(), new ButtonCommand_AddPreSaleLemons12(),
        new ButtonCommand_SubtractPreSaleLemons24(), new ButtonCommand_AddPreSaleLemons24(),
        new ButtonCommand_SubtractPreSaleLemons48(), new ButtonCommand_AddPreSaleLemons48()
    });
    setVisibility(true);
    createButtons();
    createTextBlocks();
    createTextVariables();
  }

  @Override
  protected void createButtons() {
    int buttonCount = 0;
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        if (i != 1) {
          addButton(
              new Button(new GraphicLook(new Point(0, 0), new Dimension(50, 50), CONST.BTN_FILL1, CONST.BTN_BORDER1),
                  LTUtil.addPoint(new Point(-10 + (112 * i), 8 + (65 * j)), getOffset()),
                  getButtonCommands()[buttonCount]));
          buttonCount++;
        }
      }
    }

    addButton(new Button(new GraphicLook(new Point(0, 0), new Dimension(80, 40), CONST.BTN_FILL1, CONST.BTN_BORDER1),
        LTUtil.addPoint(new Point(318, 80), getOffset()),
        new ButtonCommand_BuyLemonsSupplies()));

  }

  protected void createTextBlocks() {

    int startingX = 64;
    int startingY = 39;
    final int incrementY = 60;
    String[] contents = { "12 lemons", "24 lemons", "48 lemons", "$ 4.80", "$ 7.20", "$ 9.60" };

    for (int i = 0; i < 3; i++) {
      addTextBlock(new TextBlock(contents[i], new Point(0, 0),
          LTUtil.addPoint(new Point(startingX, startingY + (incrementY * i)), getOffset()), color(255), 14));
      addTextBlock(new TextBlock(contents[3 + i], new Point(0, 0),
          LTUtil.addPoint(new Point(startingX, startingY + (incrementY * i) + (CONST.TEXT_INTERLINE / 2)), getOffset()),
          color(255), 14));
    }
  }

  protected void createTextVariables() {
    int startingX = 155;
    int startingY = 36;
    final int incrementY = 60;

    for (int i = 0; i < 3; i++) {
      addTextVariable(new TextVariable(new Point(0, 0),
          LTUtil.addPoint(new Point(startingX, startingY + (incrementY * i)), getOffset()), color(255), 24));
    }
  }

  protected void refreshTextVariables() {
    updateTextVariable(0, "" + gameManager.getSupplies().getLemonsPreSaleCounters()[0].getCount());
    updateTextVariable(1, "" + gameManager.getSupplies().getLemonsPreSaleCounters()[1].getCount());
    updateTextVariable(2, "" + gameManager.getSupplies().getLemonsPreSaleCounters()[2].getCount());
  }

}