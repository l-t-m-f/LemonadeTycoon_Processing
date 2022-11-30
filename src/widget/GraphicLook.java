package src.widget;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

public class GraphicLook {

  // Instance fields

  private Point _position;
  private Dimension _dimension;
  private Rectangle _rectangle;
  private int[] _fillColorInfo;
  private int[] _borderColorInfo;
  private boolean _hasFill;
  private boolean _hasBorder;

  // Constructors (multiple)

  // Constructor - Splash int (no border)

  public GraphicLook(Point pos, Dimension dim, int splashColor) {
    setPosition(pos);
    setDimension(dim);
    setFillColorInfo(new int[] { splashColor });
    setBorderColorInfo(new int[] { splashColor });
    setHasFill(true);
    setHasBorder(false);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int splashColor, boolean hasFill) {
    setPosition(pos);
    setDimension(dim);
    setFillColorInfo(new int[] { splashColor });
    setBorderColorInfo(new int[] { splashColor });
    setHasFill(hasFill);
    setHasBorder(false);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int splashColor, boolean hasFill, boolean hasBorder) {
    setPosition(pos);
    setDimension(dim);
    setFillColorInfo(new int[] { splashColor });
    setBorderColorInfo(new int[] { splashColor });
    setHasFill(hasFill);
    setHasBorder(hasBorder);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  // Constructor - Fill/Border int

  public GraphicLook(Point pos, Dimension dim, int[] fillColorInfo, int[] borderColorInfo) {
    setPosition(pos);
    setDimension(dim);
    setFillColorInfo(fillColorInfo);
    setBorderColorInfo(borderColorInfo);
    setHasFill(true);
    setHasBorder(true);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int[] fillColorInfo, int[] borderColorInfo, boolean hasFill) {
    setPosition(pos);
    setDimension(dim);
    setFillColorInfo(fillColorInfo);
    setBorderColorInfo(borderColorInfo);
    setHasFill(hasFill);
    setHasBorder(true);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int[] fillColorInfo, int[] borderColorInfo, boolean hasFill,
      boolean hasBorder) {
    setPosition(pos);
    setDimension(dim);
    setFillColorInfo(fillColorInfo);
    setBorderColorInfo(borderColorInfo);
    setHasFill(hasFill);
    setHasBorder(hasBorder);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  // Accessors

  public Point getPosition() {
    return this._position;
  }

  public Dimension getDimension() {
    return this._dimension;
  }

  public int[] getFillColorInfo() {
    return this._fillColorInfo;
  }

  public int[] getBorderColorInfo() {
    return this._borderColorInfo;
  }

  public boolean getHasFill() {
    return this._hasFill;
  }

  public boolean getHasBorder() {
    return this._hasBorder;
  }

  public Rectangle getRectangle() {
    return this._rectangle;
  }

  // Mutators

  public void setPosition(Point value) {
    this._position = value;
  }

  public void setDimension(Dimension value) {
    this._dimension = value;
  }

  public void setFillColorInfo(int[] value) {
    this._fillColorInfo = value;
  }

  public void setBorderColorInfo(int[] value) {
    this._borderColorInfo = value;
  }

  public void setHasFill(boolean value) {
    this._hasFill = value;
  }

  public void setHasBorder(boolean value) {
    this._hasBorder = value;
  }

  public void setRectangle(Rectangle value) {
    this._rectangle = value;
  }

}