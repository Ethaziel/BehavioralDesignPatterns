package command.challenge;

public class Stock {
    private String stockName;
    private int stockAmount;

    public Stock(String stockName, int stockAmount) {
        this.stockName = stockName;
        this.stockAmount = stockAmount;
    }

    public void buy(){
        System.out.println("Buying " + stockAmount + " of " + stockName + " stock.");
    }

    public void sell(){
        System.out.println("Selling " + stockAmount + " of " + stockName + "stock.");
    }
}
