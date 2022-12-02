package lemonade.widget.view.inner;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import lemonade.Util;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import processing.core.PImage;

public class Locations extends View {

  private static ArrayList<Location> _locations = new ArrayList<>(10);

  public Locations(GraphicLook graphicLook) {
    super("Locations", graphicLook);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing() });
    setVisibility(true);
    createButtons();
    createStaticContent();
    createTextVariables();
  }

  public ArrayList<Location> getLocations() {
    return _locations;
  }

  @Override
  public void createButtons() {
    Point position = Util.addPoint(new Point(384, 116), getPosition());
    addButton(
        new Button(
            new GraphicLook(position, new Dimension(28, 28), Util.Values.BTN_FILL1,
                Util.Values.BTN_BORDER1),
            new ButtonCommand.DoNothing()));
  }

  @Override
  public void createStaticContent() {
    getLocations().add(new Location("The Suburbs"));
    getLocations().add(new Location("The Park"));
    getLocations().add(new Location("Downtown"));
    getLocations().add(new Location("The Train Station"));
    getLocations().add(new Location("The Beach"));
    getLocations().add(new Location("The Mall"));
    getLocations().add(new Location("The Marina"));
    getLocations().add(new Location("The Old Square"));
    getLocations().add(new Location("The Magic Gardens"));
    getLocations().add(new Location("The Hexa-Stad"));
  }

  protected void createTextBlocks() {}

  protected void createTextVariables() {
  
      Point position = Util.addPoint(new Point(100, 15), getPosition());
      addTextVariable(new TextVariable(position, 0xFFFFFFFF, 24));
    
  }

  protected void refreshTextVariables() {
    updateTextVariable(0, "" + getLocations().get(0).getTitle());
  }

  class Location {

    // Class fields

    private String _title = "";
    private String _tagline = "";
    private String _longdesc = "";
    private double _popularity = -1.0;
    private double _satisfaction = -1.0;
    private double _price = -1.0;
    private PImage _image;

    // Constructor(s)

    public Location(String title) {
      
      setTitle(title);
      setTagline(Util.Values.LocationTaglines.get(title));

      setPopularity(Util.Values.LocationPopularity.get(title).doubleValue());
      setSatisfaction(Util.Values.LocationSatisfaction.get(title).doubleValue());
      setPrice(Util.Values.LocationPrice.get(title).doubleValue());
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

    public double getPrice() {
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

    private void setPrice(double value) {
      this._price = value;
    }

    private void setImage(PImage value) {
      this._image = value;
    }

    // Class methods

  }

}