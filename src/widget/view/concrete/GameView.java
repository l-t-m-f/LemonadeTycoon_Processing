package src.widget.view.concrete;

class GameView extends View {
  
    public GameView() {
      super("Game", new GraphicLook(new Point(0, 0), new Dimension(width, height), CONST.darkgray), new Point(0,0));
      setButtonCommands(new Runnable[] { new ButtonCommandBackToMenu(), new ButtonCommandNothing() });
      setVisibility(true);
      createButtons();
    }
    
    @Override
    public void createSubviews(){
    }
    
    @Override
    protected void createButtons() {
      
      for(int i = 0; i < 2; i++){
        int next_x = width - 500 + (250 * i);
        int next_y = height - 450;
        addButton(
          new Button(new GraphicLook(new Point(0, 0), new Dimension(75, 35), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(next_x, next_y),
          getButtonCommands()[i]));
      }
      addButton(
        new Button(new GraphicLook(new Point(0, 0), new Dimension(25, 25), CONST.BTN_FILL1, CONST.BTN_BORDER1),
        new Point(width - 25, height - 25),
        getButtonCommands()[0]));
    }
    
  }