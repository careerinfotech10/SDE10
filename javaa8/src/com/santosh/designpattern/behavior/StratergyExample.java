package com.santosh.designpattern.behavior;

public class StratergyExample {

  public static void main(String[] args) {


    PaymentProcessor p=new PaymentProcessor();
    p.setiCardPayment(new ZetaCardPayment());
    boolean paid = p.doPayment("ZETA_CARD", 3450.00);
    if (paid) {
      System.out.println("Payment paid successfully");
    }
    else {
      System.out.println("payment failed");
    }
  }
}
