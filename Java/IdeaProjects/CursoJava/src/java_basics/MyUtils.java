package java_basics;

public class MyUtils { //Class/Classe do tipo "public" pode ser utilizada em qualquer "pacote/package", já a "private" só poderá ser utilizada no mesmo pacote/package.
    //Criando um novo método do tipo void (vazio), que não retorna nada.
    public static void printSomeJunk(String algo) { //Dentro do parêntesis você deve atribuir o argumento a ser atribuído
        System.out.println("Some bla bla bla " + algo); //Este método adiciona a frase "ome bla bla bla " antes de uma outra String
    /*Obs.: Métodos do tipo "public" podem ser utilizados em qualquer outra classe;
    Já os métodos do tipo "private" poderão ser utilizados APENAS nesta classe.*/
    }

    //Criando um novo método do tipo int (número inteiro), que irá retornar alguma coisa (neste caso retorna o "result"
    public static int add10(int someArgument) {
        int result = someArgument + 10; //Este método soma +10 a uma variável do tipo int.
        return result;
    }
}
