package observer.challenge;

public class CurrentScore implements Observer{
    private int runs;
    private int wickets;
    private int overs;

    public CurrentScore() {
        runs = 0;
        wickets = 0;
        overs = 0;
    }

    @Override
    public void update(int run, int wickets, int overs) {
        this.runs = run;
        this.wickets = wickets;
        this.overs = overs;

        showCurrentStats();
    }

    public void showCurrentStats (){
        System.out.println("Game update:\n\tCurrent stats: "
                + this.runs + " runs, "
                + this.wickets + " wickets, "
                + this.overs + " overs.");
    }
}
