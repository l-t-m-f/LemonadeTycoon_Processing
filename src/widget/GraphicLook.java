class GraphicLook {
  
    // Instance fields
    
    private Point _position;
    private Dimension _dimension;
    private Rectangle _rectangle;
    private color[] _fillColorInfo;
    private color[] _borderColorInfo;
    private boolean _hasFill;
    private boolean _hasBorder;
    
    // Constructors (multiple)
    
    // Constructor - Splash color (no border)
    
    public GraphicLook(Point pos, Dimension dim, color splashColor){
      setPosition(pos);
      setDimension(dim);
      setFillColorInfo(new color[]{ splashColor });
      setBorderColorInfo(new color[]{ splashColor });
      setHasFill(true);
      setHasBorder(false);
      setRectangle(new Rectangle(getPosition(), getDimension()));
    }
    
    public GraphicLook(Point pos, Dimension dim, color splashColor, boolean hasFill){
      setPosition(pos);
      setDimension(dim);
      setFillColorInfo(new color[]{ splashColor });
      setBorderColorInfo(new color[]{ splashColor });
      setHasFill(hasFill);
      setHasBorder(false);
      setRectangle(new Rectangle(getPosition(), getDimension()));
    }
    
    public GraphicLook(Point pos, Dimension dim, color splashColor, boolean hasFill, boolean hasBorder){
      setPosition(pos);
      setDimension(dim);
      setFillColorInfo(new color[]{ splashColor });
      setBorderColorInfo(new color[]{ splashColor });
      setHasFill(hasFill);
      setHasBorder(hasBorder);
      setRectangle(new Rectangle(getPosition(), getDimension()));
    }
    
    // Constructor  - Fill/Border color
    
    public GraphicLook(Point pos, Dimension dim, color[] fillColorInfo, color[] borderColorInfo){
      setPosition(pos);
      setDimension(dim);
      setFillColorInfo(fillColorInfo);
      setBorderColorInfo(borderColorInfo);
      setHasFill(true);
      setHasBorder(true);
      setRectangle(new Rectangle(getPosition(), getDimension()));
    }
    
    public GraphicLook(Point pos, Dimension dim, color[] fillColorInfo, color[] borderColorInfo, boolean hasFill){
      setPosition(pos);
      setDimension(dim);
      setFillColorInfo(fillColorInfo);
      setBorderColorInfo(borderColorInfo);
      setHasFill(hasFill);
      setHasBorder(true);
      setRectangle(new Rectangle(getPosition(), getDimension()));
    }
    
    public GraphicLook(Point pos, Dimension dim, color[] fillColorInfo, color[] borderColorInfo, boolean hasFill, boolean hasBorder){
      setPosition(pos);
      setDimension(dim);
      setFillColorInfo(fillColorInfo);
      setBorderColorInfo(borderColorInfo);
      setHasFill(hasFill);
      setHasBorder(hasBorder);
      setRectangle(new Rectangle(getPosition(), getDimension()));
    }
    
    // Accessors
    
    public Point getPosition(){
      return this._position;
    }
    
    public Dimension getDimension(){
      return this._dimension;
    }
    
    public color[] getFillColorInfo(){
      return this._fillColorInfo;
    }
    
    public color[] getBorderColorInfo(){
      return this._borderColorInfo;
    }
    
    public boolean getHasFill(){
      return this._hasFill;
    }
    
    public boolean getHasBorder(){
      return this._hasBorder;
    }
    
    public Rectangle getRectangle(){    
      return this._rectangle;
    }
    
    // Mutators
    
    public void setPosition(Point value){
      this._position = value;
    }
    
    public void setDimension(Dimension value){
      this._dimension = value;
    }
    
    public void setFillColorInfo(color[] value){
      this._fillColorInfo = value;
    }
    
    public void setBorderColorInfo(color[] value){
      this._borderColorInfo = value;
    }
    
    public void setHasFill(boolean value){
      this._hasFill = value;
    }
    
    public void setHasBorder(boolean value){
      this._hasBorder = value;
    }
    
    public void setRectangle(Rectangle value){
      this._rectangle = value;
    }
    
  }