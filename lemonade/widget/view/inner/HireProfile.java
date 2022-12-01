package lemonade.widget.view.inner;

import java.awt.Point;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class HireProfile extends View {

  public HireProfile(GraphicLook graphicLook, Point offset) {
    super("Profile", graphicLook, offset);
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