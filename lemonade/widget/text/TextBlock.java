package lemonade.widget.text;

import lemonade.singleton.GameManager;
import java.awt.Point;

public class TextBlock {

  // Instance fields

  private Point _position;

  private String _content; // text

  private int _caseSize;
  private int _caseColor;

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

  // Class methods

  public void draw() {
    GameManager.getInstance().getSketch().noStroke();
    GameManager.getInstance().getSketch().fill(getCaseColor());
    GameManager.getInstance().getSketch().textFont(GameManager.getInstance().getSketch().getFonts()[2], getCaseSize());
    int placementX = getPosition().x;
    int placementY = getPosition().y;
    GameManager.getInstance().getSketch().text(getContent(), placementX, placementY);
  }

}