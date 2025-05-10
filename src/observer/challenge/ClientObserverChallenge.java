package observer.challenge;

import test.HelperMethods;

public final class ClientObserverChallenge {
    private ClientObserverChallenge(){}

    public static void observerChallenge(){
        HelperMethods.separateExamples();

        GameAnnouncer announcer = new GameAnnouncer();

        AverageScore averageScoreObserver = new AverageScore();
        CurrentScore currentScoreObserver = new CurrentScore();

        announcer.register(averageScoreObserver);
        announcer.register(currentScoreObserver);

        announcer.addOvers();
        announcer.addRuns();
        announcer.addWickets();

        System.out.println("Predicted score: " + averageScoreObserver.calculatePredictedScore());

        announcer.addWickets(15);
        announcer.addRuns(18);
        announcer.addOvers(7);

        System.out.println("Predicted score: " + averageScoreObserver.calculatePredictedScore());

        announcer.unregister(currentScoreObserver);

        announcer.addOvers();

        System.out.println("Predicted score: " + averageScoreObserver.calculatePredictedScore());


        HelperMethods.separateExamples();
    }
}
