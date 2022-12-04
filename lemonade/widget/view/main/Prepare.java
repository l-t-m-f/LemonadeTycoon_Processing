package lemonade.widget.view.main;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.view.View;
import lemonade.widget.view.panel.Animation;
import lemonade.widget.view.panel.Marketing;
import lemonade.widget.view.panel.Recipe;
import lemonade.widget.view.panel.Rent;
import lemonade.widget.view.panel.Result;
import lemonade.widget.view.panel.Staff;
import lemonade.widget.view.panel.Supplies;
import lemonade.widget.view.panel.TopBar;
import lemonade.widget.view.panel.Upgrades;
import lemonade.widget.view.panel.Weather;

import java.awt.Dimension;
import java.awt.Point;

public class Prepare extends View {

  public Prepare() {
    super("GamePreparation",
        new GraphicLook(new Point(0, 0),
            new Dimension(GameManager.getInstance().getSketch().width, GameManager.getInstance().getSketch().height),
            0xFF000000),
        new Point(0, 40));
    setButtonTextGraphics(new TextGraphic[] { 
          new TextGraphic("MAIN MENU"),
          new TextGraphic("START DAY"),
          new TextGraphic("results"),
          new TextGraphic("rent"),
          new TextGraphic("upgrades"),
          new TextGraphic("staff"),
          new TextGraphic("marketing"),
          new TextGraphic("recipe"),
          new TextGraphic("supplies"),
    });
    setButtonCommands(new Runnable[] {
        new ButtonCommand.BackToMenu(),
        new ButtonCommand.StartDay(),
        new ButtonCommand.ShowResult(),
        new ButtonCommand.ShowRent(),
        new ButtonCommand.ShowUpgrades(),
        new ButtonCommand.ShowStaff(),
        new ButtonCommand.ShowMarketing(),
        new ButtonCommand.ShowRecipe(),
        new ButtonCommand.ShowSupplies() });
    setVisibility(true);
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {

    // Modular subviews

    Point subviewOrigin = new Point(71, 204);
    Dimension subviewSize = new Dimension(579, 406);
    GraphicLook subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new Result(subviewGraphics));
    addSubview(new Rent(subviewGraphics));
    addSubview(new Upgrades(subviewGraphics));
    addSubview(new Staff(subviewGraphics));
    addSubview(new Marketing(subviewGraphics));
    addSubview(new Recipe(subviewGraphics));
    addSubview(new Supplies(subviewGraphics));

    // Permanent subviews

    subviewOrigin = new Point(677, 204);
    subviewSize = new Dimension(528, 490);
    subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new Animation(subviewGraphics));

    subviewOrigin = new Point(677, 60);
    subviewSize = new Dimension(528, 136);
    subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new Weather(subviewGraphics));

    subviewOrigin = new Point(0, 0);
    subviewSize = new Dimension(GameManager.getInstance().getSketch().width, 40);
    subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new TopBar(subviewGraphics));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 2; i++) {
      Point position = new Point((GameManager.getInstance().getSketch().width / 2) - 450 + (210 * i),
          (GameManager.getInstance().getSketch().height - 55));
      addButton(new Button(getButtonTextGraphics()[i],
          new GraphicLook(position, new Dimension(200, 35), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
          getButtonCommands()[i]));
    }

    for (int i = 0; i < 7; i++) {
      Point position = new Point((60 + (80 * i)), 120);
      addButton(new Button(getButtonTextGraphics()[2 + i],
          new GraphicLook(position, new Dimension(70, 45), Util.Values.BTN_FILL1,
              Util.Values.BTN_BORDER1),
          getButtonCommands()[2 + i]));
    }
  }
}