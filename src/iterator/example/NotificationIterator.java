package iterator.example;

public class NotificationIterator implements Iterator{
    Notification [] notificationList;

    int position = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public Object next() {
        Notification notification = notificationList[position];
        position++;
        return notification;
    }

    @Override
    public boolean hasNext() {
        if (position >= notificationList.length || notificationList[position] == null){
            return false;
        } else {
            return true;
        }
    }
}
