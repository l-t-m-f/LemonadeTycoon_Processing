package src.widget.view.concrete;
public class MainMenuView extends View {

    public MainMenuView() {
        super("MainMenu", new GraphicLook(new Point(0, 0), new Dimension(width, height), CONST.lime), new Point(0, 0));
        setButtonLabels(new String[] { "Play", "Options", "Quit" });
        setButtonCommands(new Runnable[] {
                new ButtonCommandPlay(),
                new ButtonCommandNothing(),
                new ButtonCommandNothing()
        });
        setVisibility(true);
        createButtons();
    }

    @Override
    protected void createButtons() {
        for (int i = 0; i < 3; i++) {
            int next_x = (width / 4) - 150;
            int next_y = (height / 2) + 80 + (80 * i);
            addButton(
                    new Button(getButtonLabels()[i],
                            new GraphicLook(new Point(0, 0), new Dimension(300, 75), CONST.BTN_FILL1,
                                    CONST.BTN_BORDER1),
                            new Point(next_x, next_y),
                            getButtonCommands()[i]));
        }
    }
}