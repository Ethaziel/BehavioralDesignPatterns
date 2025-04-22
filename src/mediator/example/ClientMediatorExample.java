package mediator.example;

import test.HelperMethods;

public final class ClientMediatorExample {
    private ClientMediatorExample (){}

    public static void mediatorExample(){
        HelperMethods.separateExamples();

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Petr");
        User user2 = new UserImpl(mediator, "John");
        User user3 = new UserImpl(mediator, "Mark");
        User user4 = new UserImpl(mediator, "Jenny");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi everyone!");

        HelperMethods.separateExamples();
    }
}
