package strategy.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem (Item item){
        items.add(item);
    }

    public void removeItem (Item item){
        items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for (Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    public void pay (PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
