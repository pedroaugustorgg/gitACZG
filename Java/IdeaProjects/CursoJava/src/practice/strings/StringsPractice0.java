package practice.strings;

public class StringsPractice0 {

    public static void main(String[] args) {

        String a = "Hello World!"; //Variável do tipo "String" de nome "a" e a frase "Hello World!" atribuída a ela
        System.out.println(a.length());
        /*
            [H] [e] [l] [l] [o] [ ] [W] [o] [r] [l] [d] [!]     --> String a
            [0] [1] [2] [3] [4] [5] [6] [7] [8] [9] [10][11]    --> Endereços onde cada caractere está alocado na memória
        */
        String extractedString1 = a.substring(3); //O método "subtring()" presente na classe String serve para subtrair a quantidade de endereços alocados por uma String.
        System.out.println(extractedString1);

        String abc = "ABCDEFG";
        //System.out.println(abc.length());
        String extractedString2 = abc.substring(4,7); //Também pode ser definido apenas um intervalo que será alocado na memória, sendo (a partir de, antes de)
        System.out.println(extractedString2);
    }
}
