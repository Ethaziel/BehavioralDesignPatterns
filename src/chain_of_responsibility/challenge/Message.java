package chain_of_responsibility.challenge;

public class Message {
    private MessagePriority priority;
    private String text;

    public Message(MessagePriority priority, String text) {
        this.priority = priority;
        this.text = text;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public String getText() {
        return text;
    }
}
