package observer.challenge;

public interface Subject {
    void register(Observer obs);
    void unregister(Observer obs);
    void notifyObservers();
}
