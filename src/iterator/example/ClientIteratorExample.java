package iterator.example;

import test.HelperMethods;

public final class ClientIteratorExample {
    private ClientIteratorExample(){}

    public static void iteratorExample(){
        HelperMethods.separateExamples();

        NotificationCollection nc = new NotificationCollection();
        NotificationBar bar = new NotificationBar(nc);
        bar.printNotifications();

        HelperMethods.separateExamples();
    }
}
