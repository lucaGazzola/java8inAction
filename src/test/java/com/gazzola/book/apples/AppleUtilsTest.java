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

    List<Apple> inventory = new ArrayList<Apple>();
    inventory.add(golden);
    inventory.add(red);

    AppleUtils.prettyPrintApple(inventory, new PrettyApplePrinter());

  }
}
