package lemonade.widget.view.panel;

import java.awt.Dimension;
import java.awt.Point;
import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.view.View;
import lemonade.widget.view.ViewLayout;
import lemonade.widget.view.inner.Locations;

public class Rent extends View {

  // Class fields
  // one

  // Instance fields
  // None

  // Constructor(s)

  public Rent(GraphicLook graphics) {
    super("Rent", graphics);
    setVisibility(false);
    setButtonCommands(
        new Runnable[] {
            new ButtonCommand.PreviousLocation(),
            new ButtonCommand.NextLocation(),
            new ButtonCommand.RentLocation()
        });
    configureLayout();
    createButtons();
    createSubviews();
    createTextGraphics();
  }

  // Class methods

  @Override
  protected void configureLayout() {

    setLayout(new ViewLayout(2, 1, 1, 0, 0, 0, 1));

    getLayout().setButtonGroupMargins(0, 13, 160);
    getLayout().setButtonGroupMargins(1, 378, 362);

    getLayout().setFlavorTextGroupMargins(0, 75, 55);

    getLayout().setHeaderGroupMargins(0, 75, 32);

    getLayout().setSubviewGroupMargins(0, 57, 155);

  }

  @Override
  protected void createButtons() {

    Point previousLocationButtonPosition = 
      Util.addPoint(new Point(getLayout().getButtonMarginLeft(0), getLayout().getButtonMarginTop(0)), 
        getPosition());
    Point nextLocationButtonPosition = 
      Util.addPoint(new Point(getLayout().getButtonMarginLeft(0) + 514, getLayout().getButtonMarginTop(0)), 
        getPosition());
    Point rentLocationButtonPosition = 
      Util.addPoint(new Point(getLayout().getButtonMarginLeft(1), getLayout().getButtonMarginTop(1)),
        getPosition());
    Dimension buttonDimensionTypeA =
      new Dimension(40, 70);
    Dimension buttonDimensionTypeB =
      new Dimension(120, 50);

    addButton(new Button(new GraphicLook(previousLocationButtonPosition, buttonDimensionTypeA, Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
      getButtonCommands()[0]));
    addButton(new Button(new GraphicLook(nextLocationButtonPosition, buttonDimensionTypeA, Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
      getButtonCommands()[1]));

    addButton(new Button(new TextGraphic("Rent"),
      new GraphicLook(rentLocationButtonPosition, buttonDimensionTypeB, Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
      getButtonCommands()[2]));
  }

  @Override
  protected void createSubviews() {

    Point subviewPosition = 
      Util.addPoint(new Point(getLayout().getSubviewMarginLeft(0), getLayout().getSubviewMarginTop(0)),
      getPosition());
    Dimension subviewDimension =
      new Dimension(465, 194);

    GraphicLook graphicLook = new GraphicLook(subviewPosition, subviewDimension, 0x3300FFFF);

    addSubview(new Locations(graphicLook));
  }

  @Override
  protected void createTextGraphics() {

    Point headerPosition = 
      Util.addPoint(new Point(getLayout().getHeaderMarginLeft(0), getLayout().getHeaderMarginTop(0)),
        getPosition());    
    Point flavorTextPosition = 
      Util.addPoint(new Point(getLayout().getFlavorTextMarginLeft(0), getLayout().getFlavorTextMarginTop(0)), 
        getPosition());

    addTextBlock(new TextGraphic("Locations", headerPosition));
    addTextBlock(new TextGraphic("Choose a location.", flavorTextPosition));
  }
}