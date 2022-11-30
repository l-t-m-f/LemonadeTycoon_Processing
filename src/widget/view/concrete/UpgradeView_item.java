package src.widget.view.concrete;

class UpgradesView_item extends View {

    public UpgradesView_item(GraphicLook graphicLook, Point offset){
      super("Item", graphicLook, offset);
      setButtonCommands(new Runnable[]{ new ButtonCommandNothing() });
      setVisibility(true);
    }
    
    @Override
    public void createSubviews(){
    }
    
    @Override
    protected void createButtons(){
    }
    
  }