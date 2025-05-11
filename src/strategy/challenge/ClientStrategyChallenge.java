package strategy.challenge;

import test.HelperMethods;

public final class ClientStrategyChallenge {
    private ClientStrategyChallenge(){}

    public static void strategyChallenge(){
        HelperMethods.separateExamples();

        CalculatorContext context = new CalculatorContext();

        int result = context.executeStrategy(new AdditionStrategy(), 10, 5);
        System.out.println("10 + 5 = " + result);

        result = context.executeStrategy(new SubtractionStrategy(), 10, 5);
        System.out.println("10 - 5 = " + result);

        result = context.executeStrategy(new MultiplicationStrategy(), 10, 5);
        System.out.println("10 * 5 = " + result);

        HelperMethods.separateExamples();
    }
}
