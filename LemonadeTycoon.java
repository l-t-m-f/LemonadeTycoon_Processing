package LemonadeTycoon;

import processing.core.PApplet;
import src.singleton.GameManager;

import java.awt.*;
import java.util.*;
import java.lang.*;
import java.lang.Class;
import java.lang.reflect.Modifier;

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