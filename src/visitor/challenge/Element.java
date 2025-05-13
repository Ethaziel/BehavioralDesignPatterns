package visitor.challenge;

public interface Element {
    void accept(ShippingVisitor visitor);
}
