package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.Location;

public class Rent extends View {

  public Rent(GraphicLook graphics, Point offset) {
    super("Rent", graphics, offset);
    setVisibility(false);
    setButtonCommands(
        new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {
    GraphicLook graphicLook = new GraphicLook(new Point(0, 0), new Dimension(250, 200), 0x3300FFFF);
    Point offset = new Point(getOffset().x + 100, getOffset().y + 196);
    addSubview(new Location(graphicLook, offset));
  }

  @Override
  protected void createButtons() {
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(60 + getOffset().x, 156 + getOffset().y),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(412 + getOffset().x, 156 + getOffset().y),
            getButtonCommands()[1]));
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(120, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(310 + getOffset().x, 260 + getOffset().y),
            getButtonCommands()[2]));
  }
}