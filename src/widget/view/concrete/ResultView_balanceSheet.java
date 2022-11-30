package src.widget.view.concrete;
class ResultView_balanceSheet extends View {

  public ResultView_balanceSheet(GraphicLook graphicLook, Point offset) {
    super("BalanceSheet", graphicLook, offset);
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