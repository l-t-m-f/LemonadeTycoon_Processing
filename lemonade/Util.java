package lemonade;

import java.awt.Point;
import java.util.HashMap;

import lemonade.enumeration.LocationType;

public class Util {

  public static Point addPoint(Point p1, Point p2) {
    int px = p1.x + p2.x;
    int py = p1.y + p2.y;
    return new Point(px, py);
  }

  public static class Values {

    public static final int black = 0xFF000000;
    public static final int white = 0xFFFFFFFF;
    public static final int red = 0xFFFF0000;
    public static final int lime = 0xFF00FF00;
    public static final int blue = 0xFF0000FF;
    public static final int yellow = 0xFFFFFF00;
    public static final int cyan = 0xFF00FFFF;
    public static final int magenta = 0xFFFF00FF;
    public static final int silver = 0xFFC0C0C0;
    public static final int gray = 0xFF808080;
    public static final int darkgray = 0xFF303030;
    public static final int maroon = 0xFF800000;
    public static final int olive = 0xFF808000;
    public static final int green = 0xFF008000;
    public static final int purple = 0xFF800080;
    public static final int teal = 0xFF008080;
    public static final int mavy = 0xFF000080;

    // int sets constants

    public static final int[] BTN_FILL1 = { magenta, purple, olive };
    public static final int[] BTN_BORDER1 = { magenta, purple, olive };

    
    public static final int[] TEXT_DEFAULT_SIZES = { 10, 12, 16, 24, 48 };
    public static final int TEXT_INTERLINE = 28;
    public static final int TEXT_DEFAULT_FACE_INDEX = 0;
    public static final float TEXT_DEFAULT_SCALE = 1.0f;
    public static final int TEXT_DEFAULT_COLOR = 0xFFFFFFFF;

    public static final float LEMONS_COST_12 = 4.8f;
    public static final float LEMONS_COST_24 = 7.2f;
    public static final float LEMONS_COST_48 = 9.6f;

    public static final float SUGAR_COST_12 = 4.8f;
    public static final float SUGAR_COST_24 = 7.0f;
    public static final float SUGAR_COST_48 = 15.0f;

    public static final float ICE_COST_50 = 1.0f;
    public static final float ICE_COST_200 = 3.0f;
    public static final float ICE_COST_500 = 5.0f;

    public static final float CUPS_COST_75 = 1.0f;
    public static final float CUPS_COST_225 = 2.35f;
    public static final float CUPS_COST_400 = 3.75f;

    // Locations

    public static final double MAX_POPULARITY = 100.0;
    public static final double MAX_SATISFACTION = 100.0;

    public static HashMap<LocationType, Double> LocationPopularity = new HashMap<>() {
      {
        this.put(LocationType.SUBURBS, 15.0);
        this.put(LocationType.PARK, 0.0);
        this.put(LocationType.DOWNTOWN, 0.0);
        this.put(LocationType.TRAIN_STATION, 0.0);
        this.put(LocationType.BEACH, 0.0);
        this.put(LocationType.MALL, 0.0);
        this.put(LocationType.MARINA, 0.0);
        this.put(LocationType.OLD_SQUARE, 0.0);
        this.put(LocationType.MAGIC_GARDENS, 0.0);
        this.put(LocationType.HEXA_STAD, 0.0);
      }
    };

    public static HashMap<LocationType, Double> LocationSatisfaction = new HashMap<>() {
      {
        this.put(LocationType.SUBURBS, 100.0);
        this.put(LocationType.PARK, 100.0);
        this.put(LocationType.DOWNTOWN, 100.0);
        this.put(LocationType.TRAIN_STATION, 100.0);
        this.put(LocationType.BEACH, 100.0);
        this.put(LocationType.MALL, 100.0);
        this.put(LocationType.MARINA, 100.0);
        this.put(LocationType.OLD_SQUARE, 100.0);
        this.put(LocationType.MAGIC_GARDENS, 100.0);
        this.put(LocationType.HEXA_STAD, 100.0);
      }
    };

    public static final HashMap<LocationType, Double> LocationPrice = new HashMap<>() {
      {
        this.put(LocationType.SUBURBS, 0.0);
        this.put(LocationType.PARK, 10.0);
        this.put(LocationType.DOWNTOWN, 30.0);
        this.put(LocationType.TRAIN_STATION, 30.0);
        this.put(LocationType.BEACH, 40.0);
        this.put(LocationType.MALL, 50.0);
        this.put(LocationType.MARINA, 50.0);
        this.put(LocationType.OLD_SQUARE, 100.0);
        this.put(LocationType.MAGIC_GARDENS, 100.0);
        this.put(LocationType.HEXA_STAD, 150.0);
      }
    };

    public static final HashMap<LocationType, String> LocationTitles = new HashMap<>() {
      {
        this.put(LocationType.SUBURBS, "The Suburbs");
        this.put(LocationType.PARK, "The Park");
        this.put(LocationType.DOWNTOWN, "Downtown");
        this.put(LocationType.TRAIN_STATION, "The Train Station");
        this.put(LocationType.BEACH, "The Beach");
        this.put(LocationType.MALL, "The Mall");
        this.put(LocationType.MARINA, "The Marina");
        this.put(LocationType.OLD_SQUARE, "The Old Square");
        this.put(LocationType.MAGIC_GARDENS, "The Magic Gardens");
        this.put(LocationType.HEXA_STAD, "The Hexa-Stad");
      }
    };

    public static final HashMap<LocationType, String> LocationTaglines = new HashMap<>() {
      {
        this.put(LocationType.SUBURBS, "Your very own neighborhood!");
        this.put(LocationType.PARK, "Kids love lemonade!");
        this.put(LocationType.DOWNTOWN, "Now it's time to get serious");
        this.put(LocationType.TRAIN_STATION, "Catch the commuters");
        this.put(LocationType.BEACH, "Hot spot for sunny days!");
        this.put(LocationType.MALL, "Welcome to consumer's heaven!");
        this.put(LocationType.MARINA, "Sell to the rich and famous.");
        this.put(LocationType.OLD_SQUARE, "Show the tourists some hospitality.");
        this.put(LocationType.MAGIC_GARDENS, "Are you big enough for this small world?");
        this.put(LocationType.HEXA_STAD, "Meet them at the ballgame.");
      }
    };

    public static String[] StringPool = 
    {
      
      "Choose a location.",    
    };

  }

}