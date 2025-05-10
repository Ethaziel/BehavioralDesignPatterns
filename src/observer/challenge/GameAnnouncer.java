package observer.challenge;

import java.util.ArrayList;

public class GameAnnouncer implements Subject{
    private int run;
    private int wickets;
    private int overs;

    private ArrayList<Observer> viewers;
    private boolean changed;

    public GameAnnouncer() {
        viewers = new ArrayList<>();
        run = 0;
        wickets = 0;
        overs = 0;
    }

    @Override
    public void register(Observer obs) {
        if (!viewers.contains(obs)){
            viewers.add(obs);
        }
    }

    @Override
    public void unregister(Observer obs) {
        viewers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        if (!changed) {
            return;
        }
        ArrayList<Observer> viewersTemp = new ArrayList<>(viewers);

        changed = false;
        for (Observer obs : viewersTemp){
            obs.update(run, wickets, overs);
        }

    }

    public void addRuns(){
        run++;
        changed = true;
        notifyObservers();
    }

    public void addWickets(){
        wickets++;
        changed = true;
        notifyObservers();
    }

    public void addOvers(){
        overs++;
        changed = true;
        notifyObservers();
    }

    public void addRuns(int runs){
        run += runs;
        changed = true;
        notifyObservers();
    }

    public void addWickets(int wickets){
        this.wickets += wickets;
        changed = true;
        notifyObservers();
    }

    public void addOvers(int overs){
        this.overs += overs;
        changed = true;
        notifyObservers();
    }
}
