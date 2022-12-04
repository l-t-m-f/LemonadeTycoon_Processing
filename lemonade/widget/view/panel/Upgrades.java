package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.ShopUpgrade;

public class Upgrades extends View {

  // Class fields
  // Instance fields

  // Constructor(s)

  public Upgrades(GraphicLook graphics) {
    super("Upgrades", graphics);
    setVisibility(false);
    setButtonCommands(
        new Runnable[] { 
          new ButtonCommand.PreviousUpgrade(), 
          new ButtonCommand.NextUpgrade(), 
          new ButtonCommand.BuyUpgrade() });
    createButtons();
    createSubviews();
    createTextGraphics();
  }
  
  // Getters
  // Setters

  // Class methods

  @Override
  protected void createButtons() {
    Point position1 = Util.addPoint(new Point(13, 160), getPosition());
    Point position2 = Util.addPoint(new Point(342, 160), getPosition());
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
        new Button(new TextGraphic("Buy"),
            new GraphicLook(position3, new Dimension(120, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[2]));
  }

  @Override
  protected void createSubviews() {
    Point position = Util.addPoint(new Point(57, 155), getPosition());
    GraphicLook graphicLook = new GraphicLook(position, new Dimension(280, 194), 0x3300FFFF);
    addSubview(new ShopUpgrade(graphicLook));
  }

  @Override
  protected void createTextGraphics() {    
    Point position1 = Util.addPoint(new Point(75, 32), getPosition());
    addTextBlock(new TextGraphic("Upgrades", position1));

    Point position2 = Util.addPoint(new Point(75, 55), getPosition());
    TextGraphic textBlock = new TextGraphic("Improve your stand to send your sales through the roof!", position2);
    textBlock.setWrapBox(new Dimension(485, 85));
    addTextBlock(textBlock);
  }
}