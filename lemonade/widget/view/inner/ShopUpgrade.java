package lemonade.widget.view.inner;

import java.awt.Point;
import java.text.DecimalFormat;
import java.awt.Dimension;
import java.util.ArrayList;
import lemonade.Util;
import lemonade.enumeration.UpgradeType;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;
import processing.core.PImage;

public class ShopUpgrade extends View {

  // Class fields

  private static int _presentedUpgradeIndex = 0;
  private static ArrayList<Upgrade> _upgrades = new ArrayList<>(14);

  // Instance fields
  // None

  // Constructor(s)

  public ShopUpgrade(GraphicLook graphicLook) {
    super("Item", graphicLook);
    setButtonCommands(new Runnable[] { new ButtonCommand.DoNothing() });
    createButtons();
    createStaticContent();
    createTextVariables();
    setVisibility(true);
  }

  // Getters

  public static int getPresentedUpgradeIndex() {
    return _presentedUpgradeIndex;
  }

  public ArrayList<Upgrade> getUpgrades() {
    return _upgrades;
  }

  // Setters

  public static void setPresentedUpgradeIndex(int value) {
    _presentedUpgradeIndex = value;
  }

  // Class methods

  @Override
  public void createButtons() {

    int buttonMarginLeft = 220;
    int buttonMarginTop = 104;

    Point position = Util.addPoint(new Point(buttonMarginLeft, buttonMarginTop), getPosition());
    addButton(
        new Button(
            new GraphicLook(position, new Dimension(28, 28), Util.Values.BTN_FILL1,
                Util.Values.BTN_BORDER1),
            new ButtonCommand.DoNothing()));
  }

  @Override
  public void createStaticContent() {
    getUpgrades().add(new Upgrade(UpgradeType.HIGH_OUTPUT_CITRUS_JUICER));
    getUpgrades().add(new Upgrade(UpgradeType.SHADE_MAKER_3000_CANOPY));
    getUpgrades().add(new Upgrade(UpgradeType.MIRACLE_9000_POWER_JUICER));
    getUpgrades().add(new Upgrade(UpgradeType.EZSERVE_CASH_REGISTER));
    getUpgrades().add(new Upgrade(UpgradeType.MR_FRIDGE));
    getUpgrades().add(new Upgrade(UpgradeType.ICE_O_MATIC_ICE_DISPENSER));
    getUpgrades().add(new Upgrade(UpgradeType.CLASSIC_STAND));
    getUpgrades().add(new Upgrade(UpgradeType.HIGH_FIVE_SOUND_SYSTEM));
    getUpgrades().add(new Upgrade(UpgradeType.LEMON_STAND));
    getUpgrades().add(new Upgrade(UpgradeType.BRIGHT_LIGHTS_NEON_SYSTEM));
    getUpgrades().add(new Upgrade(UpgradeType.TAKE2_LEMONADE_DISPENSER));
    getUpgrades().add(new Upgrade(UpgradeType.HIGH_OUTPUT_AUTOMATIC_ICE_MAKER));
    getUpgrades().add(new Upgrade(UpgradeType.CASTLE_STAND));
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

    DecimalFormat df = new DecimalFormat("0.00");

    updateTextVariable(0, "" + getUpgrades().get(getPresentedUpgradeIndex()).getTitle());
    updateTextVariable(1, "" + getUpgrades().get(getPresentedUpgradeIndex()).getTagline());
    updateTextVariable(2, "$ " + df.format(getUpgrades().get(getPresentedUpgradeIndex()).getPrice()));
  }

  // Inner classes

  class Upgrade {

    // Class fields

    private String _name = "";
    private String _tagline = "";
    private String _longdesc = "";
    private double _price = -1.0;
    private PImage _image;

    // Constructor(s)

    public Upgrade(UpgradeType upgradeType) {

      setTitle(Util.Values.UpgradeNames.get(upgradeType));
      setTagline(Util.Values.UpgradeTaglines.get(upgradeType));
      setPrice(Util.Values.UpgradePrices.get(upgradeType).floatValue());

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
