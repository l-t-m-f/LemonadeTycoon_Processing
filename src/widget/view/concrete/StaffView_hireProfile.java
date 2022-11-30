package src.widget.view.concrete;

class StaffView_hireProfile extends View {

    public StaffView_hireProfile(GraphicLook graphicLook, Point offset){
      super("Profile", graphicLook, offset);
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