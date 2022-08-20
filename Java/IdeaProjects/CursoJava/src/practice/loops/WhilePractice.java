package practice.loops;

public class WhilePractice {

    public static void main(String[] args) {

        int pCount = 0;
        int rCount = 100;
        int lCount = 0;

        //Utilizando a condicional de loop "While" para criar uma contagem PROGRESSIVA de 1 até 100
        while(pCount <= 100){
            System.out.println("Counting: " + pCount);
            pCount = pCount +1;
        }

        //Utilizando a condicional de loop "While" para criar uma contagem REGRESSIVA de 100 até 0
        while(rCount >= 0){
            System.out.println("Counting: " + rCount);
            rCount = rCount -1;
        }

        //Limitando um looping, ou seja, forçando uma parada antes do encerramento do looping
        while(lCount <= 100){
            System.out.println("Limited Countg: " + lCount);
            lCount = lCount +1;

            if (lCount == 51) {
                break;
            }
        }

    }
}
