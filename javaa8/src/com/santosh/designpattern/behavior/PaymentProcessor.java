package com.santosh.designpattern.behavior;

public class PaymentProcessor {

  private ICardPayment iCardPayment;

  public PaymentProcessor(ICardPayment iCardPayment) {
    this.iCardPayment = iCardPayment;
  }

  public PaymentProcessor() {
  }

  public void setiCardPayment(ICardPayment iCardPayment) {
    this.iCardPayment = iCardPayment;
  }
  public boolean doPayment(Double amount){
    return iCardPayment.payBill(amount);
    }


    public boolean doPayment(String cardType,Double amount){
  if ("CREDIT_CARD".equalsIgnoreCase(cardType)){
    return  iCardPayment.payBill(amount);
      }
  else if ("DEBIT_CARD".equalsIgnoreCase(cardType)){
    return  iCardPayment.payBill(amount);
  }
  else if ("ZETA_CARD".equalsIgnoreCase(cardType)){
    return  iCardPayment.payBill(amount);
  }
  else if ("AMEX_CARD".equalsIgnoreCase(cardType)){
    return  iCardPayment.payBill(amount);
  }  return false;
}

}
