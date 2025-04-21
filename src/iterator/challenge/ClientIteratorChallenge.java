package iterator.challenge;

import test.HelperMethods;

public final class ClientIteratorChallenge {
    private ClientIteratorChallenge(){}

    public static void iteratorChallenge(){
        HelperMethods.separateExamples();

        ArtDepartment arts = new ArtDepartment(7);
        ScienceDepartment science = new ScienceDepartment(4);
        IteratorInterface iterator = arts.createIterator();

        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
        iterator.first();
        System.out.println(iterator.currentItem());

        iterator = science.createIterator();

        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
        iterator.first();
        System.out.println(iterator.currentItem());

        HelperMethods.separateExamples();
    }
}
