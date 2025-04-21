package iterator.challenge;

public class ArtDepartment implements SubjectInterface{
    String [] subjects;

    public ArtDepartment(int amount) {
        subjects = new String[amount];
        for (int i = 0; i < subjects.length; i++){
            subjects[i] = "Some subject " + (i + 1);
        }
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}
