package lemonade.widget.view.inner;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;
import java.awt.Point;

public class ProfitsLosses extends View {

  public ProfitsLosses(GraphicLook graphicLook, Point offset) {
    super("ProfitsAndLosses", graphicLook, offset);
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
