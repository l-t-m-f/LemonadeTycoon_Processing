package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.Locations;

public class Rent extends View {

  // Class fields
  // Instance fields

  // Constructor(s)

  public Rent(GraphicLook graphics) {
    super("Rent", graphics);
    setVisibility(false);
    setButtonCommands(
        new Runnable[] { 
          new ButtonCommand.PreviousLocation(), 
          new ButtonCommand.NextLocation(), 
          new ButtonCommand.RentLocation() 
        });
    createButtons();
    createSubviews();
    createTextGraphics();
  }

  // Class methods

  @Override
  protected void createButtons() {
    Point position1 = Util.addPoint(new Point(13, 160), getPosition());
    Point position2 = Util.addPoint(new Point(527, 160), getPosition());
    Point position3 = Util.addPoint(new Point(378, 362), getPosition());
    addButton(
        new Button(
            new GraphicLook(position1, new Dimension(40, 70), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(position2, new Dimension(40, 70), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[1]));
    addButton(
        new Button(new TextGraphic("Rent"),
            new GraphicLook(position3, new Dimension(120, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[2]));
  }

  @Override
  protected void createSubviews() {
    Point position = Util.addPoint(new Point(57, 155), getPosition());
    GraphicLook graphicLook = new GraphicLook(position, new Dimension(465, 194), 0x3300FFFF);
    addSubview(new Locations(graphicLook));
  }

  @Override
  protected void createTextGraphics() {    
    Point position1 = Util.addPoint(new Point(75, 32), getPosition());
    addTextBlock(new TextGraphic("Locations", position1));

    Point position2 = Util.addPoint(new Point(75, 55), getPosition());
    addTextBlock(new TextGraphic("Choose a location.", position2));
  }
}