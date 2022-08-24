package inheritance; //Herança

public class Bird extends Animal{ //Classe filha | O "extends" neste caso está indicando que a classe "Bird" está sendo herdada da classe "Animal"
    //Atalho para adicionar o constructor (características herdadas) no IntelliJ = ALT+Insert

    public Bird(int age, String gender, double weightInLbs) {
        super(age, gender, weightInLbs); //O "super()" chama o construtor pai sem argumentos. Geralmente vem automaticamente ao adicionar o constructor
    }

    public void move() {
        System.out.println("The bird is Flapping wings...");
    }
}
