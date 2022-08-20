package practice.strings;

public class StringsPractice1 {

    public static void main(String[] args) {

        String a = "hello";
        String b = "there";

        if(a == "hello") { //WRONG FORM TO TREAT STRINGS
            //THIS IS A TRAP. DON'T DO THIS
        }

        if (a.equals("hello")){ //CORRECT FORM FOR THE EXACTLY SAME STRING
            //USE THIS!!!
            System.out.printf("Print here ");
        }

        if(b.equalsIgnoreCase("ThERe")){//SAME STRING BUT THE CASE SENSITIVE IS OFF
            System.out.println("Printed there");
        }
    }
}
