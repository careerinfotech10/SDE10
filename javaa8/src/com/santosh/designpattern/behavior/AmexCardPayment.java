package com.santosh.designpattern.behavior;

public class AmexCardPayment implements ICardPayment{

  public boolean payBill(Double bilAmt){
    System.out.println("Paying bill using Amex Card"+bilAmt);
    return true;
  }
}
