package lemonade.widget.view.main;

import java.awt.Dimension;
import java.awt.Point;
import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class Game extends View {

  public Game() {
    super("Game",
        new GraphicLook(new Point(0, 0),
            new Dimension(GameManager.getInstance().getSketch().width, GameManager.getInstance().getSketch().height),
            Util.Values.darkgray));
    setButtonCommands(new Runnable[] { new ButtonCommand.BackToMenu(), new ButtonCommand.DoNothing() });
    setVisibility(true);
    createButtons();
  }
  
  @Override
  protected void createButtons() {

    for (int i = 0; i < 2; i++) {
      int next_x = GameManager.getInstance().getSketch().width - 500 + (250 * i);
      int next_y = GameManager.getInstance().getSketch().height - 450;
      addButton(
          new Button(
              new GraphicLook(new Point(next_x, next_y), new Dimension(75, 35), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
              getButtonCommands()[i]));
    }
    Point position = new Point(GameManager.getInstance().getSketch().width - 25,
    GameManager.getInstance().getSketch().height - 25);
    addButton(
        new Button(
            new GraphicLook(position, new Dimension(25, 25), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[0]));
  }

}