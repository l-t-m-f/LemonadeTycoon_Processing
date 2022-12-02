package lemonade.singleton;

import lemonade.Sketch;
import lemonade.widget.counter.DoubleCounter;
import lemonade.widget.counter.IntCounter;
import lemonade.widget.view.View;
import lemonade.widget.view.main.*;

public class GameManager {

  // Instance fields

  private static GameManager _instance;
  private static boolean _keystrokesResponsiveness;
  private static View[] _mainViews;
  private static Order _order;
  private static int _presentedViewIndex;
  private static Recipe _recipe;
  private static Sketch _sketch;
  private static Supplies _supplies;
  private static Wallet _wallet;

  // Constructor

  private GameManager() {
    setMainViews(new View[3]);
    setKeystrokesResponsiveness(true);
    setRecipe(new Recipe(4, 2, 2));
    setSupplies(new Supplies(0, 0, 0, 0));
    setWallet(new Wallet(40.0));
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

  public void printToScreen(String text, int x, int y) {
    getSketch().text(text, x, y);
  }

  public void setSketchFill(int color) {
    getSketch().fill(color);
  }

  public void setSketchTextFont(int id) {
    getSketch().textFont(getSketch().getFonts()[id]);
  }
  
  // Inner classes

  public class Recipe {

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

      setTotal(new DoubleCounter(0, 999));
    }

    private IntCounter[] _lemonCounters;
    private IntCounter[] _sugarCounters;
    private IntCounter[] _iceCounters;
    private IntCounter[] _cupsCounters;
    private DoubleCounter _total;

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

    public DoubleCounter getTotal() {
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

    private void setTotal(DoubleCounter value) {
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

    public Supplies(final int defaultLemons, final int defaultSugar, final int defaultIce, final int defaultCups) {
      setLemons(new IntCounter(defaultLemons, 999));
      setSugar(new IntCounter(defaultSugar, 999));
      setIce(new IntCounter(defaultIce, 999));
      setCups(new IntCounter(defaultCups, 999));
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