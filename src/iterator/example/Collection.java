package iterator.example;

public interface Collection {
    Iterator createIterator();
}

class NotificationCollection implements Collection{
    static final int MAX_ITEMS = 6;
    int numOfItems = 0;
    Notification [] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str){
        Notification notification = new Notification(str);

        if (numOfItems >= MAX_ITEMS){
            System.err.println("Full");
        } else {
            notificationList[numOfItems] = notification;
            numOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}