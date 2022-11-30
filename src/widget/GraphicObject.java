abstract class GraphicObject {
  
    // Instance fields
    
    private GraphicLook _graphicLook;
    protected boolean _visibility;
    private Point _offset;
    
    // Constructors
    
    public GraphicObject(GraphicLook graphicLook) {
      setGraphicLook(graphicLook);
      setVisibility(false);
    }
    
    // Getters
    
    public GraphicLook getGraphicLook(){
      return this._graphicLook;
    }
    
    public boolean getVisibility() {
      return this._visibility; 
    }
    
    public Point getOffset() {
      return this._offset; 
    }
    
    
    //// Mixin getters
    
    public Rectangle getRectangle() {
      return getGraphicLook().getRectangle();
    }
    
    public color[] getFillColorInfo() {
      return getGraphicLook().getFillColorInfo();
    }
    
    public color[] getBorderColorInfo() {
      return getGraphicLook().getBorderColorInfo();
    }
    
    public boolean getHasBorder() {
      return getGraphicLook().getHasBorder();
    }
    
    public boolean getHasFill() {
      return getGraphicLook().getHasFill();
    }
    
    // Setters
     
    private void setGraphicLook(GraphicLook graphicLook){
      this._graphicLook = graphicLook;
    }
    
    public void setVisibility(boolean value) {   
      this._visibility = value;    
    }
    
    protected void setOffset(Point value) {
      this._offset = value;
    }
    
    // Class methods
    
    abstract public void draw();
    
  }