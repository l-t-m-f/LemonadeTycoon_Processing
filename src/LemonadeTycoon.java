package src;

import src.singleton.Singleton;
import src.singleton.GameManager;

import processing.core.PApplet;

import java.lang.reflect.InvocationTargetException;
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
    try {
      gameManager = Singleton.GetInstance(GameManager.class, new Object[]{this});
    } catch (InvocationTargetException | InstantiationException | IllegalAccessException | IllegalArgumentException
        | SecurityException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
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