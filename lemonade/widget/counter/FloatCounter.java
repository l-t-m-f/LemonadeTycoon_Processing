package lemonade.widget.counter;

public class FloatCounter {

  // Instance fields

  private float _count;
  private float _maxCount;
  private float _minCount;

  // Constructor

  public FloatCounter(float initialCount, float maxCount) {
    setCount(initialCount);
    setMaxCount(maxCount);
    setMinCount(0);
  }

  public FloatCounter(float initialCount, float maxCount, float minCount) {
    setCount(initialCount);
    setMaxCount(maxCount);
    setMinCount(minCount);
  }

  // Getters

  public float getCount() {
    return this._count;
  }

  public float getMaxCount() {
    return this._maxCount;
  }

  public float getMinCount() {
    return this._minCount;
  }

  // Setters

  public void setCount(float value) {
    this._count = value;
  }

  private void setMaxCount(float value) {
    this._maxCount = value;
  }

  private void setMinCount(float value) {
    this._minCount = value;
  }

  // Class methods

  public void increment() {
    if ((getCount() + 1.0f) <= getMaxCount()) {
      setCount(getCount() + 1.0f);
    }
  }

  public void decrement() {
    if ((getCount() - 1.0f) >= getMinCount()) {
      setCount(getCount() - 1.0f);
    }
  }

  public void add(float value) {
    if ((getCount() + value) <= getMaxCount()) {
      setCount(getCount() + value);
    }
  }

  public void subtract(float value) {
    if ((getCount() - value) >= getMinCount()) {
      setCount(getCount() - value);
    }
  }

}