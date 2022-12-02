package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class ProfitsLosses extends View {

  public ProfitsLosses(GraphicLook graphicLook) {
    super("ProfitsAndLosses", graphicLook);
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
