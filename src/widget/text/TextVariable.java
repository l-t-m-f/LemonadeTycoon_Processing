class TextVariable extends TextBlock {

    // Constructors
    
    public TextVariable(Point position, Point offset){
      super("", position, offset);
    }
    
    public TextVariable(Point position, Point offset, color caseColor){
      super("", position, offset, caseColor);
    }
    
    public TextVariable(Point position, Point offset, color caseColor, int caseSize){
      super("", position, offset, caseColor, caseSize);
    }
    
    // Class methods
    
    public void updateContent(String newContent) {
      setContent(newContent);
    }  
    
  }