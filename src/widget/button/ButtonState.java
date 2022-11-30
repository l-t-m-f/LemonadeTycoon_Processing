public enum ButtonState {
    IDLE(0),
    HOVERED(1),
    PRESSED(2),
    MAX_BUTTON_STATE(3);
    
    private final int _value;
    
    private ButtonState(int value) {
      this._value = value; 
    }
    
    private int getValue() {
      return this._value; 
    }
  }