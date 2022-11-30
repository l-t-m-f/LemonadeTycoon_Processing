import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

public class GraphicLook {

  // Instance fields

  private Point _position;
  private Dimension _dimension;
  private Rectangle _rectangle;
  private int[] _fillintInfo;
  private int[] _borderintInfo;
  private boolean _hasFill;
  private boolean _hasBorder;

  // Constructors (multiple)

  // Constructor - Splash int (no border)

  public GraphicLook(Point pos, Dimension dim, int splashint) {
    setPosition(pos);
    setDimension(dim);
    setFillintInfo(new int[] { splashint });
    setBorderintInfo(new int[] { splashint });
    setHasFill(true);
    setHasBorder(false);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int splashint, boolean hasFill) {
    setPosition(pos);
    setDimension(dim);
    setFillintInfo(new int[] { splashint });
    setBorderintInfo(new int[] { splashint });
    setHasFill(hasFill);
    setHasBorder(false);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int splashint, boolean hasFill, boolean hasBorder) {
    setPosition(pos);
    setDimension(dim);
    setFillintInfo(new int[] { splashint });
    setBorderintInfo(new int[] { splashint });
    setHasFill(hasFill);
    setHasBorder(hasBorder);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  // Constructor - Fill/Border int

  public GraphicLook(Point pos, Dimension dim, int[] fillintInfo, int[] borderintInfo) {
    setPosition(pos);
    setDimension(dim);
    setFillintInfo(fillintInfo);
    setBorderintInfo(borderintInfo);
    setHasFill(true);
    setHasBorder(true);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int[] fillintInfo, int[] borderintInfo, boolean hasFill) {
    setPosition(pos);
    setDimension(dim);
    setFillintInfo(fillintInfo);
    setBorderintInfo(borderintInfo);
    setHasFill(hasFill);
    setHasBorder(true);
    setRectangle(new Rectangle(getPosition(), getDimension()));
  }

  public GraphicLook(Point pos, Dimension dim, int[] fillintInfo, int[] borderintInfo, boolean hasFill,
      boolean hasBorder) {
    setPosition(pos);
    setDimension(dim);
    setFillintInfo(fillintInfo);
    setBorderintInfo(borderintInfo);
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

  public int[] getFillintInfo() {
    return this._fillintInfo;
  }

  public int[] getBorderintInfo() {
    return this._borderintInfo;
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

  public void setFillintInfo(int[] value) {
    this._fillintInfo = value;
  }

  public void setBorderintInfo(int[] value) {
    this._borderintInfo = value;
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