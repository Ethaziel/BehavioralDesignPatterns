package template_method.challenge;

import test.HelperMethods;

public final class ClientTemplateMethodChallenge {
    private ClientTemplateMethodChallenge(){}

    public static void templateMethodChallenge(){
        HelperMethods.separateExamples();

        OrderProcessTemplate orderType = new NetOrder();
        orderType.processOrder();

        System.out.println("--------------------");

        orderType.processOrder();

        System.out.println("--------------------");

        orderType = new StoreOrder();
        orderType.processOrder();

        HelperMethods.separateExamples();
    }

}
