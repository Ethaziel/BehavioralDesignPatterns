package interpreter.example;

public interface Expression {
    String interpret(InterpreterContext ic);
}

class IntToBinaryExpression implements Expression{
    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }
}

class IntToHexExpression implements Expression{
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
