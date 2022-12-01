package lemonade.widget.view.inner;

import java.awt.Point;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class Charts extends View {

  public Charts(GraphicLook graphicLook, Point offset) {
    super("Charts", graphicLook, offset);
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
