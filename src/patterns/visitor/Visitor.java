package patterns.visitor;

public interface Visitor {
    public void visit(Book book);
    void visit(Song song);
    void visit(Film film);
}
