package src.widget.view.concrete;

class GamePreparationView extends View {
  
    public GamePreparationView() {
      super("GamePreparation", new GraphicLook(new Point(0, 0), new Dimension(width, height), color(190, 190, 190)), new Point(0,0), new Point(0, 40));
      setButtonLabels(new String[]{"MAIN MENU", "START DAY", "results", "rent", "upgrades", "staff", "marketing", "recipe", "supplies"});
      setButtonCommands(new Runnable[]{
        new ButtonCommandBackToMenu(), 
        new ButtonCommandStartDay(),
        new ButtonCommandShowSubview_Result(), 
        new ButtonCommandShowSubview_Rent(), 
        new ButtonCommandShowSubview_Upgrades(),
        new ButtonCommandShowSubview_Staff(),
        new ButtonCommandShowSubview_Marketing(), 
        new ButtonCommandShowSubview_Recipe(), 
        new ButtonCommandShowSubview_Supplies()});
      setVisibility(true);
      createButtons();
      createSubviews();
    }
    
    @Override
    protected void createSubviews(){
      
      // Modular subviews
      
      Point subviewOrigin = new Point(0, 0);
      Point subviewOffset = new Point(60, 244);
      Dimension subviewSize  = new Dimension(552, 326);
      GraphicLook subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, color(155, 155, 0));
      
      addSubview(new ResultView(subviewGraphics, subviewOffset));
      addSubview(new RentView(subviewGraphics, subviewOffset));
      addSubview(new UpgradesView(subviewGraphics, subviewOffset));
      addSubview(new StaffView(subviewGraphics, subviewOffset));
      addSubview(new MarketingView(subviewGraphics, subviewOffset));
      addSubview(new RecipeView(subviewGraphics, subviewOffset));
      addSubview(new SuppliesView(subviewGraphics, subviewOffset));  
      
      // Permanent subviews
      
      subviewOffset = new Point(723, 110);
      subviewSize  = new Dimension(472, 460);
      subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, color(155, 155, 0));
      
      addSubview(new SceneView(subviewGraphics, subviewOffset));
      
      subviewSize  = new Dimension(width, 40);
      subviewGraphics = new GraphicLook(subviewOrigin, subviewSize, color(155, 155, 0));
      
      addSubview(new TopBarView(subviewGraphics));
    }
    
    @Override
    protected void createButtons(){    
      for(int i = 0; i < 2; i++){
        int next_x = (width/2) - 350 + (350 * i);
        int next_y = height - 55;
        addButton(new Button(getButtonLabels()[i],
          new GraphicLook(new Point(0, 0), new Dimension(200, 35), CONST.BTN_FILL1, CONST.BTN_BORDER1),
          new Point(next_x, next_y),
          getButtonCommands()[i]));
      }
      
      for(int i = 0; i < 7; i++){
        int next_x = 60 + (80 * i);
        int next_y = 180;
        addButton(new Button(getButtonLabels()[2+i], 16,
            new GraphicLook(new Point(0, 0), new Dimension(70, 45), CONST.BTN_FILL1, CONST.BTN_BORDER1),
            new Point(next_x, next_y),
            getButtonCommands()[2+i]));
      }
    }
  }