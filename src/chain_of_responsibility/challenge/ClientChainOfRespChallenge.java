package chain_of_responsibility.challenge;

import test.HelperMethods;

public final class ClientChainOfRespChallenge {
    private ClientChainOfRespChallenge(){}

    public static void chainOfRespChallenge (){
        HelperMethods.separateExamples();

        ReceiverInterface faxHandler = new FaxErrorHandler();
        ReceiverInterface emailHandler = new EmailErrorHandler();
        faxHandler.setNextChain(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        raiser.raiseMessage(new Message(MessagePriority.HIGH, "I got e-mail with no text."));
        raiser.raiseMessage(new Message(MessagePriority.NORMAL, "This fax make no sense."));
        raiser.raiseMessage(new Message(MessagePriority.NORMAL, "I received an e-mail with a picture."));
        raiser.raiseMessage(new Message(MessagePriority.HIGH, "My fax is making funny noises."));
        raiser.raiseMessage(new Message(MessagePriority.HIGH, "My phone does not work."));
        raiser.raiseMessage(new Message(MessagePriority.NORMAL, "My phone, fax and e-mail do not work."));

        HelperMethods.separateExamples();
    }
}
