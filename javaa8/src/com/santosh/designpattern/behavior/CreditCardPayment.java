package com.santosh.designpattern.behavior;

public class CreditCardPayment implements ICardPayment {

  public boolean payBill(Double bilAmt){
    System.out.println("Paying bill using Credit Card"+bilAmt);
    return true;
  }
}
