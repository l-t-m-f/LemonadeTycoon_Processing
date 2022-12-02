package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class Charts extends View {

  public Charts(GraphicLook graphicLook) {
    super("Charts", graphicLook);
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
