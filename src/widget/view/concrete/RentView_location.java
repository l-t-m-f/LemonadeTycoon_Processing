package src.widget.view.concrete;
class RentView_location extends View {

  public RentView_location(GraphicLook graphicLook, Point offset) {
    super("Locations", graphicLook, offset);
    setButtonCommands(new Runnable[] { new ButtonCommandNothing() });
    setVisibility(true);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}