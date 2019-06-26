package com.gazzola.book.apples;

import java.util.List;

public class AppleUtils
{
  public static void prettyPrintApple(List<Apple> inventory, ApplePrinter applePrinter){
    for(Apple apple: inventory){
      String output = applePrinter.print(apple);
      System.out.println(output);
    }
  }
}
