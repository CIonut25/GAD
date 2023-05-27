package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<Element>();
        elements.add(new Book());
        elements.add(new Film());
        elements.add(new Song());

        TimeVisitor timeVisitor = new TimeVisitor();
        for (Element element : elements) {
            element.accept(timeVisitor);
        }

        System.out.println("Total time: " + timeVisitor.getTime());

        PriceVisitor pv = new PriceVisitor();
        for (Element element : elements) {
            element.accept(pv);
        }
        System.out.println("Total price: " + pv.getPrice());
    }
}
