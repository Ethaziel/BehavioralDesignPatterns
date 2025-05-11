package state.challenge;

import test.HelperMethods;

public final class ClientStateChallenge {
    private ClientStateChallenge(){}

    public static void stateChallenge(){
        HelperMethods.separateExamples();

        Cellphone phone = new Cellphone(new NormalMode());

        phone.alert();
        phone.pressModeButton();
        phone.alert();
        phone.alert();

        phone.pressAirplaneModeButton();
        phone.alert();
        phone.pressModeButton();
        phone.alert();

        phone.pressAirplaneModeButton();
        phone.alert();

        phone.pressModeButton();
        phone.alert();

        phone.pressAirplaneModeButton();
        phone.alert();
        phone.pressModeButton();
        phone.alert();
        phone.pressAirplaneModeButton();
        phone.alert();

        phone.pressModeButton();
        phone.alert();


        HelperMethods.separateExamples();
    }
}
