package interpreter.challenge;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return context.getResult(data);
    }
}
