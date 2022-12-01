package lemonade.widget.view.inner;

import java.awt.Point;
import lemonade.widget.GraphicLook;
import lemonade.widget.view.View;

public class ShopSugar extends View {

  public ShopSugar(GraphicLook graphicLook, Point offset) {
    super("Sugar", graphicLook, offset);
    setVisibility(false);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}