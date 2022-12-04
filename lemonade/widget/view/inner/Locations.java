package lemonade.widget.view.inner;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import lemonade.Util;
import lemonade.enumeration.LocationType;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import processing.core.PImage;

public class Locations extends View {

  // Class fields

  private static int _presentedLocationIndex = 0;
  private static ArrayList<Location> _locations = new ArrayList<>(10);

  // Constructor(s)

  public Locations(GraphicLook graphicLook) {
    super("Locations", graphicLook);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing() });
    setVisibility(true);
    createButtons();
    createStaticContent();
    createTextVariables();
  }

  // Getters

  public static int getPresentedLocationIndex() {
    return _presentedLocationIndex;
  }

  public ArrayList<Location> getLocations() {
    return _locations;
  }

  // Setters

  public static void setPresentedLocationIndex(int value) {
    _presentedLocationIndex = value;
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
    getLocations().add(new Location(LocationType.SUBURBS));
    getLocations().add(new Location(LocationType.PARK));
    getLocations().add(new Location(LocationType.DOWNTOWN));
    getLocations().add(new Location(LocationType.TRAIN_STATION));
    getLocations().add(new Location(LocationType.BEACH));
    getLocations().add(new Location(LocationType.MALL));
    getLocations().add(new Location(LocationType.MARINA));
    getLocations().add(new Location(LocationType.OLD_SQUARE));
    getLocations().add(new Location(LocationType.MAGIC_GARDENS));
    getLocations().add(new Location(LocationType.HEXA_STAD));
  }

  protected void createTextGraphics() {
  }

  @Override
  protected void createTextVariables() {

    Point titlePosition = Util.addPoint(new Point(170, 15), getPosition());
    addTextVariable(new TextVariable(titlePosition));

    Point taglinePosition = Util.addPoint(new Point(170, 35), getPosition());
    addTextVariable(new TextVariable(taglinePosition));
    getTextVariable(1).setWrapBox(new Dimension(200, 80));

    Point pricePosition = Util.addPoint(new Point(332, 168), getPosition());
    addTextVariable(new TextVariable(pricePosition));
  }

  @Override
  protected void refreshTextVariables() {
    updateTextVariable(0, "" + getLocations().get(getPresentedLocationIndex()).getTitle());
    updateTextVariable(1, "" + getLocations().get(getPresentedLocationIndex()).getTagline());
    updateTextVariable(2, "$ " + getLocations().get(getPresentedLocationIndex()).getPrice());
  }

  // Inner classes

  class Location {

    // Instance fields

    private String _title = "";
    private String _tagline = "";
    private String _longdesc = "";
    private double _popularity = -1.0;
    private double _satisfaction = -1.0;
    private float _price = -1.0f;
    private PImage _image;

    // Constructor(s)

    public Location(LocationType locationType) {

      setTitle(Util.Values.LocationTitles.get(locationType));
      setTagline(Util.Values.LocationTaglines.get(locationType));

      setPopularity(Util.Values.LocationPopularity.get(locationType).doubleValue());
      setSatisfaction(Util.Values.LocationSatisfaction.get(locationType).doubleValue());
      setPrice(Util.Values.LocationPrice.get(locationType).floatValue());
    }

    // Getters

    public String getTitle() {
      return this._title;
    }

    public String getTagline() {
      return this._tagline;
    }

    public String getLongDesc() {
      return this._longdesc;
    }

    public double getPopularity() {
      return this._popularity;
    }

    public double getSatisfaction() {
      return this._satisfaction;
    }

    public float getPrice() {
      return this._price;
    }

    public PImage getImage() {
      return this._image;
    }

    // Setters

    private void setTitle(String value) {
      this._title = value;
    }

    private void setTagline(String value) {
      this._tagline = value;
    }

    private void setLongDesc(String value) {
      this._longdesc = value;
    }

    private void setPopularity(double value) {
      this._popularity = value;
    }

    private void setSatisfaction(double value) {
      this._satisfaction = value;
    }

    private void setPrice(float value) {
      this._price = value;
    }

    private void setImage(PImage value) {
      this._image = value;
    }

    // Class methods

  }

}