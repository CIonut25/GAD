package patterns.visitor;

public class Film implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getMinutes() {
        return 40;
    }
}
