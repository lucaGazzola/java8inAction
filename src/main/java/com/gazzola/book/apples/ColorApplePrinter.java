package com.gazzola.book.apples;

public class ColorApplePrinter implements  ApplePrinter
{
  public String print(Apple apple)
  {
    return apple.getColor();
  }
}
