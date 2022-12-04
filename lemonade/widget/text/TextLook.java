package lemonade.widget.text;

import processing.core.PFont;

public class TextLook {

    // Class fields
    // None

    // Instance fields
    private int _color;
    private PFont _font;
    private double _scale;

    // Constructor(s)

    public TextLook(PFont font, int color, double scale) {
        setFont(font);
        setColor(color);
        setScale(scale);
    }

    // Getters

    public int getColor() {
        return this._color;
    }

    public PFont getFont() {
        return this._font;
    }

    public double getScale() {
        return this._scale;
    }

    // Setters

    public void setColor(int value) {
        this._color = value;
    }

    public void setFont(PFont value) {
        this._font = value;
    }

    public void setScale(double value) {
        this._scale = value;
    }

    // Class methods

}
