package iterator.example;

public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications (){
        Iterator iterator = notifications.createIterator();
        while (iterator.hasNext()){
            Notification n  = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
