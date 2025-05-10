package memento.challenge;

public class Memento {
    private int comedies;
    private int horrors;
    private int actions;

    public Memento(int comedies, int horrors, int actions) {
        this.comedies = comedies;
        this.horrors = horrors;
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Saved state: "
                + comedies + " comedies, "
                + horrors + " horrors, "
                + actions + " action movies.";
    }

    public int getComedies(){
        return comedies;
    }

    public int getHorrors() {
        return horrors;
    }

    public int getActions() {
        return actions;
    }
}
