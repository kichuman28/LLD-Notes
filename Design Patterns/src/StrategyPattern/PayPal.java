package StrategyPattern;

public class PayPal implements PaymentSoftware{
    public void pay(){
        System.out.println("Payment using PayPal is successful");
    }
}
