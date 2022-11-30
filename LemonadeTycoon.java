import processing.core.PApplet;
import java.util.Objects;

public class LemonadeTycoon extends PApplet {

  GameManager gameManager;

  public LemonadeTycoon() {
  }

  @Override
  public void settings() {
    size(1280, 720);
  }

  @Override
  public void setup() {
    gameManager = new GameManager();
  }

  @Override
  public void draw() {
    if(Objects.isNull(gameManager) == false) {
      //gameManager.
    }
  }

  @Override
  public void mouseReleased() {

  }

  // Driver code
  public static void main(String[] args)
  {
    PApplet.main( new String[] { "--present", "LemonadeTycoon" } );
  }

}