package com.santosh.overriding;

public class Derived extends  Base{

  public static void main(String[] args) {
    Derived d=new Derived();
    d.show();
  }

  @Override
  public void show() {
    System.out.println("hi dervied");
  }
}
