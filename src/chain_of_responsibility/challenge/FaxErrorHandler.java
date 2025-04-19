package chain_of_responsibility.challenge;

public class FaxErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextChain;

    @Override
    public void setNextChain(ReceiverInterface nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void processMessage(Message message) {
        if (message.getText().toLowerCase().contains("fax")){
            System.out.println("This is a fax with " + message.getPriority().label + " priority.");
            System.out.println("\tThe message is: " + message.getText());
        } else {
            if (nextChain != null){
                nextChain.processMessage(message);
            } else {
                System.out.println("This message could not be handled.");
            }
        }
    }
}
