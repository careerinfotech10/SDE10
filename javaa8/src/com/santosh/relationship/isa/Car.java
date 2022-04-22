package com.santosh.relationship.isa;

public class Car {
  String color;
  String name;

  public Car() {
  }

  public Car(String color, String name) {
    this.color = color;
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public  void showCarDetails()
  {
    System.out.println("display car information");
  }
}
