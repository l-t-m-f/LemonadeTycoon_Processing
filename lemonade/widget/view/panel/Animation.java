package lemonade.widget.view.panel;

import java.awt.Point;
import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

import java.awt.Dimension;

public class Animation extends View {

  public Animation(GraphicLook graphicLook, Point offset) {
    super("Scene", graphicLook, offset);
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
    addButton(new Button(
        new GraphicLook(new Point(0, 0), new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
        new Point(365 + getOffset().x, 300 + getOffset().y),
        getButtonCommands()[0]));
    addButton(new Button(
        new GraphicLook(new Point(0, 0), new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
        new Point(365 + getOffset().x, 380 + getOffset().y),
        getButtonCommands()[1]));
  }

}