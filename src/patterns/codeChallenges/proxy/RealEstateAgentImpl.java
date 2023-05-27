package patterns.codeChallenges.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentImpl implements RealEstateAgent{

    private List<Apartment> apartments = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    public void represent(Apartment apartment) {
        apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        if (student.getName().startsWith("P")) {
            return null;
        }
        for (Apartment apartment : apartments) {
            if (apartment.getMonthlyRentCost() < min) {
                min = apartment.getMonthlyRentCost();
            }
        }
        for (Apartment apartment : apartments) {

            if (apartment.getMonthlyRentCost() <= student.getMoney() && apartment.getMonthlyRentCost() == min) {
                apartments.remove(apartment);
                return apartment;
            }
        }
        return null;
    }
}
