package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        //Esta classe serve para aprender e praticar as condicionais (if,else, else if e o switch)
        boolean hungry = true;

        //NÍVEL BÁSICO
        if (hungry) {
            System.out.println("Im starving.");
        } else {
            System.out.println("I'm not hungry.");
        }

        //NÍVEL MÉDIO
        if (2==2) { //O que está entre parêntesis é a condição, se ela for satisfeita, executa-se o "if", senão executa-se o "else"
            System.out.println("É verdade esse 'bilete'");
        } else {
            System.out.println("Você precisa estudar um pouco mais de lógica");
        }

        if (!hungry) { //A exclamação "!" indica o contrário da condição
            System.out.println("Im starving.");
        } else {
            System.out.println("I'm not hungry.");
        }

        int hungerRating = 5;
        if (hungerRating < 6) {
            System.out.println("Not Hungry.");
        } else {
            System.out.println("I'm starving.");
        }

        //NÍVEL AVANÇADO
        int favoriteTemp = 75;
        int currentTemp = 45;
        String opinion;

        if (currentTemp < favoriteTemp -30) {
            opinion = "It's Pretty Darn Cold...";
        } else if (currentTemp < favoriteTemp -20){
            opinion = "It's kinda cold out...";
        } else if (currentTemp > favoriteTemp +10) {
            opinion = "It's hot out";
        } else {
            opinion = "It's a beautiful day...";
        }
        System.out.println(opinion);

        int month = 3;
        String monthString;

        switch(month){ //Condicional muito útil para substituir funções com muitos "ifs e elses"
            case 1: monthString = "January";
                break; //cada case percisa ter um "break" pois caso seja executado, a compilação para e evita a execução de cases subsequentes.
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            default: monthString = "Don't exist";
                break;
        }

        System.out.println(monthString);

    }
}
