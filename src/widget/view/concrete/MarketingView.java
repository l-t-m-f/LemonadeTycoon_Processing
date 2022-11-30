package src.widget.view.concrete;

class MarketingView extends View {
  
    public MarketingView(GraphicLook graphics, Point offset) {
      super("Marketing", graphics, offset);    
      setVisibility(false);
      setButtonCommands(new Runnable[]{new ButtonCommandNothing(), new ButtonCommandNothing()});
      createButtons();
      createSubviews();
    }
    
    @Override
    protected void createButtons(){    
      addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(70, 30), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(50 + getOffset().x, 75 + getOffset().y),
          getButtonCommands()[0]));
      addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(70, 30), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(250 + getOffset().x, 75 + getOffset().y),
          getButtonCommands()[1]));
      addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(70, 30), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(50 + getOffset().x, 275 + getOffset().y),
          getButtonCommands()[0]));
      addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(70, 30), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(250 + getOffset().x, 275 + getOffset().y),
          getButtonCommands()[1]));
    }  
  }