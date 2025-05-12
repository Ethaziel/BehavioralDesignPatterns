package template_method.example;

import test.HelperMethods;

public final class ClientTemplateMethodExample {
    private ClientTemplateMethodExample(){}

    public static void templateMethodExample(){
        HelperMethods.separateExamples();

        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();

        System.out.println("------------------------");

        houseType = new GlassHouse();
        houseType.buildHouse();

        HelperMethods.separateExamples();
    }

}
