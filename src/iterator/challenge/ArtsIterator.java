package iterator.challenge;

public class ArtsIterator implements IteratorInterface{
    String [] data;

    private int position = 0;

    public ArtsIterator(String[] data) {
        this.data = data;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        String subject = data[position];
        position++;
        return subject;
    }

    @Override
    public boolean isDone() {
        if (position >= data.length){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String currentItem() {
        return data[position];
    }
}
