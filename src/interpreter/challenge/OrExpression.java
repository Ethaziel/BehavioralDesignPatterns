package interpreter.challenge;

public class OrExpression implements Expression{
    private Expression exp1 = null;
    private Expression exp2 = null;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
