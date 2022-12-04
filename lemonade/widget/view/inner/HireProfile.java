package lemonade.widget.view.inner;

import java.awt.Point;
import java.awt.Dimension;
import java.util.ArrayList;
import lemonade.Util;
import lemonade.enumeration.HireType;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import processing.core.PImage;

public class HireProfile extends View {

  // Class fields

  private static int _presentedHireIndex = 0;
  private static ArrayList<Hire> _hires = new ArrayList<>(2);

  public HireProfile(GraphicLook graphicLook) {
    super("Profile", graphicLook);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.DoNothing()
    });
    createButtons();
    createStaticContent();
    createTextVariables();
    setVisibility(true);
  }

  // Getters

  public static int getPresentedHireIndex() {
    return _presentedHireIndex;
  }

  public ArrayList<Hire> getHires() {
    return _hires;
  }

  // Setters

  public static void setPresentedHireIndex(int value) {
    _presentedHireIndex = value;
  }

  // Class methods

  @Override
  public void createButtons() {
    Point position = Util.addPoint(new Point(394, 112), getPosition());
    addButton(
        new Button(
            new GraphicLook(position, new Dimension(28, 28), Util.Values.BTN_FILL1,
                Util.Values.BTN_BORDER1),
            new ButtonCommand.DoNothing()));
  }

  @Override
  public void createStaticContent() {
    getHires().add(new Hire(HireType.MARTINE_THE_CASHIER));
    getHires().add(new Hire(HireType.SIMON_THE_LEMON));
  }

  protected void createTextGraphics() {
  }

  @Override
  protected void createTextVariables() {

    int titleMarginLeft = 70;
    int titleMarginTop = 32;
    int taglineMarginLeft = 24;
    int taglineMarginTop = titleMarginTop + 30;
    int priceMarginLeft = 120;
    int priceMarginTop = taglineMarginTop + 90;

    Point titlePosition = Util.addPoint(new Point(titleMarginLeft, titleMarginTop), getPosition());
    addTextVariable(new TextVariable(titlePosition));

    Point taglinePosition = Util.addPoint(new Point(taglineMarginLeft, taglineMarginTop), getPosition());
    addTextVariable(new TextVariable(taglinePosition));
    getTextVariable(1).setWrapBox(new Dimension(200, 80));

    Point pricePosition = Util.addPoint(new Point(priceMarginLeft, priceMarginTop), getPosition());
    addTextVariable(new TextVariable(pricePosition));
  }

  @Override
  protected void refreshTextVariables() {
    updateTextVariable(0, "" + getHires().get(getPresentedHireIndex()).getTitle());
    updateTextVariable(1, "" + getHires().get(getPresentedHireIndex()).getTagline());
    updateTextVariable(2, "$ " + getHires().get(getPresentedHireIndex()).getPrice());
  }

  class Hire {

    // Class fields

    private String _name = "";
    private String _tagline = "";
    private String _longdesc = "";
    private double _price = -1.0;
    private PImage _image;

    // Constructor(s)

    public Hire(HireType hireType) {

      setTitle(Util.Values.HireNames.get(hireType));
      setTagline(Util.Values.HireTaglines.get(hireType));
      setPrice(Util.Values.HirePrices.get(hireType).floatValue());

    }

    // Getters

    public String getTitle() {
      return this._name;
    }

    public String getTagline() {
      return this._tagline;
    }

    public String getLongDesc() {
      return this._longdesc;
    }

    public double getPrice() {
      return this._price;
    }

    public PImage getImage() {
      return this._image;
    }

    // Setters

    private void setTitle(String value) {
      this._name = value;
    }

    private void setTagline(String value) {
      this._tagline = value;
    }

    private void setLongDesc(String value) {
      this._longdesc = value;
    }

    private void setPrice(double value) {
      this._price = value;
    }

    private void setImage(PImage value) {
      this._image = value;
    }
  }
}