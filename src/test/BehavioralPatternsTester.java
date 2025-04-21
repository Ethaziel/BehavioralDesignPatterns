package test;

import command.challenge.ClientCommandChallenge;
import command.example.ClientCommandExample;
import interpreter.challenge.ClientInterpreterChallenge;
import interpreter.example.ClientInterpreterExample;
import iterator.challenge.ClientIteratorChallenge;
import iterator.example.ClientIteratorExample;

public class BehavioralPatternsTester {
    public static void main(String[] args) {

        // run the chain of responsibility example
//        ClientChainOfResponsibility.chainOfRespExample();

        // run the chain of responsibility challenge
//        ClientChainOfRespChallenge.chainOfRespChallenge();

        // run the command example
//        ClientCommandExample.commandExample();

        // run the command challenge
//        ClientCommandChallenge.commandChallenge();

        // run the interpreter example
//        ClientInterpreterExample.interpreterExample();

        // run the interpreter challenge
//        ClientInterpreterChallenge.interpreterChallenge();

        // run the iterator example
        ClientIteratorExample.iteratorExample();

        // run the iterator challenge
        ClientIteratorChallenge.iteratorChallenge();

    }
}
