package template_method.challenge;

import java.util.Random;

public abstract class OrderProcessTemplate {

    public final void processOrder(){
        doSelect();
        doPayment();
        delivery();
        giftWrapping();
        System.out.println("Order processed successfully.");
    }

    public abstract void doSelect();
    public abstract void doPayment();

    protected void delivery (){
        System.out.println("Delivery method: Pick-up box.");
    }

    private void giftWrapping(){
        Random r = new Random();
        if (r.nextInt(2) == 1){
            System.out.println("Do gift wrapping.");
        } else {
            System.out.println("Dont do gift wrapping.");
        }
    }

}
