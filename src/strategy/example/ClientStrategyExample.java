package strategy.example;

import test.HelperMethods;

public final class ClientStrategyExample {
    private ClientStrategyExample(){}

    public static void strategyExample(){
        HelperMethods.separateExamples();

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1489", 1589);
        Item item2 = new Item("6547", 2589);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("xxxyyy@gmail.com", "password"));

        cart.pay(new CreditCardStrategy("Tatka Smoula", "9630258741236587", "789", "01/30"));

        HelperMethods.separateExamples();
    }
}
