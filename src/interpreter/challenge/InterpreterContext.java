package interpreter.challenge;

public class InterpreterContext {
    private String input;

    public InterpreterContext(String input) {
        this.input = input;
    }

    public boolean getResult(String data){
        if (input.contains(data)){
            return true;
        } else {
            return false;
        }
    }

}
