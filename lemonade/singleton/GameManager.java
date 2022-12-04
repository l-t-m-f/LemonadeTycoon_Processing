package lemonade.singleton;

import java.util.HashMap;

import lemonade.Sketch;
import lemonade.Util;
import lemonade.enumeration.FontSizeType;
import lemonade.enumeration.FontStyleType;
import lemonade.enumeration.FontFaceType;
import lemonade.widget.counter.FloatCounter;
import lemonade.widget.counter.IntCounter;
import lemonade.widget.view.View;
import lemonade.widget.view.main.*;
import processing.core.PFont;

public class GameManager {

  // Instance fields

  private static GameManager _instance;
  private static boolean _keystrokesResponsiveness;
  private static View[] _mainViews;
  private static Order _order;
  private static int _presentedViewIndex;
  private static Recipe _recipe;
  private static RunningCosts _runningCosts;
  private static Sketch _sketch;
  private static Supplies _supplies;
  private static Wallet _wallet;

  // Constructor

  private GameManager() {
    setMainViews(new View[3]);
    setKeystrokesResponsiveness(true);
    setRecipe(new Recipe());
    setRunningCosts(new RunningCosts());
    setSupplies(new Supplies());
    setWallet(new Wallet());
    setOrder(new Order());
  }

  // Getters

  public static GameManager getInstance() {
    if (_instance == null) {
      setInstance(new GameManager());
    }
    return _instance;
  }

  public boolean getKeystrokesResponsiveness() {
    return _keystrokesResponsiveness;
  }

  public View[] getMainViews() {
    return _mainViews;
  }

  public  Order getOrder() {
    return _order;
  }

  public int getPresentedViewIndex() {
    return _presentedViewIndex;
  }

  public Recipe getRecipe() {
    return _recipe;
  }

  public RunningCosts getRunningCosts() {
    return _runningCosts;
  }

  public Sketch getSketch() {
    return _sketch;
  }

  public  Supplies getSupplies() {
    return _supplies;
  }

  public  Wallet getWallet() {
    return _wallet;
  }

  // Setters

  private static void setInstance(GameManager value) {
    _instance = value;
  }

  public void setKeystrokesResponsiveness(boolean value) {
    _keystrokesResponsiveness = value;
  }

  public void setMainViews(View[] value) {
    _mainViews = value;
  }

  public void setOrder(Order value) {
    _order = value;
  }

  public void setPresentedViewIndex(int value) {
    _presentedViewIndex = value;
  }

  public void setRecipe(Recipe value) {
    _recipe = value;
  }

  public void setRunningCosts(RunningCosts value) {
    _runningCosts = value;
  }

  public void setSketch(Sketch value) {
    _sketch = value;
  }

  public void setSupplies(Supplies value) {
    _supplies = value;
  }

  public void setWallet(Wallet value) {
    _wallet = value;
  }

  // Class methods

  public void createMainViews() {
    getMainViews()[0] = new Menu();
    getMainViews()[1] = new Prepare();
    getMainViews()[2] = new Game();
  }

  public void drawCurrentScene() {
    getPresentedMainView().draw();
  }

  public View getPresentedMainView() {
    return getMainViews()[getPresentedViewIndex()];
  }

  // Sketch mixin methods

  public void boxedPrintToScreen(String text, int x1, int y1, int x2, int y2) {
    getSketch().text(text, x1, y1, x2, y2);
  }

  public PFont getFont(FontFaceType font, FontStyleType style, FontSizeType size) {
    return getFonts().get(font).get(style)[size.ordinal() - 1];
  }

  private HashMap<FontFaceType, HashMap<FontStyleType, PFont[]>> getFonts() {
    return getSketch().getFonts();
  } 

  public void printToScreen(String text, int x, int y) {
    getSketch().text(text, x, y);
  }

  public void setSketchFill(int color) {
    getSketch().fill(color);
  }

  public void setSketchNoStroke() {
    getSketch().noStroke();
  }

  public void setSketchTextFont(PFont font) {
    getSketch().textFont(font);
  }

  public void setSketchTextFontAndScale(PFont font, double scale) {
    int newSize = (int)(font.getDefaultSize() * scale);
    getSketch().textFont(font, newSize);
  }
  
  // Inner classes

  public class Recipe {

    // Instance fields

    private IntCounter _lemons;
    private IntCounter _sugar;
    private IntCounter _ice;
    private FloatCounter _cupPrice;

    // Constructor

    public Recipe() {
      setLemons(new IntCounter(Util.Values.DEFAULT_LEMON_RECIPE, Util.Values.MAX_LEMON_RECIPE));
      setSugar(new IntCounter(Util.Values.DEFAULT_SUGAR_RECIPE, Util.Values.MAX_SUGAR_RECIPE));
      setIce(new IntCounter(Util.Values.DEFAULT_ICE_RECIPE, Util.Values.MAX_ICE_RECIPE));
      setCupPrice(new FloatCounter(Util.Values.DEFAULT_CUP_PRICE, Util.Values.MAX_CUP_PRICE));
    }

    // Getters

    public IntCounter getLemons() {
      return this._lemons;
    }

    public IntCounter getSugar() {
      return this._sugar;
    }

    public IntCounter getIce() {
      return this._ice;
    }

    public FloatCounter getCupPrice() {
      return this._cupPrice;
    }

    // Setters

    private void setLemons(IntCounter value) {
      this._lemons = value;
    }

    private void setSugar(IntCounter value) {
      this._sugar = value;
    }

    private void setIce(IntCounter value) {
      this._ice = value;
    }

    private void setCupPrice(FloatCounter value) {
      this._cupPrice = value;
    }
  }

  public class RunningCosts {

    private float _rentCost;
    private float _advertisementCost;
    private float _hiringCost;

    public RunningCosts() {

    }

  }

  public class Order {

    public Order() {
      IntCounter[] lemonCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999),
          new IntCounter(0, 9999) };
      IntCounter[] sugarCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999), new IntCounter(0, 9999) };
      IntCounter[] iceCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999), new IntCounter(0, 9999) };
      IntCounter[] cupsCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999), new IntCounter(0, 9999) };

      setLemonsCounters(lemonCounters);
      setSugarCounters(sugarCounters);
      setIceCounters(iceCounters);
      setCupsCounters(cupsCounters);

      setTotal(new FloatCounter(0, 999));
    }

    private IntCounter[] _lemonCounters;
    private IntCounter[] _sugarCounters;
    private IntCounter[] _iceCounters;
    private IntCounter[] _cupsCounters;
    private FloatCounter _total;

    public IntCounter[] getLemonCounters() {
      return this._lemonCounters;
    }

    public IntCounter[] getSugarCounters() {
      return this._sugarCounters;
    }

    public IntCounter[] getIceCounters() {
      return this._iceCounters;
    }

    public IntCounter[] getCupsCounters() {
      return this._cupsCounters;
    }

    public FloatCounter getTotal() {
      return this._total;
    }

    private void setLemonsCounters(IntCounter[] value) {
      this._lemonCounters = value;
    }

    private void setSugarCounters(IntCounter[] value) {
      this._sugarCounters = value;
    }

    private void setIceCounters(IntCounter[] value) {
      this._iceCounters = value;
    }

    private void setCupsCounters(IntCounter[] value) {
      this._cupsCounters = value;
    }

    private void setTotal(FloatCounter value) {
      this._total = value;
    }

    //

    public void reset() {
      getLemonCounters()[0].reset();
      getLemonCounters()[1].reset();
      getLemonCounters()[2].reset();
    }

    public int getLemonsTotal() {
      IntCounter[] lemons = getLemonCounters();
      int count12 = lemons[0].getCount();
      int count24 = lemons[1].getCount();
      int count48 = lemons[2].getCount();
      int total = count12 + count24 + count48;
      return total;
    }

  }

  public class Supplies {

    // Instance fields

    private IntCounter _lemons;
    private IntCounter _sugar;
    private IntCounter _ice;
    private IntCounter _cups;

    // Constructor

    public Supplies() {
      setLemons(new IntCounter(Util.Values.DEFAULT_LEMON_SUPPLIES, Util.Values.MAX_LEMON_SUPPLIES));
      setSugar(new IntCounter(Util.Values.DEFAULT_SUGAR_SUPPLIES, Util.Values.MAX_SUGAR_SUPPLIES));
      setIce(new IntCounter(Util.Values.DEFAULT_ICE_SUPPLIES, Util.Values.MAX_ICE_SUPPLIES));
      setCups(new IntCounter(Util.Values.DEFAULT_CUP_SUPPLIES, Util.Values.MAX_CUP_SUPPLIES));
    }

    // Getters

    public IntCounter getLemons() {
      return this._lemons;
    }

    public IntCounter getSugar() {
      return this._sugar;
    }

    public IntCounter getIce() {
      return this._ice;
    }

    public IntCounter getCups() {
      return this._cups;
    }

    // Setters

    private void setLemons(IntCounter value) {
      this._lemons = value;
    }

    private void setSugar(IntCounter value) {
      this._sugar = value;
    }

    private void setIce(IntCounter value) {
      this._ice = value;
    }

    private void setCups(IntCounter value) {
      this._cups = value;
    }

  }

  public class Wallet {

    // Instance field

    private FloatCounter _cash;

    // Constructor

    public Wallet() {
      setCash(new FloatCounter(Util.Values.DEFAULT_WALLET_CASH, Util.Values.MAX_WALLET_CASH));
    }

    // Getters

    public FloatCounter getCash() {
      return this._cash;
    }

    // Setters

    private void setCash(FloatCounter value) {
      this._cash = value;
    }

    // Class methods

    public boolean hasEnoughFor(double value) {
      if (getCash().getCount() > value) {
        return true;
      } else {
        return false;
      }
    }

  }

}