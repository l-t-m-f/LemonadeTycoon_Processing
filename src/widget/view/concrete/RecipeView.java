package src.widget.view.concrete;

class RecipeView extends View {
  
    public RecipeView(GraphicLook graphics, Point offset) {
      super("Recipe", graphics, offset);
      setVisibility(false);
      setButtonCommands(new Runnable[]{
        new ButtonCommandRemoveLemonFromRecipe(), new ButtonCommandAddLemonToRecipe(),
        new ButtonCommandRemoveSugarFromRecipe(), new ButtonCommandAddSugarToRecipe(),
        new ButtonCommandRemoveIceFromRecipe(), new ButtonCommandAddIceToRecipe()
      });
      createButtons();
      createSubviews();
      createTextBlocks();
      createTextVariables();
    }
    
    @Override
    protected void createButtons(){
      int buttonCount = 0;
      for(int j = 0; j < 3; j++){
        for(int i = 0; i < 3; i++){
          if(i != 1) {          
            addButton(new Button(new GraphicLook(new Point(0, 0), new Dimension(50, 50), CONST.BTN_FILL1, CONST.BTN_BORDER1),
              new Point(30 + (65 * i) + getOffset().x, 125 + (65 * j) + getOffset().y),
              getButtonCommands()[buttonCount]));
            buttonCount++;
          }
        }
      }
    }  
    
    protected void createTextBlocks() {
      int startingX = 10;
      int startingY = 50;
      addTextBlock(new TextBlock("Tweak your recipe according to temperature, adding more ice when needed.", new Point(0, 0), LTUtil.addPoint(new Point(startingX, startingY), getOffset()), color(255), 16));
      addTextBlock(new TextBlock("Always keep a good balance between all ingredients.", new Point(0, 0), LTUtil.addPoint(new Point(startingX, startingY + CONST.TEXT_INTERLINE), getOffset()), color(255), 16));
      addTextBlock(new TextBlock("Cups per pitcher: ", new Point(0, 0), LTUtil.addPoint(new Point(245, 170), getOffset()), color(255), 20));
    }
    
    protected void createTextVariables() {    
      addTextVariable(new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(110, 152), getOffset()), color(255), 24));   
      addTextVariable(new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(110, 222), getOffset()), color(255), 24));   
      addTextVariable(new TextVariable(new Point(0, 0), LTUtil.addPoint(new Point(110, 292), getOffset()), color(255), 24));
    }
    
    protected void refreshTextVariables() {
      updateTextVariable(0, "" + gameManager.getRecipe().getLemons().getCount());
      updateTextVariable(1, "" + gameManager.getRecipe().getSugar().getCount());
      updateTextVariable(2, "" + gameManager.getRecipe().getIce().getCount());
    }
    
  }