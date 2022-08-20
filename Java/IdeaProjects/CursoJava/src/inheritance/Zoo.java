package inheritance; //Herança

public class Zoo {

    public static void main(String[] args) {
        Chicken animal1 = new Chicken(12, "M", 23);
        animal1.eat();

        Bird bird1 = new Bird(3, "F", 10);
        bird1.eat();
        Bird bird2 = new Bird(2, "M", 8.5);
        bird2.move();

        Fish fish1 = new Fish(1, "M", 4.5);
        fish1.swimming();
        Fish fish2 = new Fish(2, "F", 2.5);
        fish2.sleep();
        Fish fish3 = new Fish(2, "F", 2.5);
        fish3.move();

        Eagle eagle1 = new Eagle(1, "M", 4);
        eagle1.fly();
        Eagle eagle2 = new Eagle(1, "M", 4);
        eagle2.move();
    }

    public static void moveAnimals(Animal animal) { //Aqui está um exemplo prático de polymorphism, permitindo o programa se tornar mais dinâmico.
        animal.move();
    }

}
