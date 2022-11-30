class DoubleCounter {

  // Instance fields

  private double _count;
  private double _maxCount;
  private double _minCount;

  // Constructor

  public DoubleCounter(double initialCount, double maxCount) {
    setCount(initialCount);
    setMaxCount(maxCount);
    setMinCount(0);
  }

  public DoubleCounter(double initialCount, double maxCount, double minCount) {
    setCount(initialCount);
    setMaxCount(maxCount);
    setMinCount(minCount);
  }

  // Getters

  public double getCount() {
    return this._count;
  }

  public double getMaxCount() {
    return this._maxCount;
  }

  public double getMinCount() {
    return this._minCount;
  }

  // Setters

  public void setCount(double value) {
    this._count = value;
  }

  private void setMaxCount(double value) {
    this._maxCount = value;
  }

  private void setMinCount(double value) {
    this._minCount = value;
  }

  // Class methods

  public void increment() {
    if ((getCount() + 1.0) <= getMaxCount()) {
      setCount(getCount() + 1);
    }
  }

  public void decrement() {
    if ((getCount() - 1.0) >= getMinCount()) {
      setCount(getCount() - 1.0);
    }
  }

  public void add(int value) {
    if ((getCount() + value) <= getMaxCount()) {
      setCount(getCount() + value);
    }
  }

  public void subtract(int value) {
    if ((getCount() - value) >= getMinCount()) {
      setCount(getCount() + value);
    }
  }

}