package lemonade.widget.text;

import java.awt.Point;

public class TextVariable extends TextBlock {

  // Constructors

  public TextVariable(Point position) {
    super("", position);
  }

  public TextVariable(Point position, int caseColor) {
    super("", position, caseColor);
  }

  public TextVariable(Point position, int caseColor, int caseSize) {
    super("", position, caseColor, caseSize);
  }

  // Class methods

  public void updateContent(String newContent) {
    setContent(newContent);
  }

}