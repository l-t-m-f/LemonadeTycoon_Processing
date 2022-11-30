import java.awt.Point;

public class Button extends GraphicObject {

  private ButtonState _buttonState;
  private Runnable _buttonCommand;
  private boolean _isInAction;
  private String _label;
  private int _labelCaseSize = 24;

  // Constructors

  public Button(GraphicLook graphicLook, Point offset, Runnable command) {
    super(graphicLook);
    setLabel("");
    setButtonCommand(command);
    setButtonState(ButtonState.IDLE);
    setVisibility(true);
    setOffset(new Point(offset.x + graphicLook.getPosition().x, offset.y + graphicLook.getPosition().y));
  }

  public Button(String label, GraphicLook graphicLook, Point offset, Runnable command) {
    super(graphicLook);
    setLabel(label);
    setButtonCommand(command);
    setButtonState(ButtonState.IDLE);
    setVisibility(true);
    setOffset(new Point(offset.x + graphicLook.getPosition().x, offset.y + graphicLook.getPosition().y));
  }

  public Button(String label, int labelCaseSize, GraphicLook graphicLook, Point offset, Runnable command) {
    super(graphicLook);
    setLabel(label);
    setLabelCaseSize(labelCaseSize);
    setButtonCommand(command);
    setButtonState(ButtonState.IDLE);
    setVisibility(true);
    setOffset(new Point(offset.x + graphicLook.getPosition().x, offset.y + graphicLook.getPosition().y));
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
      noStroke();
    } else {
      stroke(getBorderColorInfo()[getButtonState().getValue()]);
    }
    if (getHasFill() == false) {
      noFill();
    } else {
      fill(getFillColorInfo()[getButtonState().getValue()]);
    }
    int new_x = getRectangle().x + getOffset().x;
    int new_y = getRectangle().y + getOffset().y;
    rect(new_x, new_y, getRectangle().width, getRectangle().height);

    noStroke();
    fill(255);
    textFont(gameManager.getGUI().getFont(1), getLabelCaseSize());
    final float charWidthConst = (getLabelCaseSize() / 4);
    final int halfWidth = getRectangle().width / 2;
    final int halfHeight = getRectangle().height / 2;
    final float textPosX = getRectangle().x + halfWidth - (getLabel().length() * charWidthConst) + getOffset().x;
    final float textPosY = getRectangle().y + halfHeight + charWidthConst + getOffset().y;
    text(getLabel(), textPosX, textPosY);
  }

  private void refresh() {
    setIsInAction(false);
  }

  public void logic() {

    if (checkMouse() == true) {
      if (mousePressed == true && (gameManager.getKeystrokesResponsiveness() == true)) {
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

    int new_x = getRectangle().x + getOffset().x;
    int new_y = getRectangle().y + getOffset().y;
    if (mouseX > new_x && mouseX < (new_x + getRectangle().width) &&
        mouseY > new_y && mouseY < (new_y + getRectangle().height)) {
      return true;

    }

    return false;
  }

}