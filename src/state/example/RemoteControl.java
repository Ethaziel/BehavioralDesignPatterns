package state.example;

public abstract class RemoteControl {
    abstract void pressSwitch(TV context);
}

class On extends RemoteControl{
    @Override
    void pressSwitch(TV context) {
        System.out.println("I am already on, so I am going to be off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl{
    @Override
    void pressSwitch(TV context) {
        System.out.println("I am already off, so I am going to be on now");
        context.setState(new On());
    }
}
