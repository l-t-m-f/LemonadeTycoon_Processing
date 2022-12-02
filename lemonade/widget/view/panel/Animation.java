package lemonade.widget.view.panel;

import java.awt.Point;
import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

import java.awt.Dimension;

public class Animation extends View {

  public Animation(GraphicLook graphicLook) {
    super("Scene", graphicLook);
    setVisibility(true);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    createButtons();
    createSubviews();
  }

  // This subview is always visible
  @Override
  public void setVisibility(boolean value) {
    super._visibility = true;
  }

  @Override
  protected void createButtons() {
    Point position1 = new Point(365 + getPosition().x, 300 + getPosition().y);
    Point position2 = new Point(365 + getPosition().x, 380 + getPosition().y);
    addButton(new Button(
        new GraphicLook(position1, new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
        getButtonCommands()[0]));
    addButton(new Button(
        new GraphicLook(position2, new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
        getButtonCommands()[1]));
  }

}