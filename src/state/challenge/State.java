package state.challenge;

public interface State {
    void alert();
    void pressChangeButton(Cellphone device);
    void pressAirplaneButton(Cellphone device);
}
