package java_basics;

public class Variables {
    //Este "public static void main(String[] args)" é um método de nome "main" que o Java precisa para poder compilar o que estiver aqui dentro
    public static void main(String[] args) {
        int x; //Criação de uma variável do TIPO "inteira" e de NOME "x"
        int y = 6;
        String palavras; //Criação de uma variável do TIPO "String" e NOME "palavras" (caracteres especiais não são permitidos no nome de uma variável do tipo String)
        x = 4; //Esta linha indica que o valor 4 está sendo atribuído a variável x
        palavras = "café, computador, programa, java";

        System.out.println(x); //linha de código para imprimir na tela o valor atual de x
        System.out.println(x + 5); //Esta linha indica que será impresso o resultado entre o valor 2 somado à variável x (que anteriormente valia 4)
        System.out.println(x+y); //linha de código para imprimir na tela o valor atual de x (que neste caso já passou por algumas operações e está com o resultado atribuido diferente)
        //Todas as linhas acima são operações envolvendo as variáveis inteiras, onde estas têm esse nome "variáveis" justamente por variarem de acordo com as operações e linha as quais estão inseridas.

        System.out.println(palavras);
        System.out.println(palavras + " + outras palavras");
    }
}
