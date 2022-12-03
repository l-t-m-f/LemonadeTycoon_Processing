package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.view.View;
import java.awt.Dimension;
import java.awt.Point;

public class Marketing extends View {
  
  // Instance fields
  // None

  // Constructor(s)

  public Marketing(GraphicLook graphics) {
    super("Marketing", graphics);
    setVisibility(false);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    createButtons();
    createSubviews();
    createTextBlocks();
    createTextVariables();
  }

  // Class fields

  @Override
  protected void createButtons() {
    Point position1 = Util.addPoint(new Point(50, 135), getPosition());
    Point position2 = Util.addPoint(new Point(250, 135), getPosition());
    Point position3 = Util.addPoint(new Point(50, 348), getPosition());
    Point position4 = Util.addPoint(new Point(250, 348), getPosition());
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

  @Override
  protected void createTextBlocks() {
    int textHeight = 17;
    Point position1 = Util.addPoint(new Point(getMarginH(), (getMarginV() + textHeight)), getPosition());
    addTextBlock(new TextGraphic("Price", position1));

    Point position2 = Util.addPoint(new Point(getMarginH(), 55), getPosition());
    TextGraphic preparedTextBlock1 = new TextGraphic(
        "Skills, instinct, judgement, luck... Do you have what it takes to set the perfect price?", position2);
    preparedTextBlock1.setWrapBox(new Dimension(485, 85));
    addTextBlock(preparedTextBlock1);

    Point position3 = Util.addPoint(new Point(getMarginH(), 232), getPosition());
    addTextBlock(new TextGraphic("Advertising", position3));

    Point position4 = Util.addPoint(new Point(getMarginH(), 255), getPosition());
    TextGraphic preparedTextBlock2 = new TextGraphic(
        "When your reputation needs a little boost, spending a few dollars here can really make the difference by attracting more customers to your stand.",
        position4);
    addTextBlock(preparedTextBlock2);
  }

  @Override
  protected void createTextVariables() {

  }

  @Override
  protected void refreshTextVariables() {
    
  }
}