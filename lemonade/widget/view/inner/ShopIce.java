package lemonade.widget.view.inner;

import java.awt.Point;
import lemonade.widget.GraphicLook;
import lemonade.widget.view.View;

public class ShopIce extends View {

  public ShopIce(GraphicLook graphicLook, Point offset) {
    super("Ice", graphicLook, offset);
    setVisibility(false);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}