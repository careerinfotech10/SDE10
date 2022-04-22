package com.santosh.designpattern.behavior;

public class DebitCardPayment implements ICardPayment {

  public boolean payBill(Double bilAmt){
    System.out.println("Paying bill using Debit Card"+bilAmt);
    return true;
  }
}
