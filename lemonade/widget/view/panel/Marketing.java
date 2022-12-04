package lemonade.widget.view.panel;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextGraphic;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import lemonade.widget.view.ViewLayout;

import java.awt.Dimension;
import java.awt.Point;
import java.text.DecimalFormat;

public class Marketing extends View {

  // Class fields

  private static float _presentedCupPrice = 1.00f;
  private static float _presentedAdvertisementCost = 0.00f;

  // Instance fields
  // None

  // Constructor(s)

  public Marketing(GraphicLook graphics) {
    super("Marketing", graphics);
    setVisibility(false);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.DoNothing(),
        new ButtonCommand.DoNothing()
    });
    configureLayout();
    createButtons();
    createSubviews();
    createTextGraphics();
    createTextVariables();
  }

  // Getters

  public float getPresentedCupPrice() {
    return _presentedCupPrice;
  }

  public float getPresentedAdvertisementCost() {
    return _presentedAdvertisementCost;
  }

  // Setters

  public void setPresentedCupPrice(float value) {
    _presentedCupPrice = value;
  }

  public void setPresentedAdvertisementCost(float value) {
    _presentedAdvertisementCost = value;
  }

  // Class methods

  @Override
  protected void configureLayout() {
    setLayout(new ViewLayout(2, 2, 2, 0, 1, 3, 1));
    getLayout().setHeaderGroupMargins(0, 15, 15);
    getLayout().setHeaderGroupMargins(1, 15, 232);
  }

  @Override
  protected void createButtons() {
    Point position1 = Util.addPoint(new Point(50, 135), getPosition());
    Point position2 = Util.addPoint(new Point(250, 135), getPosition());
    Point position3 = Util.addPoint(new Point(50, 348), getPosition());
    Point position4 = Util.addPoint(new Point(250, 348), getPosition());
    addButton(
        new Button(
            new GraphicLook(position1, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(position2, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[1]));
    addButton(
        new Button(
            new GraphicLook(position3, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[0]));
    addButton(
        new Button(
            new GraphicLook(position4, new Dimension(70, 30), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
            getButtonCommands()[1]));
  }

  @Override
  protected void createTextGraphics() {

    createCupPriceTextGraphics();
    createAdvertisementTextGraphics();
  }

  private void createCupPriceTextGraphics() {

    Point position1 = Util.addPoint(new Point(getLayout().getButtonMarginLeft(0), getLayout().getButtonMarginTop(0)), getPosition());
    addTextBlock(new TextGraphic("Price", position1));

    Point position2 = Util.addPoint(new Point(getLayout().getButtonMarginLeft(0), 55), getPosition());
    TextGraphic preparedTextBlock1 = new TextGraphic(
        "Skills, instinct, judgement, luck... Do you have what it takes to set the perfect price?", position2);
    preparedTextBlock1.setWrapBox(new Dimension(485, 85));
    addTextBlock(preparedTextBlock1);
  }

  private void createAdvertisementTextGraphics() {
    Point position3 = Util.addPoint(new Point(getLayout().getButtonMarginLeft(1), getLayout().getButtonMarginTop(1)), getPosition());
    addTextBlock(new TextGraphic("Advertising", position3));

    Point position4 = Util.addPoint(new Point(getLayout().getButtonMarginLeft(1), 255), getPosition());
    TextGraphic preparedTextBlock2 = new TextGraphic(
        "When your reputation needs a little boost, spending a few dollars here can really make the difference by attracting more customers to your stand.",
        position4);
    preparedTextBlock2.setWrapBox(new Dimension(485, 85));
    addTextBlock(preparedTextBlock2);
  }

  @Override
  protected void createTextVariables() {

    int countersMarginLeft = 50;
    int priceCounterMarginTop = 30;
    int advertisementCounterMarginTop = 30;

    Point priceCounterPosition = Util.addPoint(new Point(countersMarginLeft, priceCounterMarginTop), getPosition());
    Point advertisementCounterPosition = Util.addPoint(new Point(countersMarginLeft, advertisementCounterMarginTop),
        getPosition());

    addTextVariable(new TextVariable(priceCounterPosition));
    addTextVariable(new TextVariable(advertisementCounterPosition));

  }

  @Override
  protected void refreshTextVariables() {
    DecimalFormat df = new DecimalFormat("0.00");
    updateTextVariable(0, df.format(getPresentedCupPrice()));
  }
}