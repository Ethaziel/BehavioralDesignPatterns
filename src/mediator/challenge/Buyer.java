package mediator.challenge;

public abstract class Buyer {
    protected String name;
    protected int price;
    protected AuctionMediator mediator;

    public Buyer(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void bid(int bid);
    abstract void cancelBid();
    abstract void auctionEnded();
}
