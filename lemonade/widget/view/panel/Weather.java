package lemonade.widget.view.panel;

import lemonade.widget.GraphicLook;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.view.View;

public class Weather extends View {

    public Weather(GraphicLook graphicLook) {
        super("Weather", graphicLook);
        setVisibility(true);
        setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing(), new ButtonCommand.DoNothing() });
        createButtons();
        createSubviews();
      }
    
      // This subview is always visible
      @Override
      public void setVisibility(boolean value) {
        super._visibility = true;
      }
}
