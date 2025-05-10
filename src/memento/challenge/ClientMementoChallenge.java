package memento.challenge;

import test.HelperMethods;

public final class ClientMementoChallenge {
    private ClientMementoChallenge(){}

    public static void mementoChallenge(){
        HelperMethods.separateExamples();

        MovieCounter counter = new MovieCounter(0,0,0);
        Caretaker caretaker = new Caretaker();

        counter.addAction();
        counter.addComedy();
        counter.addAction();
        caretaker.add(counter.saveToMemento());

        System.out.println("Current state: \n" + counter);

        counter.addHorror();
        counter.addHorror();
        counter.addAction();
        counter.addComedy();
        counter.addComedy();

        caretaker.add(counter.saveToMemento());

        System.out.println("Current state:\n" + counter);

        counter.addComedy();
        counter.addComedy();
        counter.addComedy();
        counter.addComedy();
        counter.addAction();
        counter.addAction();

        caretaker.add(counter.saveToMemento());

        System.out.println("Current state:\n" + counter);

        counter.restoreFromMemento(caretaker.get(1));

        System.out.println("Current state:\n" + counter);

        counter.restoreFromMemento(caretaker.get(2));

        System.out.println("Current state:\n" + counter);

        caretaker.showAllMementos();

        HelperMethods.separateExamples();
    }

}
