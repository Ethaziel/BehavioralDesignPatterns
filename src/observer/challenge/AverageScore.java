package observer.challenge;

public class AverageScore implements Observer{
    int runs;
    int wickets;
    int overs;

    public AverageScore() {
        runs = 0;
        wickets = 0;
        overs = 0;
    }

    @Override
    public void update(int run, int wickets, int overs) {
        this.runs = run;
        this.wickets = wickets;
        this.overs = overs;

        System.out.println("Update received...");
    }

    public float calculateRunRate(){
        return (float) runs / overs;
    }

    public float calculatePredictedScore(){
        return calculateRunRate() * 50;
    }

}
