package visitor.challenge;

public class USPostageVisitor implements ShippingVisitor{
    private double totalPostage = 0;
    private int totalPrice = 0;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
        totalPostage += book.getWeight() * 2;
    }

    @Override
    public void visit(CD cd) {
        totalPrice += cd.getPrice();
        totalPostage += cd.getWeight() * 2.5;
    }

    @Override
    public void visit(DVD dvd) {
        totalPrice += dvd.getPrice();
        totalPostage += dvd.getWeight() * 3;
    }

    public double getTotalPostage(){
        if (totalPrice > 20){
            totalPostage = 0;
            System.out.println("Free shipping!");
        }
        return totalPostage;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
