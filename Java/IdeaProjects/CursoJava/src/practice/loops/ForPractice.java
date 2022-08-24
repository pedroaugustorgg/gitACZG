package practice.loops;

public class ForPractice {

    public static void main(String[] args) {

        //Utilizando a condicional de loop "For" para criar uma contagem PROGRESSIVA de 1 até 100
        for(int i = 0; i <= 100; i++){
            System.out.println("Counting: " + i);
        }

        //Utilizando a condicional de loop "For" para criar uma contagem REGRESSIVA de 1 até 100
        for(int i = 100; i >= 0; i--){
            System.out.println("Counting: " + i);
        }

        String name = "Hello World!";
        //Criando um "Leitor de caracteres" utilizando a condicional de looping "For"
        for (int i = 0; i < name.length(); i++){
            System.out.println("Char: " + name.charAt(i));
        }

    }
}
