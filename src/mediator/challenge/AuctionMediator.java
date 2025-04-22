package mediator.challenge;

public interface AuctionMediator {
    void addBuyer(Buyer buyer);
    void findAuctionWinner();
    void auctionEnded();
}
