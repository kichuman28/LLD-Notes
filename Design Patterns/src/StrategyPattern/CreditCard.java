package StrategyPattern;

public class CreditCard implements PaymentSoftware{
    public void pay(){
        System.out.println("Successfully paid using credit card");
    }
}
