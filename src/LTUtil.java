package src;
import java.awt.Point;

public class LTUtil {

  public static Point addPoint(Point p1, Point p2) {
    int px = p1.x + p2.x;
    int py = p1.y + p2.y;
    return new Point(px, py);
  }

  public static class Values {

    public static final int black = 0xFF000000;
    public static final int white = 0xFFFFFFFF;
    public static final int red = 0xFFFF0000;
    public static final int lime = 0xFF00FF00;
    public static final int blue = 0xFF0000FF;
    public static final int yellow = 0xFFFFFF00;
    public static final int cyan = 0xFF00FFFF;
    public static final int magenta = 0xFFFF00FF;
    public static final int silver = 0xFFC0C0C0;
    public static final int gray = 0xFF808080;
    public static final int darkgray = 0xFF303030;
    public static final int maroon = 0xFF800000;
    public static final int olive = 0xFF808000;
    public static final int green = 0xFF008000;
    public static final int purple = 0xFF800080;
    public static final int teal = 0xFF008080;
    public static final int mavy = 0xFF000080;

    // int sets constants

    public static final int[] BTN_FILL1 = { magenta, purple, olive };
    public static final int[] BTN_BORDER1 = { magenta, purple, olive };

    public static final int TEXT_INTERLINE = 28;

  }

}