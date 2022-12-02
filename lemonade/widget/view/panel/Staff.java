package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.HireProfile;

public class Staff extends View {

  public Staff(GraphicLook graphics) {
    super("Staff", graphics);
    setVisibility(false);
    setButtonCommands(
        new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {
    Point position = Util.addPoint(new Point(100, 196), getPosition());
    GraphicLook graphicLook = new GraphicLook(position, new Dimension(250, 200), 0xFFFF0055);
    addSubview(new HireProfile(graphicLook));
  }

  @Override
  protected void createButtons() {
    Point position1 = Util.addPoint(new Point(60, 156), getPosition());
    Point position2 = Util.addPoint(new Point(412, 156), getPosition());
    Point position3 = Util.addPoint(new Point(310, 260), getPosition());
    addButton(
        new Button(
            new GraphicLook(position1, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(position2, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[1]));
    addButton(
        new Button(
            new GraphicLook(position3, new Dimension(120, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[2]));
  }

}