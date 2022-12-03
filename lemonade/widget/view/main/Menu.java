package lemonade.widget.view.main;

import java.awt.Dimension;
import java.awt.Point;
import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.view.View;

public class Menu extends View {

	public Menu() {
		
		super("MainMenu", new GraphicLook(
				new Point(0, 0),
				new Dimension(
						GameManager.getInstance().getSketch().width,
						GameManager.getInstance().getSketch().height),
				Util.Values.lime));

		setButtonTextGraphics(new TextGraphic[] {
				new TextGraphic("Play"),
				new TextGraphic("Options"),
				new TextGraphic("Quit"),
		});

		setButtonCommands(new Runnable[] {
				new ButtonCommand.Play(),
				new ButtonCommand.DoNothing(),
				new ButtonCommand.DoNothing()
		});

		setVisibility(true);
		createButtons();
	}

	@Override
	protected void createButtons() {
		for (int i = 0; i < 3; i++) {
			int next_x = (GameManager.getInstance().getSketch().width / 4) - 150;
			int next_y = (GameManager.getInstance().getSketch().height / 2) + 80 + (80 * i);
			addButton(
					new Button(getButtonTextGraphics()[i],
							new GraphicLook(new Point(next_x, next_y),
									new Dimension(300, 75), Util.Values.BTN_FILL1,
									Util.Values.BTN_BORDER1),
							getButtonCommands()[i]));
		}
	}
}