package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class HireProfile extends View {

  public HireProfile(GraphicLook graphicLook) {
    super("Profile", graphicLook);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing() });
    setVisibility(true);
  }

  @Override
  public void createSubviews() {
  }

  @Override
  protected void createButtons() {
  }
}