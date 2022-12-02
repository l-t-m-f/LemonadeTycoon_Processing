package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextBlock;
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
          Point position = Util.addPoint(new Point(30 + (65 * i), 125 + (65 * j)), getPosition());
          addButton(new Button(
              new GraphicLook(position, new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
              getButtonCommands()[buttonCount]));
          buttonCount++;
        }
      }
    }
  }

  protected void createTextBlocks() {
    int startingX = 10;
    int startingY = 50;
    Point position1 =  Util.addPoint(new Point(startingX, startingY), getPosition());
    Point position2 = Util.addPoint(new Point(startingX, startingY + Util.Values.TEXT_INTERLINE), getPosition());
    Point position3 = Util.addPoint(new Point(245, 170), getPosition());
    addTextBlock(new TextBlock(Util.Values.StringPool[0],
        position1, 0xFFFFFFFF, 16));
    addTextBlock(new TextBlock(Util.Values.StringPool[1], position2, 0xFFFFFFFF, 16));
    addTextBlock(new TextBlock(Util.Values.StringPool[2], position3,
        0xFFFFFFFF, 20));
  }

  protected void createTextVariables() {
    Point position1 = Util.addPoint(new Point(110, 152), getPosition());
    Point position2 = Util.addPoint(new Point(110, 222), getPosition());
    Point position3 = Util.addPoint(new Point(110, 292), getPosition());

    addTextVariable(new TextVariable(position1, 0xFFFFFFFF, 24));
    addTextVariable(new TextVariable(position2, 0xFFFFFFFF, 24));
    addTextVariable(new TextVariable(position3, 0xFFFFFFFF, 24));
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