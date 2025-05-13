package visitor.example;

import test.HelperMethods;

public final class ClientVisitorExample {
    private ClientVisitorExample(){}

    public static void visitorExample(){
        HelperMethods.separateExamples();

        ItemElement[] items = new ItemElement[]{new Book(35, "48846"), new Book(59, "69512"),
            new Fruit(24, 3, "Strawberries"), new Fruit(13, 2, "Apple"), new Fruit(31, 8, "Watermelon")};

        int total = calculatePrice(items);

        System.out.println("Total cost: " + total);

        HelperMethods.separateExamples();
    }

    private static int calculatePrice(ItemElement[] items){
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement item : items){
            sum += item.accept(visitor);
        }

        return sum;
    }
}
