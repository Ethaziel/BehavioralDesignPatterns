package interpreter.example;

import test.HelperMethods;

public final class ClientInterpreterExample {
    private ClientInterpreterExample(){}

    private static InterpreterContext ic;

    public static void interpreterExample(){
        HelperMethods.separateExamples();

        String s1 = "28 in Binary";
        String s2 = "28 in Hexadecimal";

        ic = new InterpreterContext();
        System.out.println(s1 + " = " + interpret(s1));
        System.out.println(s2 + " = " + interpret(s2));

        HelperMethods.separateExamples();
    }

    private static String interpret(String str){
        Expression exp = null;

        if (str.contains("Hexadecimal")){
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));

        } else if (str.contains("Binary")){
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }

        return exp.interpret(ic);
    }
}
