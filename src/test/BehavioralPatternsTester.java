package test;

import command.challenge.ClientCommandChallenge;
import command.example.ClientCommandExample;
import interpreter.challenge.ClientInterpreterChallenge;
import interpreter.example.ClientInterpreterExample;
import iterator.challenge.ClientIteratorChallenge;
import iterator.example.ClientIteratorExample;
import mediator.challenge.ClientMediatorChallenge;
import mediator.example.ClientMediatorExample;
import memento.challenge.ClientMementoChallenge;
import memento.example.ClientMementoExample;
import observer.challenge.ClientObserverChallenge;
import observer.example.ClientObserverExample;

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
//        ClientIteratorExample.iteratorExample();

        // run the iterator challenge
//        ClientIteratorChallenge.iteratorChallenge();

        // run the mediator example
//        ClientMediatorExample.mediatorExample();

        // run the mediator challenge
//        ClientMediatorChallenge.mediatorChallenge();

        // run the memento example
//        ClientMementoExample.mementoExample();

        // run the memento challenge
//        ClientMementoChallenge.mementoChallenge();

        // run the observer example
        ClientObserverExample.observerExample();

        // run the observer challenge
        ClientObserverChallenge.observerChallenge();



    }
}
