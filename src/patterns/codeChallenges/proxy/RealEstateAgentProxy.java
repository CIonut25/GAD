package patterns.codeChallenges.proxy;

public class RealEstateAgentProxy implements RealEstateAgent{
    private RealEstateAgent realEstateAgent = new RealEstateAgentImpl();

    public void represent(Apartment apartment) {
        realEstateAgent.represent(apartment);
    }

    public Apartment rent(Student student) {
        return realEstateAgent.rent(student);
    }
}

