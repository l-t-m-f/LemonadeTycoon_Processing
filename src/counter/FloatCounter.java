
  
  class FloatCounter {
   
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
      if((getCount() + 1.0) <= getMaxCount()) {
        setCount(getCount() + 1);
      }
    }
    
    public void decrement() {
      if((getCount() - 1.0) >= getMinCount()) {
        setCount(getCount() - 1.0);
      }
    }  
    
    public void add(int value) {
      if((getCount() + value) <= getMaxCount()) {
        setCount(getCount() + value);
      }
    }
    
    public void subtract(int value) {
      if((getCount() - value) >= getMinCount()) {
        setCount(getCount() + value);
      }
    }
    
  }