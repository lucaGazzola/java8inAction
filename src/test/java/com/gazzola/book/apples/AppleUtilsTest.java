package com.gazzola.book.apples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppleUtilsTest
{
  @Test
  public void prettyPrinterTest()
  {
    Apple golden = new Apple(400, "gold");
    Apple red = new Apple(200, "red");

    List<Apple> inventory = new ArrayList<>();
    inventory.add(golden);
    inventory.add(red);

    // Class
    AppleUtils.prettyPrintApple(inventory, new ColorApplePrinter());

    // Anonymous class
    AppleUtils.prettyPrintApple(inventory, new ApplePrinter()
    {
      @Override
      public String print(Apple apple)
      {
        return apple.getColor();
      }
    });

    // Lambda expression
    AppleUtils.prettyPrintApple(inventory, (apple) -> apple.getColor());

    // Method reference
    AppleUtils.prettyPrintApple(inventory, Apple::getColor);


  }
}
