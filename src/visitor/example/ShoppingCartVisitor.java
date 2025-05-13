package visitor.example;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50){
            cost = book.getPrice() - 5; // discount
        } else {
            cost = book.getPrice();
        }
        System.out.println("Book ISBN: " + book.getIsbnNumber() + ", cost: " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit: " + fruit.getName() + ", cost: " + cost);
        return cost;
    }
}
