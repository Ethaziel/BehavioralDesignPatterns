package state.challenge;

public class Cellphone {
    private State mode;

    public Cellphone(State mode) {
        this.mode = mode;
    }

    public void setMode(State mode) {
        this.mode = mode;
    }

    public State getMode() {
        return mode;
    }

    public void alert(){
        mode.alert();
    }

    public void pressModeButton(){
        mode.pressChangeButton(this);
    }

    public void pressAirplaneModeButton(){
        mode.pressAirplaneButton(this);
    }
}
