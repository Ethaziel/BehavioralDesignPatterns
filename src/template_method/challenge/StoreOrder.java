package template_method.challenge;

import java.util.Random;

public class StoreOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Selected from the shelf in the store.");
    }

    @Override
    public void doPayment() {
        Random r = new Random();
        if (r.nextInt(2) == 1){
            System.out.println("Paid with credit card.");
        } else {
            System.out.println("Paid with cash.");
        }
    }

    @Override
    protected void delivery() {
        System.out.println("Picked up at counter in the store.");
    }
}
