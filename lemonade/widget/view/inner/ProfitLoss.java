package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class ProfitLoss extends View {

  public ProfitLoss(GraphicLook graphicLook) {
    super("ProfitAndLoss", graphicLook);
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
