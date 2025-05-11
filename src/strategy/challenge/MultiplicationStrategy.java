package strategy.challenge;

public class MultiplicationStrategy implements MathStrategy{

    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
