package observer.example;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);

    void notifyObservers();

    Object getUpdate(Observer o);
}

class MyTopic implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();

    }

    @Override
    public void register(Observer o) {
        if (o == null){
            throw new NullPointerException("Null Observer");
        }
        if (!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        if (!changed){
            return;
        }
        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;

        for (Observer o : observersLocal){
            o.update();
        }
    }

    @Override
    public Object getUpdate(Observer o) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Posted message: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
