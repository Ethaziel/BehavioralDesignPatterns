package command.challenge;

import test.HelperMethods;

public final class ClientCommandChallenge {
    private ClientCommandChallenge(){}

    public static void commandChallenge (){
        HelperMethods.separateExamples();

        Stock stock1 = new Stock("Google", 1500);
        Stock stock2 = new Stock("Amazon", 130);

        OrderInterface order1 = new BuyOrder(stock1);
        OrderInterface order2 = new SellOrder(stock2);
        Broker broker = new Broker();

        broker.takeOrder(order1);
        broker.takeOrder(order2);

        order1 = new SellOrder(stock1);
        broker.takeOrder(order1);

        broker.placeOrders();

        HelperMethods.separateExamples();
    }
}
