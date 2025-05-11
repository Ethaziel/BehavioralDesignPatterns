package strategy.challenge;

public class CalculatorContext {

    public int executeStrategy (MathStrategy strategy, int num1, int num2){
        return strategy.performOperation(num1, num2);
    }
}
