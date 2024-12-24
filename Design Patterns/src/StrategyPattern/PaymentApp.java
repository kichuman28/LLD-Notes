package StrategyPattern;

public class PaymentApp {
    private PaymentSoftware paymentSoftware;

    public PaymentApp(PaymentSoftware paymentSoftware){
        this.paymentSoftware = paymentSoftware;
    }

    public void pay(){
        this.paymentSoftware.pay();
    }
}
