package lemonade.widget.button;

import java.util.Objects;

import lemonade.enumeration.ButtonStateType;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.GraphicObject;
import lemonade.widget.text.TextGraphic;

public class Button extends GraphicObject {

  private ButtonStateType _buttonState;
  private Runnable _buttonCommand;
  private boolean _isInAction;
  private TextGraphic _textGraphic;

  // Constructors

  public Button(GraphicLook graphicLook, Runnable command) {
    super(graphicLook);
    setTextGraphic(null);
    setButtonCommand(command);
    setButtonState(ButtonStateType.IDLE);
    setVisibility(true);
  }

  public Button(TextGraphic text, GraphicLook graphicLook, Runnable command) {
    super(graphicLook);
    setTextGraphic(text);
    getTextGraphic().setPosition(graphicLook.getPosition());
    setButtonCommand(command);
    setButtonState(ButtonStateType.IDLE);
    setVisibility(true);
  }

  // Getters

  public ButtonStateType getButtonState() {
    return this._buttonState;
  }

  public Runnable getButtonCommand() {
    return this._buttonCommand;
  }

  public boolean getIsInAction() {
    return this._isInAction;
  }

  public TextGraphic getTextGraphic() {
    return this._textGraphic;
  }

  // Setters

  public void setButtonState(ButtonStateType value) {
    this._buttonState = value;
  }

  public void setButtonCommand(Runnable value) {
    this._buttonCommand = value;
  }

  public void setIsInAction(boolean value) {
    this._isInAction = value;
  }

  public void setTextGraphic(TextGraphic value) {
    this._textGraphic = value;
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

    if(Objects.isNull(getTextGraphic()) == false) {
      drawButtonText();
    }

  }

  private void drawButtonText() {
    GameManager.getInstance().setSketchNoStroke();
    GameManager.getInstance().setSketchFill(255);
    
    GameManager.getInstance().setSketchTextFont(getTextGraphic().getLook().getFont());

    final float charWidthConst = (getTextGraphic().getLook().getFont().getDefaultSize() / 4);
    final int halfWidth = getRectangle().width / 2;
    final int halfHeight = getRectangle().height / 2;
    final float textPosX = getRectangle().x + halfWidth - (getTextGraphic().getContent().length() * charWidthConst);
    final float textPosY = getRectangle().y + halfHeight + charWidthConst;

    GameManager.getInstance().getSketch().text(getTextGraphic().getContent(), textPosX, textPosY);
  }

  private void refresh() {
    setIsInAction(false);
  }

  public void logic() {

    if (checkMouse() == true) {
      if (GameManager.getInstance().getSketch().mousePressed == true
          && (GameManager.getInstance().getKeystrokesResponsiveness() == true)) {
        setButtonState(ButtonStateType.PRESSED);
        if (getIsInAction() == false) {
          setIsInAction(true);
          getButtonCommand().run();
        }
      } else {
        refresh();
        setButtonState(ButtonStateType.HOVERED);
      }
    } else {
      setButtonState(ButtonStateType.IDLE);
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