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
  public Result(GraphicLook graphics, Point offset) {
    super("Result", graphics, offset);
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
    GraphicLook subsubviewGraphics = new GraphicLook(new Point(0, 0), new Dimension(250, 200), 0x8000FFFF);
    Point offset = new Point(getOffset().x + 100, getOffset().y + 196);
    addSubview(new Charts(subsubviewGraphics, offset));
    addSubview(new ProfitsLosses(subsubviewGraphics, offset));
    addSubview(new BalanceSheet(subsubviewGraphics, offset));
  }

  @Override
  protected void createButtons() {
    for (int i = 0; i < 4; i++) {
      addButton(
          new Button(
              new GraphicLook(new Point(0, 0), new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
              new Point((65 * i) + getOffset().x, 80 + getOffset().y),
              getButtonCommands()[i]));
    }
  }
}
