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

  public Recipe(GraphicLook graphics, Point offset) {
    super("Recipe", graphics, offset);
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
          addButton(new Button(
              new GraphicLook(new Point(0, 0), new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
              new Point(30 + (65 * i) + getOffset().x, 125 + (65 * j) + getOffset().y),
              getButtonCommands()[buttonCount]));
          buttonCount++;
        }
      }
    }
  }

  protected void createTextBlocks() {
    int startingX = 10;
    int startingY = 50;
    addTextBlock(new TextBlock("Tweak your recipe according to temperature, adding more ice when needed.",
        new Point(0, 0), Util.addPoint(new Point(startingX, startingY), getOffset()), 0xFFFFFFFF, 16));
    addTextBlock(new TextBlock("Always keep a good balance between all ingredients.", new Point(0, 0),
        Util.addPoint(new Point(startingX, startingY + Util.Values.TEXT_INTERLINE), getOffset()), 0xFFFFFFFF, 16));
    addTextBlock(new TextBlock("Cups per pitcher: ", new Point(0, 0), Util.addPoint(new Point(245, 170), getOffset()),
        0xFFFFFFFF, 20));
  }

  protected void createTextVariables() {
    addTextVariable(new TextVariable(new Point(0, 0), Util.addPoint(new Point(110, 152), getOffset()), 0xFFFFFFFF, 24));
    addTextVariable(new TextVariable(new Point(0, 0), Util.addPoint(new Point(110, 222), getOffset()), 0xFFFFFFFF, 24));
    addTextVariable(new TextVariable(new Point(0, 0), Util.addPoint(new Point(110, 292), getOffset()), 0xFFFFFFFF, 24));
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