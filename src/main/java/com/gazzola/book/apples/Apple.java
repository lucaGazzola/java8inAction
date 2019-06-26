package com.gazzola.book.apples;

import java.util.Objects;

public class Apple
{
  private int weight;
  private String color;

  public Apple(int weight, String color)
  {
    this.weight = weight;
    this.color = color;
  }

  public int getWeight()
  {
    return weight;
  }

  public String getColor()
  {
    return color;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    Apple apple = (Apple) o;
    return weight == apple.weight &&
      Objects.equals(color, apple.color);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(weight, color);
  }

  @Override
  public String toString()
  {
    return "Apple{" +
      "weight=" + weight +
      ", color='" + color + '\'' +
      '}';
  }
}
