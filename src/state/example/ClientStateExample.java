package state.example;

import test.HelperMethods;

public final class ClientStateExample {
    private ClientStateExample(){}

    public static void stateExample(){
        HelperMethods.separateExamples();

        Off initialState = new Off();

        TV tv = new TV(initialState);

        tv.pressButton();
        tv.pressButton();

        HelperMethods.separateExamples();
    }
}
