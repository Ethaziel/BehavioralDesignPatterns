package mediator.challenge;

public class AuctionBuyer extends Buyer{

    public AuctionBuyer(String name, AuctionMediator mediator) {
        super(name, mediator);
    }

    @Override
    void bid(int bid) {
        this.price = bid;
    }

    @Override
    void cancelBid() {
        System.out.println(name + " canceled the bid!");
        price = 0;
        mediator.findAuctionWinner();
    }

    @Override
    void auctionEnded() {
        System.out.println(name + " has been notified that auction has ended.");
    }
}
