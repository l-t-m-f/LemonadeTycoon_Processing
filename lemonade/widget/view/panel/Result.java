package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import lemonade.widget.view.inner.BalanceSheet;
import lemonade.widget.view.inner.Charts;
import lemonade.widget.view.inner.ProfitLoss;

public class Result extends View {


  // Class fields

  private static String _presentedInnerViewName = "Charts";
  private final static int _componentAnchorY = 196;

  // Instance fields
  // None

  // Constructor(s)

  public Result(GraphicLook graphics) {
    super("Result", graphics);
    setButtonCommands(new Runnable[] {
        () -> System.out.println("Command not implemented"),
        new ButtonCommand.ShowCharts(),
        new ButtonCommand.ShowProfitLoss(),
        new ButtonCommand.ShowBalanceSheet()
    });
    setVisibility(true);
    createButtons();
    createSubviews();
    createTextVariables();
  }

  // Getters

  public static int getComponentAnchorY() {
    return _componentAnchorY;
  }

  public static String getPresentedInnerViewName() {
    return _presentedInnerViewName;
  }

  // Setters

  public static void setPresentedInnerViewName(String value) {
    _presentedInnerViewName = value;
  }

  // Class methods

  @Override
  protected void createButtons() {

    final int marginV = 5;
    final int buttonOffsetH = 220;
    final int buttonSpacing = 15;
    final Dimension buttonDimension = new Dimension(65, 40);

    for (int i = 0; i < 4; i++) {

      Point buttonPosition = Util.addPoint(
        new Point(
          getMargins()[0] + buttonOffsetH + ((buttonDimension.width + buttonSpacing) * i), 
          getComponentAnchorY() - marginV - buttonDimension.height
        ), 
        getPosition()
      );

      addButton(
        new Button(
          new GraphicLook(
            buttonPosition, 
            buttonDimension, 
            Util.Values.BTN_FILL1, 
            Util.Values.BTN_BORDER1
          ),
          getButtonCommands()[i]
        )
      );
    }
  }

  @Override
  protected void createSubviews() {

    final int marginV = 35;

    Point position = Util.addPoint(new Point(getMargins()[0], getComponentAnchorY()), getPosition());
    GraphicLook subsubviewGraphics = 
        new GraphicLook(
          position,
          new Dimension(
            getRectangle().width - (getMargins()[0] * 2),
            getRectangle().height - getComponentAnchorY() - marginV),
          0x8000FFFF);

    addSubview(new Charts(subsubviewGraphics));
    addSubview(new ProfitLoss(subsubviewGraphics));
    addSubview(new BalanceSheet(subsubviewGraphics));
  }

  @Override
  protected void createTextVariables() {
    Point position1 = Util.addPoint(new Point(75, 32), getPosition());
    addTextVariable(new TextVariable(position1));
  }

  @Override
  protected void refreshTextVariables() { 
    updateTextVariable(0, "" + getPresentedInnerViewName());
  }
}
