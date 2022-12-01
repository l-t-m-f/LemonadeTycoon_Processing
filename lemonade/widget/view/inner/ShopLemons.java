package lemonade.widget.view.inner;

import java.awt.Dimension;
import java.awt.Point;
import lemonade.Util;
import lemonade.singleton.GameManager;
import lemonade.widget.GraphicLook;
import lemonade.widget.button.Button;
import lemonade.widget.button.ButtonCommand;
import lemonade.widget.text.TextBlock;
import lemonade.widget.text.TextVariable;
import lemonade.widget.view.View;

public class ShopLemons extends View {

  public ShopLemons(GraphicLook graphicLook, Point offset) {
    super("Lemons", graphicLook, offset);
    setButtonCommands(new Runnable[] {
        new ButtonCommand.SubtractLemonsFromOrder12(), new ButtonCommand.AddLemonsToOrder12(),
        new ButtonCommand.SubtractLemonsFromOrder24(), new ButtonCommand.AddLemonsToOrder24(),
        new ButtonCommand.SubtractLemonsFromOrder48(), new ButtonCommand.AddLemonsToOrder48()
    });
    setVisibility(true);
    createButtons();
    createTextBlocks();
    createTextVariables();
  }

  @Override
  protected void createButtons() {
    int buttonCount = 0;
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        if (i != 1) {
          addButton(
              new Button(new GraphicLook(new Point(0, 0), new Dimension(50, 50), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
                  Util.addPoint(new Point(-10 + (112 * i), 8 + (65 * j)), getOffset()),
                  getButtonCommands()[buttonCount]));
          buttonCount++;
        }
      }
    }

    addButton(new Button(new GraphicLook(new Point(0, 0), new Dimension(80, 40), Util.Values.BTN_FILL1, Util.Values.BTN_BORDER1),
        Util.addPoint(new Point(318, 80), getOffset()),
        new ButtonCommand.BuyLemonOrder()));

  }

  protected void createTextBlocks() {

    int startingX = 64;
    int startingY = 39;
    final int incrementY = 60;
    String[] contents = { "12 lemons", "24 lemons", "48 lemons", "$ 4.80", "$ 7.20", "$ 9.60" };

    for (int i = 0; i < 3; i++) {
      addTextBlock(new TextBlock(contents[i], new Point(0, 0),
          Util.addPoint(new Point(startingX, startingY + (incrementY * i)), getOffset()),0xFFFFFFFF, 14));
      addTextBlock(new TextBlock(contents[3 + i], new Point(0, 0),
          Util.addPoint(new Point(startingX, startingY + (incrementY * i) + (Util.Values.TEXT_INTERLINE / 2)), getOffset()),
          0xFFFFFFFF, 14));
    }
  }

  protected void createTextVariables() {
    int startingX = 155;
    int startingY = 36;
    final int incrementY = 60;

    for (int i = 0; i < 3; i++) {
      addTextVariable(new TextVariable(new Point(0, 0),
          Util.addPoint(new Point(startingX, startingY + (incrementY * i)), getOffset()), 0xFFFFFFFF, 24));
    }
  }

  protected void refreshTextVariables() {
    updateTextVariable(0, "" + GameManager.getInstance().getOrder().getLemonCounters()[0].getCount());
    updateTextVariable(1, "" + GameManager.getInstance().getOrder().getLemonCounters()[1].getCount());
    updateTextVariable(2, "" + GameManager.getInstance().getOrder().getLemonCounters()[2].getCount());
  }

}