package state.challenge;

public class SilentMode implements State{
    @Override
    public void alert() {
        System.out.println("Silent mode: No ringing, no vibrating, just showing the call...");
    }

    @Override
    public void pressChangeButton(Cellphone device) {
        System.out.println("Switching from silent mode to normal mode...");
        device.setMode(new NormalMode());
    }

    @Override
    public void pressAirplaneButton(Cellphone device) {
        System.out.println("Switching from silent mode to airplane mode...");
        device.setMode(new AirplaneMode(this));
    }
}
