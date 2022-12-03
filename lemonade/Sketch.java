package lemonade;

import java.util.HashMap;
import java.util.Objects;

import lemonade.enumeration.FontStyleType;
import lemonade.enumeration.FontFaceType;
import lemonade.enumeration.FontSizeType;
import lemonade.singleton.GameManager;
import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {

  // Instance fields

  private HashMap<FontFaceType, HashMap<FontStyleType, PFont[]>> _fonts;

  // Constructor

  public Sketch() {
  }

  // Getters

  public HashMap<FontFaceType, HashMap<FontStyleType, PFont[]>> getFonts() {
    return this._fonts;
  }

  // Setters

  public void setFonts(HashMap<FontFaceType, HashMap<FontStyleType, PFont[]>> value) {
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
    setFonts(new HashMap<>(3));
    getFonts().put(FontFaceType.HACK, new HashMap<>(1));
    PFont[] fontArray = new PFont[5];
    for(int i = 0; i < FontSizeType.MAX_FONT_SIZE.ordinal() - 1; i++) {
      fontArray[i] = createFont("Hack Bold", Util.Values.TEXT_DEFAULT_SIZES[i]);
    }
    getFonts().get(FontFaceType.HACK).put(FontStyleType.BOLD, fontArray);
    
    /*for(String f : PFont.list()) {
      System.out.println(f);
    }*/
  }

  // Driver code

  public static void main(String[] args) {
    PApplet.main(new String[] { "--present", "lemonade.Sketch" });
  }

}