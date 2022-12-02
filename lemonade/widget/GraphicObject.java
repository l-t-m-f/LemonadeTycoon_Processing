package lemonade.widget;

import java.awt.Rectangle;

public abstract class GraphicObject {

  // Instance fields

  private GraphicLook _graphicLook;
  protected boolean _visibility;

  // Constructors

  public GraphicObject(GraphicLook graphicLook) {
    setGraphicLook(graphicLook);
    setVisibility(false);
  }

  // Getters

  public GraphicLook getGraphicLook() {
    return this._graphicLook;
  }

  public boolean getVisibility() {
    return this._visibility;
  }

  //// Mixin getters

  public Rectangle getRectangle() {
    return getGraphicLook().getRectangle();
  }

  public int[] getFillColorInfo() {
    return getGraphicLook().getFillColorInfo();
  }

  public int[] getBorderColorInfo() {
    return getGraphicLook().getBorderColorInfo();
  }

  public boolean getHasBorder() {
    return getGraphicLook().getHasBorder();
  }

  public boolean getHasFill() {
    return getGraphicLook().getHasFill();
  }

  // Setters

  private void setGraphicLook(GraphicLook graphicLook) {
    this._graphicLook = graphicLook;
  }

  public void setVisibility(boolean value) {
    this._visibility = value;
  }

  // Class methods

  abstract public void draw();

}