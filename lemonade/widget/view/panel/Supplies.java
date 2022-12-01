package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.ShopCups;
import lemonade.widget.view.inner.ShopIce;
import lemonade.widget.view.inner.ShopLemons;
import lemonade.widget.view.inner.ShopSugar;

import java.awt.Point;
import java.awt.Dimension;

public class Supplies extends View {

  public Supplies(GraphicLook graphicLook, Point offset) {
    super("Supplies", graphicLook, offset);
    setVisibility(false);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.ShowShopLemons(),
        new ButtonCommand.ShowShopSugar(),
        new ButtonCommand.ShowShopIce(),
        new ButtonCommand.ShowShopCups()
    });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {
    GraphicLook graphicLook = new GraphicLook(new Point(0, 0), new Dimension(250, 200), 0x880088FF);
    Point offset = new Point(getOffset().x + 100, getOffset().y + 196);

    addSubview(new ShopLemons(graphicLook, offset));
    addSubview(new ShopSugar(graphicLook, offset));
    addSubview(new ShopIce(graphicLook, offset));
    addSubview(new ShopCups(graphicLook, offset));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 4; i++) {
      addButton(
          new Button(
              new GraphicLook(new Point(0, 0), new Dimension(50, 50), Util.Values.BTN_FILL1,
                  Util.Values.BTN_BORDER1),
              new Point(120 + (65 * i) + getOffset().x, 120 + getOffset().y),
              getButtonCommands()[i]));
    }
  }
}