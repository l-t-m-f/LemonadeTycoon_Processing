package lemonade.widget.view.inner;

import java.awt.Point;
import lemonade.widget.GraphicLook;
import lemonade.widget.view.View;

public class ShopCups extends View {

  public ShopCups(GraphicLook graphicLook, Point offset) {
    super("Cups", graphicLook, offset);
    setVisibility(false);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}
