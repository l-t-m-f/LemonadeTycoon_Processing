package lemonade.widget.view.panel;

import java.awt.Point;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;

public class TopBar extends View {

  public TopBar(GraphicLook graphicLook) {
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
    addTextVariable(new TextVariable(new Point(0, 0), Util.addPoint(new Point(30, 30), getOffset()), 0xFFFFFFFF, 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), Util.addPoint(new Point(150, 30), getOffset()), 0xFFFFFFFF, 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), Util.addPoint(new Point(270, 30), getOffset()), 0xFFFFFFFF, 24));
    addTextVariable(
        new TextVariable(new Point(0, 0), Util.addPoint(new Point(390, 30), getOffset()), 0xFFFFFFFF, 24));
    addTextVariable(
        new TextVariable(new Point(0, 0),
            Util.addPoint(new Point(GameManager.getInstance().getSketch().width - 100, 30), getOffset()), 0xFFFFFFFF,
            24));
  }

  protected void refreshTextVariables() {
    updateTextVariable(0, "" +
        GameManager.getInstance().getSupplies().getLemons().getCount());
    updateTextVariable(1, "" +
        GameManager.getInstance().getSupplies().getSugar().getCount());
    updateTextVariable(2, "" +
        GameManager.getInstance().getSupplies().getIce().getCount());
    updateTextVariable(3, "" +
        GameManager.getInstance().getSupplies().getCups().getCount());
    updateTextVariable(4, "$ " +
        GameManager.getInstance().getWallet().getCash().getCount());
  }

}