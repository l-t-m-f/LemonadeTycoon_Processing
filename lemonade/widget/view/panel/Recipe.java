package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import java.awt.Dimension;
import java.awt.Point;

public class Recipe extends View {

  public Recipe(GraphicLook graphics) {
    super("Recipe", graphics);
    setVisibility(false);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.RemoveLemonFromRecipe(), new ButtonCommand.AddLemonToRecipe(),
        new ButtonCommand.RemoveSugarFromRecipe(), new ButtonCommand.AddSugarToRecipe(),
        new ButtonCommand.RemoveIceFromRecipe(), new ButtonCommand.AddIceToRecipe()
    });
    createButtons();
    createSubviews();
    createTextBlocks();
    createTextVariables();
  }

  @Override
  protected void createButtons() {
    int buttonCount = 0;
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        if (i != 1) {
          Point position = Util.addPoint(new Point(45 + (65 * i), 175 + (65 * j)), getPosition());
          addButton(new Button(
              new GraphicLook(position, new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
              getButtonCommands()[buttonCount]));
          buttonCount++;
        }
      }
    }
  }

  protected void createTextBlocks() {

    Point position1 = Util.addPoint(new Point(75, 32), getPosition());
    addTextBlock(new TextGraphic("Recipe", position1));

    Point position2 = Util.addPoint(new Point(75, 55), getPosition());
    TextGraphic preparedTextBlock1 = new TextGraphic(
        "Tweak your recipe according to temperature, adding more ice when needed. Always keep a good balance between all ingredients.",
        position2);
    preparedTextBlock1.setWrapBox(new Dimension(485, 85));
    addTextBlock(preparedTextBlock1);

    Point position3 = Util.addPoint(new Point(285, 170), getPosition());
    addTextBlock(new TextGraphic("Cups per pitcher: ", position3));

    Point position4 = Util.addPoint(new Point(285, 210), getPosition());
    addTextBlock(new TextGraphic("Cost per cup: ", position4));
  }

  protected void createTextVariables() {
    Point position1 = Util.addPoint(new Point(128, 197), getPosition());
    Point position2 = Util.addPoint(new Point(128, 267), getPosition());
    Point position3 = Util.addPoint(new Point(128, 337), getPosition());

    addTextVariable(new TextVariable(position1));
    addTextVariable(new TextVariable(position2));
    addTextVariable(new TextVariable(position3));
  }

  protected void refreshTextVariables() {

    updateTextVariable(0, "" +
        GameManager.getInstance().getRecipe().getLemons().getCount());
    updateTextVariable(1, "" +
        GameManager.getInstance().getRecipe().getSugar().getCount());
    updateTextVariable(2, "" +
        GameManager.getInstance().getRecipe().getIce().getCount());

  }

}