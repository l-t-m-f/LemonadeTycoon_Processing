package lemonade.enumeration;

public enum ButtonStateType {
  IDLE(0),
  HOVERED(1),
  PRESSED(2),
  MAX_BUTTON_STATE(3);
  
  private final int _value;
  
  private ButtonStateType(int value) {
    this._value = value; 
  }
  
  public int getValue() {
    return this._value; 
  }
}