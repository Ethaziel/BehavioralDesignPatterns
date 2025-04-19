package chain_of_responsibility.challenge;

public enum MessagePriority {
    NORMAL ("Normal"),
    HIGH ("High");

    public final String label;

    private MessagePriority (String label){
        this.label = label;
    }

}
