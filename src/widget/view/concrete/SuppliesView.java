package src.widget.view.concrete;
class SuppliesView extends View {

  public SuppliesView(GraphicLook graphicLook, Point offset) {
    super("Supplies", graphicLook, offset);
    setVisibility(false);
    setButtonCommands(new Runnable[] {
        new ButtonCommandShowLemons(),
        new ButtonCommandShowSugar(),
        new ButtonCommandShowIce(),
        new ButtonCommandShowCups()
    });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {
    GraphicLook graphicLook = new GraphicLook(new Point(0, 0), new Dimension(250, 200), color(155, 0, 155));
    Point offset = new Point(getOffset().x + 100, getOffset().y + 196);

    addSubview(new SuppliesView_itemLemons(graphicLook, offset));
    addSubview(new SuppliesView_itemSugar(graphicLook, offset));
    addSubview(new SuppliesView_itemIce(graphicLook, offset));
    addSubview(new SuppliesView_itemCups(graphicLook, offset));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 4; i++) {
      addButton(
          new Button(new GraphicLook(new Point(0, 0), new Dimension(50, 50), CONST.BTN_FILL1, CONST.BTN_BORDER1),
              new Point(120 + (65 * i) + getOffset().x, 120 + getOffset().y),
              getButtonCommands()[i]));
    }
  }
}