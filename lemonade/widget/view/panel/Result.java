package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.BalanceSheet;
import lemonade.widget.view.inner.Charts;
import lemonade.widget.view.inner.ProfitsLosses;

public class Result extends View {
  public Result(GraphicLook graphics) {
    super("Result", graphics);
    setButtonCommands(new Runnable[] {
        () -> System.out.println("Command not implemented"),
        new ButtonCommand.ShowCharts(),
        new ButtonCommand.ShowProfitsLosses(),
        new ButtonCommand.ShowBalanceSheet()
    });
    setVisibility(true);
    createButtons();
    createSubviews();
  }

  @Override
  protected void createSubviews() {
    Point position = Util.addPoint(new Point(100, 196), getPosition());
    GraphicLook subsubviewGraphics = new GraphicLook(position, new Dimension(250, 200), 0x8000FFFF);
    addSubview(new Charts(subsubviewGraphics));
    addSubview(new ProfitsLosses(subsubviewGraphics));
    addSubview(new BalanceSheet(subsubviewGraphics));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 4; i++) {
      Point position = Util.addPoint(new Point((65 * i), 80), getPosition());
      addButton(
          new Button(
              new GraphicLook(position, new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
              getButtonCommands()[i]));
    }
  }
}
