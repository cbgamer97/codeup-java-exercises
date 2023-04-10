import java.util.Scanner;

public class ControlStatementsLoopsLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        BOOLEAN EXPRESSIONS
//        >, >=, <, <=, ==, !=
        double discountPercentage = 2.3;
//        System.out.println(discountPercentage == 2.0);


//        LOGICAL OPERATORS
//        &&, &, ||, |, !
//        System.out.println(discountPercentage > 3 || discountPercentage ==2.3);

//        STRING COMPARISON
        System.out.println("Continue? [Y/N]");
        String userInput = sc.next();

        boolean confirmation = userInput.equalsIgnoreCase("y");
        System.out.println(confirmation);

//        CONTROL STRUCTURES
//        IF, ELSE IF, ELSE

        if (discountPercentage > 2) {
            System.out.println("Discount percentage is, in fact, definitely greater than 2.");
        }

//        WHILE LOOP

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        DO WHILE LOOP

//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i < 10);

//        FOR LOOP

//        for(int i = 0; i < 10; i++) {
//            System.out.println("i is " + i);
//        }

//        BREAKS AND CONTINUES

        for(int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
            if (i == 5) {
                break;
            }
        }

    }
}
