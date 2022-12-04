package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class Yesterdays extends View {

  public Yesterdays(GraphicLook graphicLook) {
    super("Yesterday's Results", graphicLook);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.DoNothing(),
        new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
    setVisibility(true);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }

}
