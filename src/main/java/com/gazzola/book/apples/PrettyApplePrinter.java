package com.gazzola.book.apples;

public class PrettyApplePrinter implements  ApplePrinter
{
  public String print(Apple apple)
  {
    return String.valueOf(apple.getWeight());
  }
}
