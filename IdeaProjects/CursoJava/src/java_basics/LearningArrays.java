package java_basics;

public class LearningArrays {
    public static void main(String[] args) {
       /* Não é possível atribuir mais de um valor diretamente a uma váriável desta forma:
       int values;
       values = 100, 200, 300;*/
        //Curiosidade: Array = Matriz

        int [] values = new int[100]; /*nesta linha estamos declarando uma variável do tipo "array" e "inteiro".
        A variável do tipo "array int" declarada acima está com 100 elementos (ou 100 slots), onde o número de elementos fica entre colchetes [].
        Ou seja, a primeira posição nesta array é a [0] e a última é a [99]*/
        double [] decimals = new double[250];
        String [] words = new String[] {"My", "Name", "is"};
        String [] text = new String[8];

        values[0] = 123;
        decimals[158] = 4156;
        text[3] = "You";

        System.out.println(values[0]);
        System.out.println(values[1]); //O endereço [1] não possui nenhum valor atribuído, logo, será printado em tela o valor 0 (zero)
        System.out.println(decimals[158]);
        System.out.println(words[2]);
        System.out.println(text[3]);
        System.out.println(text[1]);//O endereço [1] não possui nenhum nada atribuído, logo, será printado em tela "null"

    }
}
