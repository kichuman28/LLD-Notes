package StrategyPattern;

public class Main{
    public static void main(String[] args) {

        PaymentApp creditPaymentApp = new PaymentApp(new CreditCard());
        creditPaymentApp.pay();

        PaymentApp payPalApp = new PaymentApp(new PayPal());
        payPalApp.pay();

        PaymentApp googlePayApp = new PaymentApp(new GooglePay());
        googlePayApp.pay();

    }
}