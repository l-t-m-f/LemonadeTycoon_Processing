package lemonade.widget.text;

import lemonade.Util;
import lemonade.enumeration.FontFaceType;
import lemonade.enumeration.FontSizeType;
import lemonade.enumeration.FontStyleType;
import lemonade.singleton.GameManager;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Objects;

/*
 * TextGraphic: Basic text unit to display within the sketch.
 */
public class TextGraphic {

  // Class fields
  // None

  // Instance fields
  
  private String _content; // text
  private Point _position;
  private TextLook _look;
  private Dimension _wrapBox;

  // Constructors

  public TextGraphic(String content) {
    setContent(content);
    setPosition(new Point(0, 0));
    setLook(new TextLook(
      GameManager.getInstance().getFont(FontFaceType.HACK, FontStyleType.BOLD, FontSizeType.REGULAR), 
      Util.Values.TEXT_DEFAULT_COLOR, 
      Util.Values.TEXT_DEFAULT_SCALE)
    );
  }

  public TextGraphic(String content, Point position) {
    setContent(content);
    setPosition(position);
    setLook(new TextLook(
      GameManager.getInstance().getFont(FontFaceType.HACK, FontStyleType.BOLD, FontSizeType.REGULAR), 
      Util.Values.TEXT_DEFAULT_COLOR, 
      Util.Values.TEXT_DEFAULT_SCALE)
    );
  }

  public TextGraphic(String content, Point position, TextLook look) {
    setContent(content);
    setPosition(position);
    setLook(look);
  }

  // Getters  
  
  public String getContent() {
    return this._content;
  }

  public TextLook getLook() {
    return this._look;
  }

  public Point getPosition() {
    return this._position;
  }  

  public Dimension getWrapBox() {
    return this._wrapBox;
  }

  // Setters
  
  public void setContent(String value) {
    this._content = value;
  }

  public void setLook(TextLook value) {
    this._look = value;
  }

  public void setPosition(Point value) {
    this._position = value;
  }
  public void setWrapBox(Dimension value) {
    this._wrapBox = value;
  }

  // Class methods

  public void draw() {

    GameManager.getInstance().setSketchNoStroke();
    GameManager.getInstance().setSketchFill(getLook().getColor());
    GameManager.getInstance().setSketchTextFontAndScale(getLook().getFont(), getLook().getScale());

    if (Objects.isNull(getWrapBox()) == false) {

      GameManager.getInstance().boxedPrintToScreen(getContent(), getPosition().x, getPosition().y, getWrapBox().width, getWrapBox().height);

    } else {

      GameManager.getInstance().printToScreen(getContent(), getPosition().x, getPosition().y);

    }
  }

}