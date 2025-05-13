package visitor.challenge;

public class DVD implements Element{
    private int price;
    private int weight;

    public DVD(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
