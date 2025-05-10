package observer.example;

import test.HelperMethods;

public final class ClientObserverExample {
    private ClientObserverExample(){}

    public static void observerExample(){
        HelperMethods.separateExamples();

        MyTopic topic = new MyTopic();

        Observer observer1 = new MyTopicSubscriber("Observer 1");
        Observer observer2 = new MyTopicSubscriber("Observer 2");
        Observer observer3 = new MyTopicSubscriber("Observer 3");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();

        topic.postMessage("Hello World!!");

        HelperMethods.separateExamples();
    }
}
