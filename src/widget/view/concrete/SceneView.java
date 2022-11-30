package src.widget.view.concrete;
class SceneView extends View {
  
    public SceneView(GraphicLook graphicLook, Point offset) {
      super("Scene", graphicLook, offset);
      setVisibility(true);
      setButtonCommands(new Runnable[]{new ButtonCommandNothing(), new ButtonCommandNothing()});
      createButtons();
      createSubviews();
    }
    
    //This subview is always visible
    @Override
    public void setVisibility(boolean value) {   
      super._visibility = true;    
    }
    
    @Override
    protected void createButtons(){
      addButton(new Button(new GraphicLook(new Point(0, 0), new Dimension(50, 50), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(365 + getOffset().x, 300 + getOffset().y),
          getButtonCommands()[0]));
      addButton(new Button(new GraphicLook(new Point(0, 0), new Dimension(50, 50), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(365 + getOffset().x, 380 + getOffset().y),
          getButtonCommands()[1]));
    }  
    
  }