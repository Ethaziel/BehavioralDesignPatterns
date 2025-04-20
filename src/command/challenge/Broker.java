package command.challenge;

import java.util.ArrayList;

public class Broker {

    private ArrayList<OrderInterface> orders;

    public Broker(){
        orders = new ArrayList<>();
    }

    public void takeOrder (OrderInterface newOrder){
        orders.add(newOrder);
    }

    public void placeOrders (){
        for (OrderInterface o : orders){
            o.execute();
        }
        orders.clear();
    }
}
