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

  public Supplies(GraphicLook graphicLook) {
    super("Supplies", graphicLook);
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
    Point position = Util.addPoint(new Point(100, 196), getPosition());
    GraphicLook graphicLook = new GraphicLook(position, new Dimension(250, 200), 0x880088FF);

    addSubview(new ShopLemons(graphicLook));
    addSubview(new ShopSugar(graphicLook));
    addSubview(new ShopIce(graphicLook));
    addSubview(new ShopCups(graphicLook));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 4; i++) {
      Point position = Util.addPoint(new Point(120 + (65 * i), 120), getPosition());
      addButton(
          new Button(
              new GraphicLook(position, new Dimension(50, 50), Util.Values.BTN_FILL1,
                  Util.Values.BTN_BORDER1),
              getButtonCommands()[i]));
    }
  }
}