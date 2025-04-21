package iterator.challenge;

import java.util.LinkedList;

public class ScienceDepartment implements SubjectInterface{
    private LinkedList<String> subjects;

    public ScienceDepartment(int amount) {
        subjects = new LinkedList<>();

        for (int i = 0; i < amount; i++){
            subjects.add("Some science subject " + (i + 1));
        }
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}
