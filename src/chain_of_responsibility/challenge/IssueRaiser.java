package chain_of_responsibility.challenge;

public class IssueRaiser {
    public ReceiverInterface setFirstHandler;

    public IssueRaiser(ReceiverInterface setFirstHandler) {
        this.setFirstHandler = setFirstHandler;
    }

    public void raiseMessage(Message message){
        if (setFirstHandler != null){
            setFirstHandler.processMessage(message);
        }
    }

}
