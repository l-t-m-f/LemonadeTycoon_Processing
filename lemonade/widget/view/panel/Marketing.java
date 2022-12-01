package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import java.awt.Dimension;
import java.awt.Point;

public class Marketing extends View {

  public Marketing(GraphicLook graphics, Point offset) {
    super("Marketing", graphics, offset);
    setVisibility(false);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    createButtons();
    createSubviews();
  }

  @Override
  protected void createButtons() {
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(50 + getOffset().x, 75 + getOffset().y),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(250 + getOffset().x, 75 + getOffset().y),
            getButtonCommands()[1]));
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(50 + getOffset().x, 275 + getOffset().y),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(new Point(0, 0), new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            new Point(250 + getOffset().x, 275 + getOffset().y),
            getButtonCommands()[1]));
  }
}