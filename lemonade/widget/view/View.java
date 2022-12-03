package lemonade.widget.view;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Objects;

import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.GraphicObject;
import lemonade.widget.button.Button;
import lemonade.widget.text.TextBlock;
import lemonade.widget.text.TextVariable;

public abstract class View extends GraphicObject {

  // Instance fields

  private DebugInfo _debugInfo;

  private Runnable[] _buttonCommands;
  private String[] _buttonLabels;
  private ArrayList<Button> _buttons;

  private ArrayList<TextBlock> _textBlocks;
  private ArrayList<TextVariable> _textVariables;

  private ArrayList<View> _subviews;

  // Constructors

  public View(String name, GraphicLook graphicLook) {
    super(graphicLook);
    setButtons(new ArrayList<Button>(8));
    setSubviews(new ArrayList<View>(8));
    setTextBlocks(new ArrayList<TextBlock>(8));
    setTextVariables(new ArrayList<TextVariable>(8));    
    setDebugInfo(new DebugInfo(name, getGraphicLook().getPosition()));
  }

  public View(String name, GraphicLook graphicLook, Point debugInfoOffset) {
    super(graphicLook);
    setButtons(new ArrayList<Button>(8));
    setSubviews(new ArrayList<View>(8));
    setTextBlocks(new ArrayList<TextBlock>(8));
    setTextVariables(new ArrayList<TextVariable>(8));    
    setDebugInfo(new DebugInfo(name, debugInfoOffset));
  }

  // Getters

  public DebugInfo getDebugInfo() {
    return this._debugInfo;
  }

  public ArrayList<Button> getButtons() {
    return this._buttons;
  }

  public ArrayList<View> getSubviews() {
    return this._subviews;
  }

  public String[] getButtonLabels() {
    return this._buttonLabels;
  }

  public Runnable[] getButtonCommands() {
    return this._buttonCommands;
  }

  public ArrayList<TextBlock> getTextBlocks() {
    return this._textBlocks;
  }

  public ArrayList<TextVariable> getTextVariables() {
    return this._textVariables;
  }

  // Setters

  public void setDebugInfo(DebugInfo debugInfo) {
    this._debugInfo = debugInfo;
  }

  public void setButtons(ArrayList<Button> value) {
    this._buttons = value;
  }

  public void setSubviews(ArrayList<View> value) {
    this._subviews = value;
  }

  public void setButtonLabels(String[] value) {
    this._buttonLabels = value;
  }

  public void setButtonCommands(Runnable[] value) {
    this._buttonCommands = value;
  }

  public void setTextBlocks(ArrayList<TextBlock> value) {
    this._textBlocks = value;
  }

  public void setTextVariables(ArrayList<TextVariable> value) {
    this._textVariables = value;
  }

  // Mixin

  @Override
  public void setVisibility(boolean value) {
    super.setVisibility(value);
  }

  public Point getPosition() {
    return getGraphicLook().getPosition();
  }

  // Class methods

  public void addSubview(View view) {
    getSubviews().add(view);
  }

  public void addButton(Button button) {
    getButtons().add(button);
  }

  public void addTextBlock(TextBlock textBlock) {
    getTextBlocks().add(textBlock);
  }

  public void addTextVariable(TextVariable textVariable) {
    getTextVariables().add(textVariable);
  }

  protected void createSubviews() {
  }

  protected void createButtons() {
  }

  protected void createTextBlocks() {
  }

  protected void createTextVariables() {
  }

  protected void createStaticContent() { }

  protected void refreshTextVariables() {
  }

  public View getSubview(int index) {
    return getSubviews().get(index);
  }

  protected TextVariable getTextVariable(int index) {
    return getTextVariables().get(index);
  }

  public void updateTextVariable(int index, String content) {
    getTextVariable(index).updateContent(content);
  }

  public void draw() {
    if (getVisibility() == true) {
      refreshTextVariables();
      GameManager.getInstance().getSketch().noStroke();
      GameManager.getInstance().getSketch().fill(getFillColorInfo()[0]);
      GameManager.getInstance().getSketch().rect(getRectangle().x, getRectangle().y,
          getRectangle().width, getRectangle().height);

      if (getSubviews().size() > 0) {
        for (View vw : getSubviews()) {
          vw.draw();
        }
      }

      if (getButtons().size() > 0) {
        for (Button bt : getButtons()) {
          bt.draw();
        }
      }

      if (getTextBlocks().size() > 0) {
        for (TextBlock tb : getTextBlocks()) {
          tb.draw();
        }
      }

      if (getTextVariables().size() > 0) {
        for (TextVariable tv : getTextVariables()) {
          tv.draw();
        }
      }

      getDebugInfo().draw();
    }
  }

  public void showSubview(int index) {
    if (Objects.isNull(getSubview(index)) == false) {
      getSubview(index).setVisibility(true);
    }
  }

  public void hideSubview(int index) {
    if (Objects.isNull(getSubview(index)) == false) {
      getSubview(index).setVisibility(false);
    }
  }

  public void hideAllSubviews() {
    if (Objects.isNull(getSubviews()) == false) {
      for (View v : getSubviews()) {
        v.setVisibility(false);
      }
    }
  }

  // Inner classes

  class DebugInfo {

    // Fields

    private String _name;
    private Point _position;

    // Constructor

    public DebugInfo(String name, Point position) {
      setName(name);
      setPosition(position);
    }

    // Getters

    public String getName() {
      return this._name;
    }

    public Point getPosition() {
      return this._position;
    }

    // Setters

    public void setName(String name) {
      this._name = name;
    }

    public void setPosition(Point position) {
      this._position = position;
    }

    public void draw() {
      
      GameManager.getInstance().setSketchTextFont(2);
      GameManager.getInstance().setSketchFill(255);

      int posX = getPosition().x;
      int posY = getPosition().y + 20;

      GameManager.getInstance().printToScreen(getName(), posX, posY);

      int mouseDiffX = GameManager.getInstance().getSketch().mouseX - getPosition().x;
      int mouseDiffY = GameManager.getInstance().getSketch().mouseY - getPosition().y;

      posY += Util.Values.TEXT_INTERLINE;

      GameManager.getInstance().printToScreen(mouseDiffX + ", " + mouseDiffY, posX, posY);
    }
  }
}