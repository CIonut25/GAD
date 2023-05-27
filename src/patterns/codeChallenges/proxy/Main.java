package patterns.codeChallenges.proxy;

public class Main {
    public static void main(String[] args) {
        Apartment app1 = new Apartment("Crangasi01", 300);
        Apartment app2 = new Apartment("Crangasi01", 600);
        Apartment app3 = new Apartment("Crangasi01", 350);
        Apartment app4 = new Apartment("Crangasi01", 400);
        Apartment app5 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app1);
        proxy.represent(app2);
        proxy.represent(app3);
        proxy.represent(app4);
        proxy.represent(app5);

        Student student1 = new Student("Ionescu", 500);
        Student student2 = new Student("Popescu", 330);

        Apartment apartmentForStudent1 = proxy.rent(student1);
        System.out.println(student1 + " rented " + apartmentForStudent1);

        Apartment apartmentForStudent2 = proxy.rent(student2);
        System.out.println(student2 + " rented " + apartmentForStudent2);

    }
}
