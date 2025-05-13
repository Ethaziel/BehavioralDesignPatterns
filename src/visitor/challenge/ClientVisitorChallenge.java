package visitor.challenge;

import test.HelperMethods;

import java.util.ArrayList;

public final class ClientVisitorChallenge {
    private ClientVisitorChallenge(){}

    public static void visitorChallenge(){
        HelperMethods.separateExamples();

        USPostageVisitor usPostageVisitor = new USPostageVisitor();
        SouthAmericaPostageVisitor saPostageVisitor = new SouthAmericaPostageVisitor();

        ArrayList<Element> items = new ArrayList<>();
        items.add(new Book(3, 3));
        items.add(new Book(4, 4));
        items.add(new CD(5, 1));
        items.add(new DVD(3, 1));
        items.add(new CD(2, 1));
        items.add(new DVD(1, 1));
        items.add(new Book(3, 1));

        for (Element e : items){
            e.accept(usPostageVisitor);
        }

        System.out.println("Total price for order in US: " + usPostageVisitor.getTotalPrice()
                + ", total shipping is: " + usPostageVisitor.getTotalPostage());

        for (Element e : items){
            e.accept(saPostageVisitor);
        }

        System.out.println("Total price for order in South America: " + saPostageVisitor.getTotalPrice()
                + ", total shipping is: " + saPostageVisitor.getTotalPostage());



        HelperMethods.separateExamples();
    }
}
