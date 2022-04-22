package com.santosh.designpattern.behavior;

public class ZetaCardPayment implements ICardPayment {

  public boolean payBill(Double bilAmt){
    System.out.println("Paying bill using Zeta Card"+bilAmt);
    return true;
  }
}
