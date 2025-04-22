package mediator.challenge;

import java.util.ArrayList;

public class AuctionMediatorImpl implements AuctionMediator{
    private ArrayList<Buyer> buyers;

    public AuctionMediatorImpl() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    @Override
    public void findAuctionWinner() {
        int maxBid = 0;
        Buyer highestBidder = null;
        for (Buyer b : buyers){
            if (b.price > maxBid){
                maxBid = b.price;
                highestBidder = b;
            }
        }
        System.out.println("The auction winner is: " + highestBidder.name + ", he offered " + highestBidder.price + "$.");
    }

    @Override
    public void auctionEnded() {
        for (Buyer b : buyers){
            b.auctionEnded();
        }
    }
}
