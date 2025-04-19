package chain_of_responsibility.example;

import test.HelperMethods;

public final class ClientChainOfResponsibility {
    private ClientChainOfResponsibility(){}

    public static void chainOfRespExample(){
        HelperMethods.separateExamples();

        DispenseChain c1;
        c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        int amount = 190;

        c1.dispense(new Currency(amount));


        HelperMethods.separateExamples();
    }
}
