import java.util.ArrayList;

public class GUI {

    // Instance fields
    
    private ArrayList<View> _mainViews;  
    private FontBook _fontBook;
    //private ArrayList<Popup> _popups = new ArrayList<>(8); // Not implemented yet
    
    // Constructors
    
    public GUI() {
      setMainViews(new ArrayList<View>(3));
      setFontBook(new FontBook());
    }
    
    // Getters
    
    private ArrayList<View> getMainViews(){
      return this._mainViews;
    }
    
    private FontBook getFontBook(){
      return this._fontBook;
    }
    
    // Setters
     
    private void setMainViews(ArrayList<View> value){
      if(Objects.isNull(this._mainViews) == true){
        this._mainViews = value;
      }
      else
      {
        System.out.println("Error - MainViews ArrayList is already set!");
      }
    }
    
    private void setFontBook(FontBook value){
      this._fontBook = value;
    }
    
    // Class methods
    
    public PFont getFont(int index){
      return getFontBook().getFont(index);
    }
    
    public View getMainView(int index){
      return getMainViews().get(index); 
    }
    
    private void addView(View view){
        getMainViews().add(view); 
    }
      
    private void createMainViews(){
      addView(new MainMenuView());
      addView(new GamePreparationView());
      addView(new GameView()); 
    }
      
    // Inner classes
    
    class FontBook {
     
      // Instance fields
      
      ArrayList<PFont> _fonts;
      
      // Constructor
      
      public FontBook(){
        setFonts(new ArrayList<PFont>(10));
        createAll();
      }
      
      // Getters
      
      private ArrayList<PFont> getFonts(){
        return this._fonts;
      }
      
      // Setters
      
      private void setFonts(ArrayList<PFont> value){
        if(Objects.isNull(this._fonts) == true){
          this._fonts = value;
        }
        else
        {
          System.out.println("Fonts - List ArrayList is already set!");
        }
      }  
      
      // Class methods
      
      private PFont getFont(int index) {
        return getFonts().get(index); 
      } 
      
      private void createAll(){
        addFont(loadFont("CenturyGothic-Bold-48.vlw"));
        addFont(loadFont("Dialog.plain-24.vlw"));
        addFont(loadFont("Monospaced.plain-18.vlw"));  
      }
      
      private void addFont(PFont font) {
        getFonts().add(font); 
      }    
    }  
  }