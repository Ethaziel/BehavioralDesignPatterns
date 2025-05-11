package strategy.example;

public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}

class PaypalStrategy implements PaymentStrategy{
    private String email_id;
    private String password;

    public PaypalStrategy(String email_id, String password) {
        this.email_id = email_id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with paypal.");
    }
}