package src.widget.view.concrete;
class ResultView_profitsLosses extends View {

  public ResultView_profitsLosses(GraphicLook graphicLook, Point offset) {
    super("ProfitsAndLosses", graphicLook, offset);
    setButtonCommands(new Runnable[] {
        new ButtonCommandNothing(), new ButtonCommandNothing(), new ButtonCommandNothing() });
    setVisibility(false);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}