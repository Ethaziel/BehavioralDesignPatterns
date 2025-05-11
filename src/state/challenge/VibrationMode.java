package state.challenge;

public class VibrationMode implements State{
    @Override
    public void alert() {
        System.out.println("Vibration Mode: Vibrating.");
    }

    @Override
    public void pressChangeButton(Cellphone device) {
        System.out.println("Switching from vibration mode to silent mode...");
        device.setMode(new SilentMode());
    }

    @Override
    public void pressAirplaneButton(Cellphone device) {
        System.out.println("Switching from vibration mode to airplane mode...");
        device.setMode(new AirplaneMode(this));
    }
}
