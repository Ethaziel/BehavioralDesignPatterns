package template_method.challenge;

import java.util.Random;

public class NetOrder extends OrderProcessTemplate{
    @Override
    public void doSelect() {
        System.out.println("Selected online and put into the shopping cart.");
    }

    @Override
    public void doPayment() {
        Random r = new Random();
        if (r.nextInt(2) == 1){
            System.out.println("Paid with credit card.");
        } else {
            System.out.println("Paid with paypal.");
        }
    }
}
