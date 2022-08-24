package java_basics;

public class LearningMethods {
    public static void main(String[] args) {
        //Métodos que não pertencem a esta classe podem ser chamados da seguinte forma: "nome_da_classe.nome_do_método"
        System.out.println(); //Curiosidade: O simples fato de você utilizar o "System.out.println()" é o mesmo que chamar o método "println"
        System.out.println("argument"); //O que fica entre parêntesis após chamar o método, é chamado de "argumento", deste caso está entre aspas porque necessariamente o método do tipo "String" precisa estar entre aspas
        //Caso tenha interesse em verificar a classe do método chamado, basta segurar a tecla CTRL e clicar no método desejado.
        MyUtils.printSomeJunk("mais informação"); //método chamado através da orientação a objetos (a classe criada com o método se chama "MyUtils"
        int myvar = MyUtils.add10(98);
        System.out.println(myvar);

    }

}
