package visitor.challenge;

public interface ShippingVisitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
}
