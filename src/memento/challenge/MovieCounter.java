package memento.challenge;

// originator
public class MovieCounter {
    private int comedies;
    private int horrors;
    private int actions;

    public MovieCounter(int comedies, int horrors, int actions) {
        this.comedies = comedies;
        this.horrors = horrors;
        this.actions = actions;
    }

    public Memento saveToMemento (){
        return new Memento(comedies, horrors, actions);
    }

    public void restoreFromMemento(Memento memento){
        comedies = memento.getComedies();
        horrors = memento.getHorrors();
        actions = memento.getActions();
    }

    public void addComedy (){
        comedies++;
    }

    public void addHorror(){
        horrors++;
    }

    public void addAction(){
        actions++;
    }

    @Override
    public String toString() {
        return "Watched movies so far: "
                + comedies + " comedies, "
                + horrors + " horrors, "
                + actions + " action movies.";
    }

    public int getComedies() {
        return comedies;
    }

    public void setComedies(int comedies) {
        this.comedies = comedies;
    }

    public int getHorrors() {
        return horrors;
    }

    public void setHorrors(int horrors) {
        this.horrors = horrors;
    }

    public int getActions() {
        return actions;
    }

    public void setActions(int actions) {
        this.actions = actions;
    }
}
