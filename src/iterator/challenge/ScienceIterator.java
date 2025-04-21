package iterator.challenge;

import java.util.LinkedList;

public class ScienceIterator implements IteratorInterface {
    LinkedList<String> data;

    int position = 0;

    public ScienceIterator(LinkedList<String> data) {
        this.data = data;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        String subject = data.get(position);
        position++;
        return subject;
    }

    @Override
    public boolean isDone() {
        if (position >= data.size()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String currentItem() {
        return data.get(position);
    }
}
