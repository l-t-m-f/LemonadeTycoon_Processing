package lemonade.widget.view.inner;

import java.awt.Point;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class BalanceSheet extends View {

  public BalanceSheet(GraphicLook graphicLook, Point offset) {
    super("BalanceSheet", graphicLook, offset);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    setVisibility(false);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}