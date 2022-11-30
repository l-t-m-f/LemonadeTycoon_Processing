package src.widget.view.concrete;
class ResultView_charts extends View {

  public ResultView_charts(GraphicLook graphicLook, Point offset) {
    super("Charts", graphicLook, offset);
    setButtonCommands(new Runnable[] {
        new ButtonCommandNothing(),
        new ButtonCommandNothing(), new ButtonCommandNothing() });
    setVisibility(true);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}
