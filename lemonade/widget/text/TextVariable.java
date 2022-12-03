package lemonade.widget.text;

import java.awt.Point;

public class TextVariable extends TextGraphic {

  // Constructors

  public TextVariable(Point position) {
    super("", position);
  }

  public TextVariable(Point position, TextLook look) {
    super("", position, look);
  }

  // Class methods

  public void updateContent(String newContent) {
    setContent(newContent);
  }

}