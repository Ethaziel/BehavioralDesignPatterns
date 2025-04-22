package mediator.challenge;

import test.HelperMethods;

public final class ClientMediatorChallenge {
    private ClientMediatorChallenge(){}

    public static void mediatorChallenge(){
        HelperMethods.separateExamples();

        AuctionMediator mediator = new AuctionMediatorImpl();
        Buyer buyer1 = new AuctionBuyer("John", mediator);
        Buyer buyer2 = new AuctionBuyer("Clark", mediator);
        Buyer buyer3 = new AuctionBuyer("Maria", mediator);
        Buyer buyer4 = new AuctionBuyer("Tim", mediator);

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        mediator.addBuyer(buyer4);

        buyer1.bid(1500);
        buyer2.bid(2200);
        buyer3.bid(1700);
        buyer4.bid(1800);

        mediator.findAuctionWinner();

        buyer2.cancelBid();
        buyer3.cancelBid();

        mediator.auctionEnded();

        HelperMethods.separateExamples();
    }
}
