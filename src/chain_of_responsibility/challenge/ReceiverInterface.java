package chain_of_responsibility.challenge;

public interface ReceiverInterface {
    void setNextChain(ReceiverInterface nextChain);
    void processMessage(Message message);
}
