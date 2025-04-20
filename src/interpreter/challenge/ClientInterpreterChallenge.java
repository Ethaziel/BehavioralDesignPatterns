package interpreter.challenge;

import test.HelperMethods;

public final class ClientInterpreterChallenge {
    private ClientInterpreterChallenge(){}

    public static void interpreterChallenge(){
        HelperMethods.separateExamples();

        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedFemaleExpression();

        InterpreterContext context = new InterpreterContext("John");
        System.out.println("Is John male? " + isMale.interpret(context));

        InterpreterContext context2 = new InterpreterContext("Married Julie");
        System.out.println("Is Julie a married woman? " + isMarriedWoman.interpret(context2));

        InterpreterContext context3 = new InterpreterContext("Lucy");
        System.out.println("Is Lucy male? " + isMale.interpret(context3));

        HelperMethods.separateExamples();
    }

    private static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    private static Expression getMarriedFemaleExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }
}
