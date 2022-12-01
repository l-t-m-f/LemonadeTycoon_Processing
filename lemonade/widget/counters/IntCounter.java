package lemonade.widget.counters;

public class IntCounter {

  // Instance fields

  private int _count;
  private int _maxCount;
  private int _minCount;

  // Constructor

  public IntCounter(int initialCount, int maxCount) {
    setCount(initialCount);
    setMaxCount(maxCount);
    setMinCount(0);
  }

  public IntCounter(int initialCount, int maxCount, int minCount) {
    setCount(initialCount);
    setMaxCount(maxCount);
    setMinCount(minCount);
  }

  // Getters

  public int getCount() {
    return this._count;
  }

  public int getMaxCount() {
    return this._maxCount;
  }

  public int getMinCount() {
    return this._minCount;
  }

  // Setters

  public void setCount(int value) {
    this._count = value;
  }

  private void setMaxCount(int value) {
    this._maxCount = value;
  }

  private void setMinCount(int value) {
    this._minCount = value;
  }

  // Class methods

  public void reset() {
    setCount(0);
  }

  public void increment() {
    if ((getCount() + 1) <= getMaxCount()) {
      setCount(getCount() + 1);
    }
  }

  public void decrement() {
    if ((getCount() - 1) >= getMinCount()) {
      setCount(getCount() - 1);
    }
  }

  public void add(int value) {
    if ((getCount() + value) <= getMaxCount()) {
      setCount(getCount() + value);
    }
  }

  public void subtract(int value) {
    if ((getCount() - value) >= getMinCount()) {
      setCount(getCount() - value);
    }
  }

}