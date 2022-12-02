package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class ShopItem extends View {

  public ShopItem(GraphicLook graphicLook) {
    super("Item", graphicLook);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing() });
    setVisibility(true);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}
