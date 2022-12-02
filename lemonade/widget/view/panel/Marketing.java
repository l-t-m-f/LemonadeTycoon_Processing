package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import java.awt.Dimension;
import java.awt.Point;

public class Marketing extends View {

  public Marketing(GraphicLook graphics) {
    super("Marketing", graphics);
    setVisibility(false);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createButtons() {
    Point position1 = Util.addPoint(new Point(50, 75), getPosition());
    Point position2 = Util.addPoint(new Point(250, 75), getPosition());
    Point position3 = Util.addPoint(new Point(50, 275), getPosition());
    Point position4 = Util.addPoint(new Point(250, 275), getPosition());
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
            new GraphicLook(position3, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(position4, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[1]));
  }
}