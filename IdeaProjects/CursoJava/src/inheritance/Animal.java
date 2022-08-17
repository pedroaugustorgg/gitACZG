package inheritance; //Herança

public abstract class Animal { //Classe PAI, pois as outras irão herdar seus parâmetros
    int age;
    String gender;
    double weightInLbs;

    public Animal(int age, String gender, double weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public abstract void move();
}
