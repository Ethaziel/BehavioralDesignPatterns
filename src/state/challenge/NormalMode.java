package state.challenge;

public class NormalMode implements State{
    @Override
    public void alert() {
        System.out.println("Normal mode: Ringing and vibrating!");
    }

    @Override
    public void pressChangeButton(Cellphone device) {
        System.out.println("Switching from normal mode to vibration mode...");
        device.setMode(new VibrationMode());
    }

    @Override
    public void pressAirplaneButton(Cellphone device) {
        System.out.println("Switching from normal mode to airplane mode...");
        device.setMode(new AirplaneMode(this));
    }
}
