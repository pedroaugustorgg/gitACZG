package inheritance;

public class Eagle extends Bird implements Flyable{ // "Flyable" é interface atrelada à classe herdada através do comando "implements"

    public Eagle(int age, String gender, double weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void move() {
        System.out.println("The bird is Flapping wings...");
    }

    public void fly() { //Herança herdada da interface "Flyable", além do moevimento genérico "move" herdado da classe Animal.
        System.out.println("Eagle Flying high...");
    }
}
