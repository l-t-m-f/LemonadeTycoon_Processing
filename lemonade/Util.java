package lemonade;

import java.awt.Point;
import java.util.HashMap;

import lemonade.enumeration.HireType;
import lemonade.enumeration.LocationType;
import lemonade.enumeration.UpgradeType;

public class Util {

  public static Point addPoint(Point p1, Point p2) {
    int px = p1.x + p2.x;
    int py = p1.y + p2.y;
    return new Point(px, py);
  }

  public static class Values {

    /* Colors */

    // Color hex codes for convenience

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

    // Color combinations

    public static final int[] BTN_FILL1 = { magenta, purple, olive };
    public static final int[] BTN_BORDER1 = { magenta, purple, olive };

    /* Text constants */
    
    public static final int[] TEXT_DEFAULT_SIZES = { 10, 12, 16, 24, 48 };
    public static final int TEXT_INTERLINE = 28;
    public static final int TEXT_DEFAULT_FACE_INDEX = 0;
    public static final double TEXT_DEFAULT_SCALE = 1.0;
    public static final int TEXT_DEFAULT_COLOR = 0xFFFFFFFF;  

    /* Gameplay Constants */

    // Supplies

    public static final int MIN_LEMON_SUPPLIES = 0;
    public static final int MIN_SUGAR_SUPPLIES = 0;
    public static final int MIN_ICE_SUPPLIES = 0;
    public static final int MIN_CUP_SUPPLIES = 0;

    public static final int DEFAULT_LEMON_SUPPLIES = MIN_LEMON_SUPPLIES;
    public static final int DEFAULT_SUGAR_SUPPLIES = MIN_SUGAR_SUPPLIES;
    public static final int DEFAULT_ICE_SUPPLIES = MIN_ICE_SUPPLIES;
    public static final int DEFAULT_CUP_SUPPLIES = MIN_CUP_SUPPLIES;

    public static final int MAX_LEMON_SUPPLIES = 999;
    public static final int MAX_SUGAR_SUPPLIES = 999;
    public static final int MAX_ICE_SUPPLIES = 999;
    public static final int MAX_CUP_SUPPLIES = 999;

    // Wallet

    public static final float MIN_WALLET_CASH = 0.00f;
    public static final float DEFAULT_WALLET_CASH = 40.00f;
    public static final float MAX_WALLET_CASH = 10000.00f;

    // Marketing

    public static final float MIN_CUP_PRICE = 0.0f;
    public static final float MIN_ADVERTISING_COST = 0.0f;
    
    public static final float DEFAULT_CUP_PRICE = 1.00f;
    public static final float DEFAULT_ADVERTISEMENT_PRICE = MIN_ADVERTISING_COST;

    public static final float MAX_CUP_PRICE = 5.0f;
    public static final float MAX_ADVERTISING_COST = 20.0f;

    // Recipe

    public static final int MIN_LEMON_RECIPE = 0;
    public static final int MIN_SUGAR_RECIPE = 0;
    public static final int MIN_ICE_RECIPE = 0;

    public static final int DEFAULT_LEMON_RECIPE = 4;
    public static final int DEFAULT_SUGAR_RECIPE = 2;
    public static final int DEFAULT_ICE_RECIPE = 2;

    public static final int MAX_LEMON_RECIPE = 20;
    public static final int MAX_SUGAR_RECIPE = 10;
    public static final int MAX_ICE_RECIPE = 7;

    // Purchase constants

    public static final float LEMONS_COST_12 = 4.80f;
    public static final float LEMONS_COST_24 = 7.20f;
    public static final float LEMONS_COST_48 = 9.60f;

    public static final float SUGAR_COST_12 = 4.80f;
    public static final float SUGAR_COST_24 = 7.00f;
    public static final float SUGAR_COST_48 = 15.00f;

    public static final float ICE_COST_50 = 1.00f;
    public static final float ICE_COST_200 = 3.00f;
    public static final float ICE_COST_500 = 5.00f;

    public static final float CUPS_COST_75 = 1.00f;
    public static final float CUPS_COST_225 = 2.35f;
    public static final float CUPS_COST_400 = 3.75f;

    // Locations

    public static final double MAX_POPULARITY = 100.0;
    public static final double MAX_SATISFACTION = 100.0;

    /* HashMaps */
    // Some of the HashMap are not final and should be moved to the gamManager?

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

    public static final HashMap<LocationType, Float> LocationPrice = new HashMap<>() {
      {
        this.put(LocationType.SUBURBS, 0.0f);
        this.put(LocationType.PARK, 10.0f);
        this.put(LocationType.DOWNTOWN, 30.0f);
        this.put(LocationType.TRAIN_STATION, 30.0f);
        this.put(LocationType.BEACH, 40.0f);
        this.put(LocationType.MALL, 50.0f);
        this.put(LocationType.MARINA, 50.0f);
        this.put(LocationType.OLD_SQUARE, 100.0f);
        this.put(LocationType.MAGIC_GARDENS, 100.0f);
        this.put(LocationType.HEXA_STAD, 150.0f);
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

    // Rent

    public static final HashMap<UpgradeType, String> UpgradeNames = new HashMap<>() {
      {
        this.put(UpgradeType.HIGH_OUTPUT_CITRUS_JUICER, "High Output Citrus Juicer");
        this.put(UpgradeType.SHADE_MAKER_3000_CANOPY, "Shape Maker 3000 Canopy");
        this.put(UpgradeType.MIRACLE_9000_POWER_JUICER, "Miracle 9000 Power Juicer");
        this.put(UpgradeType.EZSERVE_CASH_REGISTER, "EZserve Cash Register");
        this.put(UpgradeType.MR_FRIDGE, "Mr. Fridge");
        this.put(UpgradeType.ICE_O_MATIC_ICE_DISPENSER, "Ice-O-Matic Ice Dispenser");
        this.put(UpgradeType.CLASSIC_STAND, "Classic Stand");
        this.put(UpgradeType.HIGH_FIVE_SOUND_SYSTEM, "High-Five Sound System");
        this.put(UpgradeType.LEMON_STAND, "Lemon Stand");
        this.put(UpgradeType.BRIGHT_LIGHTS_NEON_SYSTEM, "Bright Lights Neon System");
        this.put(UpgradeType.TAKE2_LEMONADE_DISPENSER, "Take2 Lemonade Dispenser");
        this.put(UpgradeType.HIGH_OUTPUT_AUTOMATIC_ICE_MAKER, "High Output Automatic Ice Maker");
        this.put(UpgradeType.CASTLE_STAND, "Castle Stand");
      }
    };

    public static final HashMap<UpgradeType, String> UpgradeTaglines = new HashMap<>() {
      {
        this.put(UpgradeType.HIGH_OUTPUT_CITRUS_JUICER, "Get the juice out of your lemons in no time!");
        this.put(UpgradeType.SHADE_MAKER_3000_CANOPY, "Keep your customers cool.");
        this.put(UpgradeType.MIRACLE_9000_POWER_JUICER, "Refill your pitchers at lightning fast speed!");
        this.put(UpgradeType.EZSERVE_CASH_REGISTER, "Speed up your serving process!");
        this.put(UpgradeType.MR_FRIDGE, "Never waste money on spoiled lemons again!");
        this.put(UpgradeType.ICE_O_MATIC_ICE_DISPENSER, "Tired of wasting money on ice cubes every day?");
        this.put(UpgradeType.CLASSIC_STAND, "A classic look for a guaranteed hit!");
        this.put(UpgradeType.HIGH_FIVE_SOUND_SYSTEM, "Have the grooviest music around.");
        this.put(UpgradeType.LEMON_STAND, "The ultimate stand on the market!");
        this.put(UpgradeType.BRIGHT_LIGHTS_NEON_SYSTEM, "Grab their attention.");
        this.put(UpgradeType.TAKE2_LEMONADE_DISPENSER, "Lowers serving time and fills pitchers faster.");
        this.put(UpgradeType.HIGH_OUTPUT_AUTOMATIC_ICE_MAKER, "Never run out of ice again!");
        this.put(UpgradeType.CASTLE_STAND, "More than just lemonade.");
      }
    };

    public static final HashMap<UpgradeType, Float> UpgradePrices = new HashMap<>() {
      {
        this.put(UpgradeType.HIGH_OUTPUT_CITRUS_JUICER, 49.99f);
        this.put(UpgradeType.SHADE_MAKER_3000_CANOPY, 129.99f);
        this.put(UpgradeType.MIRACLE_9000_POWER_JUICER, 149.99f);
        this.put(UpgradeType.EZSERVE_CASH_REGISTER, 249.99f);
        this.put(UpgradeType.MR_FRIDGE, 249.99f);
        this.put(UpgradeType.ICE_O_MATIC_ICE_DISPENSER, 399.99f);
        this.put(UpgradeType.CLASSIC_STAND, 449.99f);
        this.put(UpgradeType.HIGH_FIVE_SOUND_SYSTEM, 799.99f);
        this.put(UpgradeType.LEMON_STAND, 999.99f);
        this.put(UpgradeType.BRIGHT_LIGHTS_NEON_SYSTEM, 1249.99f);
        this.put(UpgradeType.TAKE2_LEMONADE_DISPENSER, 1599.99f);
        this.put(UpgradeType.HIGH_OUTPUT_AUTOMATIC_ICE_MAKER, 2599.99f);
        this.put(UpgradeType.CASTLE_STAND, 9999.99f);
      }
    };

    // Staff

    public static final HashMap<HireType, String> HireNames = new HashMap<>() {
      {
        this.put(HireType.MARTINE_THE_CASHIER, "Martine the Cashier");
        this.put(HireType.SIMON_THE_LEMON, "Simon the Lemon");
      }
    };

    public static final HashMap<HireType, String> HireTaglines = new HashMap<>() {
      {
        this.put(HireType.MARTINE_THE_CASHIER, "Too many people to serve? Call for help!");
        this.put(HireType.SIMON_THE_LEMON, "Keep your clients happy in line.");
      }
    };

    public static final HashMap<HireType, Float> HirePrices = new HashMap<>() {
      {
        this.put(HireType.MARTINE_THE_CASHIER, 60.0f);
        this.put(HireType.SIMON_THE_LEMON, 80.0f);
      }
    };
  }
}