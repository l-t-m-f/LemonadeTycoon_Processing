package lemonade.widget.view.main;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
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

import java.awt.Dimension;
import java.awt.Point;

public class Prepare extends View {

  public Prepare() {
    super("GamePreparation",
        new GraphicLook(new Point(0, 0),
            new Dimension(GameManager.getInstance().getSketch().width, GameManager.getInstance().getSketch().height),
            0xFF000000),
        new Point(0, 0), new Point(0, 40));
    setButtonLabels(new String[] { "MAIN MENU", "START DAY", "results", "rent", "upgrades", "staff", "marketing",
        "recipe", "supplies" });
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

    Point subviewOrigin = new Point(0, 0);
    Point subviewOffset = new Point(60, 244);
    Dimension subviewSize = new Dimension(552, 326);
    GraphicLook subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new Result(subviewGraphics, subviewOffset));
    addSubview(new Rent(subviewGraphics, subviewOffset));
    addSubview(new Upgrades(subviewGraphics, subviewOffset));
    addSubview(new Staff(subviewGraphics, subviewOffset));
    addSubview(new Marketing(subviewGraphics, subviewOffset));
    addSubview(new Recipe(subviewGraphics, subviewOffset));
    addSubview(new Supplies(subviewGraphics, subviewOffset));

    // Permanent subviews

    subviewOffset = new Point(723, 110);
    subviewSize = new Dimension(472, 460);
    subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new Animation(subviewGraphics, subviewOffset));

    subviewSize = new Dimension(GameManager.getInstance().getSketch().width, 40);
    subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, 0x777700FF);

    addSubview(new TopBar(subviewGraphics));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 2; i++) {
      int next_x = (GameManager.getInstance().getSketch().width / 2) - 350 + (350 * i);
      int next_y = GameManager.getInstance().getSketch().height - 55;
      addButton(new Button(getButtonLabels()[i],
          new GraphicLook(new Point(0, 0), new Dimension(200, 35), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
          new Point(next_x, next_y),
          getButtonCommands()[i]));
    }

    for (int i = 0; i < 7; i++) {
      int next_x = 60 + (80 * i);
      int next_y = 180;
      addButton(new Button(getButtonLabels()[2 + i], 16,
          new GraphicLook(new Point(0, 0), new Dimension(70, 45), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
          new Point(next_x, next_y),
          getButtonCommands()[2 + i]));
    }
  }
}