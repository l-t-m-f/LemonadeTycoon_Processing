package src.singleton;

import processing.core.PApplet;
import counter.IntCounter;
import counter.DoubleCounter;

public final class GameManager extends Singleton {

  // Instance fields

  private int _currentMainViewIndex;

  private static boolean _keystrokesResponsiveness;
  private static PApplet _sketch;
  private static GUI _gui;

  private Recipe _recipe;
  private Supplies _supplies;
  private Wallet _wallet;

  // Constructor

  private GameManager(PApplet sketch) {
    super();
    setSketch(sketch);
    setGUI(new GUI());
    setKeystrokesResponsiveness(true);
    setRecipe(new Recipe(4, 2, 2));
    setSupplies(new Supplies(0, 0, 0, 0));
    setWallet(new Wallet(40.0));
  }

  // Getters

  public int getCurrentMainViewIndex() {
    return this._currentMainViewIndex;
  }

  public static boolean getKeystrokesResponsiveness() {
    return _keystrokesResponsiveness;
  }

  public static GUI getGUI() {
    return _gui;
  }

  public Recipe getRecipe() {
    return this._recipe;
  }

  public Supplies getSupplies() {
    return this._supplies;
  }

  public Wallet getWallet() {
    return this._wallet;
  }

  public static PApplet getSketch() {
    return _sketch;
  }

  // Setters

  public void setCurrentMainViewIndex(int value) {
    this._currentMainViewIndex = value;
  }

  public void setKeystrokesResponsiveness(boolean value) {
    _keystrokesResponsiveness = value;
  }

  public static void setGUI(GUI value) {
    _gui = value;
  }

  public void setRecipe(Recipe value) {
    this._recipe = value;
  }

  public void setSupplies(Supplies value) {
    this._supplies = value;
  }

  public void setWallet(Wallet value) {
    this._wallet = value;
  }

  public static void setSketch(PApplet value) {
    _sketch = value;
  }

  // Mixin methods

  public void createGUIViews() {
    getGUI().createMainViews();
  }

  public View getMainView(int index) {
    return getGUI().getMainView(index);
  }

  public View getCurrentMainView() {
    return getMainView(getCurrentMainViewIndex());
  }

  // Class methods

  public void drawCurrentScene() {
    getSketch().background(200);
    getCurrentMainView().draw();
  }

  // Inner classes

  class Recipe {

    // Instance fields

    private IntCounter _lemons;
    private IntCounter _sugar;
    private IntCounter _ice;

    // Constructor

    public Recipe(final int defaultLemonCount, final int defaultSugarCount, final int defaultIceCount) {
      setLemons(new IntCounter(defaultLemonCount, 20));
      setSugar(new IntCounter(defaultSugarCount, 10));
      setIce(new IntCounter(defaultIceCount, 7));
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
  }

  class Supplies {

    // Instance fields

    private IntCounter _lemons;
    private IntCounter _sugar;
    private IntCounter _ice;
    private IntCounter _cups;

    private IntCounter[] _lemonsPreSale;
    private IntCounter[] _sugarPreSale;
    private IntCounter[] _icePreSale;
    private IntCounter[] _cupsPreSale;

    // Constructor

    public Supplies(final int defaultLemons, final int defaultSugar, final int defaultIce, final int defaultCups) {
      setLemons(new IntCounter(defaultLemons, 999));
      setSugar(new IntCounter(defaultSugar, 999));
      setIce(new IntCounter(defaultIce, 999));
      setCups(new IntCounter(defaultCups, 999));

      IntCounter[] lemonsPreSaleCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999),
          new IntCounter(0, 9999) };
      IntCounter[] sugarPreSaleCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999), new IntCounter(0, 9999) };
      IntCounter[] icePreSaleCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999), new IntCounter(0, 9999) };
      IntCounter[] cupsPreSaleCounters = { new IntCounter(0, 9999), new IntCounter(0, 9999), new IntCounter(0, 9999) };

      setLemonsPreSaleCounters(lemonsPreSaleCounters);
      setSugarPreSaleCounters(sugarPreSaleCounters);
      setIcePreSaleCounters(icePreSaleCounters);
      setCupsPreSaleCounters(cupsPreSaleCounters);
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

    public IntCounter[] getLemonsPreSaleCounters() {
      return this._lemonsPreSale;
    }

    public IntCounter[] getSugarPreSaleCounters() {
      return this._sugarPreSale;
    }

    public IntCounter[] getIcePreSaleCounters() {
      return this._icePreSale;
    }

    public IntCounter[] getCupsPreSaleCounters() {
      return this._cupsPreSale;
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

    private void setLemonsPreSaleCounters(IntCounter[] value) {
      this._lemonsPreSale = value;
    }

    private void setSugarPreSaleCounters(IntCounter[] value) {
      this._sugarPreSale = value;
    }

    private void setIcePreSaleCounters(IntCounter[] value) {
      this._icePreSale = value;
    }

    private void setCupsPreSaleCounters(IntCounter[] value) {
      this._cupsPreSale = value;
    }

  }

  class Wallet {

    // Instance field

    private DoubleCounter _cash;

    // Constructor

    public Wallet(double defaultCash) {
      setCash(new DoubleCounter(defaultCash, 100000.0));
    }

    // Getters

    public DoubleCounter getCash() {
      return this._cash;
    }

    // Setters

    private void setCash(DoubleCounter value) {
      this._cash = value;
    }

  }

}