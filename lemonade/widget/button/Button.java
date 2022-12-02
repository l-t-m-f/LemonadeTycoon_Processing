package lemonade.widget.button;

import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.GraphicObject;

public class Button extends GraphicObject {

  private ButtonState _buttonState;
  private Runnable _buttonCommand;
  private boolean _isInAction;
  private String _label;
  private int _labelCaseSize = 24;

  // Constructors

  public Button(GraphicLook graphicLook, Runnable command) {
    super(graphicLook);
    setLabel("");
    setButtonCommand(command);
    setButtonState(ButtonState.IDLE);
    setVisibility(true);
  }

  public Button(String label, GraphicLook graphicLook, Runnable command) {
    super(graphicLook);
    setLabel(label);
    setButtonCommand(command);
    setButtonState(ButtonState.IDLE);
    setVisibility(true);
  }

  public Button(String label, int labelCaseSize, GraphicLook graphicLook, Runnable command) {
    super(graphicLook);
    setLabel(label);
    setLabelCaseSize(labelCaseSize);
    setButtonCommand(command);
    setButtonState(ButtonState.IDLE);
    setVisibility(true);
  }

  // Getters

  public ButtonState getButtonState() {
    return this._buttonState;
  }

  public Runnable getButtonCommand() {
    return this._buttonCommand;
  }

  public boolean getIsInAction() {
    return this._isInAction;
  }

  public String getLabel() {
    return this._label;
  }

  public int getLabelCaseSize() {
    return this._labelCaseSize;
  }

  // Setters

  public void setButtonState(ButtonState value) {
    this._buttonState = value;
  }

  public void setButtonCommand(Runnable value) {
    this._buttonCommand = value;
  }

  public void setIsInAction(boolean value) {
    this._isInAction = value;
  }

  public void setLabel(String value) {
    this._label = value;
  }

  public void setLabelCaseSize(int value) {
    this._labelCaseSize = value;
  }

  // Custom methods

  @Override
  public void draw() {

    logic();

    if (getHasBorder() == false) {
      GameManager.getInstance().getSketch().noStroke();
    } else {
      GameManager.getInstance().getSketch().stroke(getBorderColorInfo()[getButtonState().getValue()]);
    }
    if (getHasFill() == false) {
      GameManager.getInstance().getSketch().noFill();
    } else {
      GameManager.getInstance().getSketch().fill(getFillColorInfo()[getButtonState().getValue()]);
    }
    GameManager.getInstance().getSketch().rect(getRectangle().x, getRectangle().y, getRectangle().width, getRectangle().height);

    GameManager.getInstance().getSketch().noStroke();
    GameManager.getInstance().getSketch().fill(255);
    GameManager.getInstance().getSketch().textFont(GameManager.getInstance().getSketch().getFonts()[1],
        getLabelCaseSize());
    final float charWidthConst = (getLabelCaseSize() / 4);
    final int halfWidth = getRectangle().width / 2;
    final int halfHeight = getRectangle().height / 2;
    final float textPosX = getRectangle().x + halfWidth - (getLabel().length() * charWidthConst);
    final float textPosY = getRectangle().y + halfHeight + charWidthConst;
    GameManager.getInstance().getSketch().text(getLabel(), textPosX, textPosY);
  }

  private void refresh() {
    setIsInAction(false);
  }

  public void logic() {

    if (checkMouse() == true) {
      if (GameManager.getInstance().getSketch().mousePressed == true
          && (GameManager.getInstance().getKeystrokesResponsiveness() == true)) {
        setButtonState(ButtonState.PRESSED);
        if (getIsInAction() == false) {
          setIsInAction(true);
          getButtonCommand().run();
        }
      } else {
        refresh();
        setButtonState(ButtonState.HOVERED);
      }
    } else {
      setButtonState(ButtonState.IDLE);
    }

  }

  private boolean checkMouse() {

    int x = getRectangle().x;
    int y = getRectangle().y;
    if (GameManager.getInstance().getSketch().mouseX > x
        && GameManager.getInstance().getSketch().mouseX < (x + getRectangle().width) &&
        GameManager.getInstance().getSketch().mouseY > y
        && GameManager.getInstance().getSketch().mouseY < (y + getRectangle().height)) {
      return true;

    }

    return false;
  }

}