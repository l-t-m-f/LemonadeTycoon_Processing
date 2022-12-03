package lemonade.widget.text;

import lemonade.singleton.GameManager;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Objects;

public class TextBlock {

  // Instance fields

  private Point _position;

  private String _content; // text

  private int _caseSize;
  private int _caseColor;

  private Dimension _wrapBox;

  // Constructors

  public TextBlock(String content, Point position) {
    setContent(content);
    setPosition(position);
    setCaseSize(24);
  }

  public TextBlock(String content, Point position, int caseColor) {
    setContent(content);
    setPosition(position);
    setCaseColor(caseColor);
    setCaseSize(24);
  }

  public TextBlock(String content, Point position, int caseColor, int caseSize) {
    setContent(content);
    setPosition(position);
    setCaseColor(caseColor);
    setCaseSize(caseSize);

  }

  // Getters

  public Point getPosition() {
    return this._position;
  }

  public String getContent() {
    return this._content;
  }

  public int getCaseSize() {
    return this._caseSize;
  }

  public int getCaseColor() {
    return this._caseColor;
  }

  public Dimension getWrapBox() {
    return this._wrapBox;
  }

  // Setters

  public void setPosition(Point value) {
    this._position = value;
  }

  public void setContent(String value) {
    this._content = value;
  }

  public void setCaseSize(int value) {
    this._caseSize = value;
  }

  public void setCaseColor(int value) {
    this._caseColor = value;
  }

  public void setWrapBox(Dimension value) {
    this._wrapBox = value;
  }

  // Class methods

  public void draw() {
    GameManager.getInstance().setSketchNoStroke();
    GameManager.getInstance().setSketchFill(getCaseColor());
    GameManager.getInstance().setSketchTextFont(2, 18);
    int posX = getPosition().x;
    int posY = getPosition().y;
    if (Objects.isNull(getWrapBox()) == false) {
      GameManager.getInstance().getSketch().text(getContent(), posX, posY,
          getWrapBox().width,
          getWrapBox().height);
    } else {
      GameManager.getInstance().getSketch().text(getContent(), posX, posY);
    }
  }

}