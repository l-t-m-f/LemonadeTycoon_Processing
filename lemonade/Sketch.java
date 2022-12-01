package lemonade;

import java.util.Objects;

import lemonade.singleton.GameManager;
import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {

  // Instance fields

  private PFont[] _fonts;

  // Constructor

  public Sketch() {
  }

  // Getters

  public PFont[] getFonts() {
    return this._fonts;
  }

  // Setters

  public void setFonts(PFont[] value) {
    this._fonts = value;
  }

  // Class methods

  @Override
  public void settings() {
    size(1280, 720);
  }

  @Override
  public void setup() {
    initializeFonts();
    GameManager.getInstance().setSketch(this);
    GameManager.getInstance().createMainViews();
  }

  @Override
  public void draw() {
    if (Objects.isNull(GameManager.getInstance()) == false) {
      GameManager.getInstance().drawCurrentScene();
    }
  }

  @Override
  public void mouseReleased() {
    GameManager.getInstance().setKeystrokesResponsiveness(true);
  }

  public void initializeFonts() {
    setFonts(new PFont[3]);
    getFonts()[0] = createFont("Arial", 48);
    getFonts()[1] = createFont("Arial", 24);
    getFonts()[2] = createFont("Arial", 12);
  }

  // Driver code

  public static void main(String[] args) {
    PApplet.main(new String[] { "--present", "lemonade.Sketch" });
  }

}