package StrategyPattern;

public class GooglePay implements PaymentSoftware{
    public void pay(){
        System.out.println("Payment using Google Pay is successful");
    }
}
