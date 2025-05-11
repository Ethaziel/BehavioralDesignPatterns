package state.challenge;

public class AirplaneMode implements State{
    private State previousState;

    public AirplaneMode(State previousState) {
        this.previousState = previousState;
    }

    @Override
    public void alert() {
        System.out.println("Airplane mode: doing nothing...");
    }

    @Override
    public void pressChangeButton(Cellphone device) {
        System.out.println("Airplane mode: no change of mode allowed.");

    }

    @Override
    public void pressAirplaneButton(Cellphone device) {
        System.out.println("Turning the airplane mode off.");
        if (previousState == null){
            device.setMode(new NormalMode());
        } else {
            device.setMode(previousState);
        }
    }
}
