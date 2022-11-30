package src.widget.view.concrete;
class TopBarView extends View {

  public TopBarView(GraphicLook graphicLook) {
    super("TopBar", graphicLook, new Point(0, 0), new Point(220, 40));
    setVisibility(true);
    createTextVariables();
  }

  // This subview is always visible
  @Override
  public void setVisibility(boolean value) {
    super._visibility = true;
  }

  protected void createTextVariables() {
    addTextVariable(new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(30, 30), getOffset()), color(255), 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(150, 30), getOffset()), color(255), 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(270, 30), getOffset()), color(255), 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(390, 30), getOffset()), color(255), 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(width - 100, 30), getOffset()), color(255), 24));
  }

  protected void refreshTextVariables() {
    updateTextVariable(0, "" + gameManager.getSupplies().getLemons().getCount());
    updateTextVariable(1, "" + gameManager.getSupplies().getSugar().getCount());
    updateTextVariable(2, "" + gameManager.getSupplies().getIce().getCount());
    updateTextVariable(3, "" + gameManager.getSupplies().getCups().getCount());
    updateTextVariable(4, "$ " + gameManager.getWallet().getCash().getCount());
  }

}