import java.util.Formatter;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter fmt;

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            if(i % 2 == 0) {
//                System.out.println("i is " + i);
//            }
//            i++;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i-= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i * i);
//            i++;
//        } while (i <= 1000000);

//        for (int i = 5; i <= 15; i++){
//            System.out.println("i is " + i);
//        }

//        for (int i = 0; i <= 100; i++){
//            if (i % 2 == 0) {
//                System.out.println("i is " + i);
//            }
//        }

//        for (int i = 100; i >= -10; i-= 5) {
//            System.out.println("i is " + i);
//        }

//        for (long i = 2; i < 1000000; i++){
//            System.out.printf("i is %s%n", i * i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz " + i);
//            } else if (i % 3 == 0){
//                System.out.println("Fizz " + i);
//            } else if (i % 5 == 0){
//                System.out.println("Buzz" + i);
//            }
//        }

//        fmt = new Formatter();
//
//        System.out.println("Enter a number!");
//        int userNumber = scanner.nextInt();
//
//        for (int i = 0; i <= userNumber; i++){
//            fmt.format("Number%3d Square%3d Cube%3d%n", i, i * i, i * i * i);
//            System.out.println(fmt);
//
//        }

        System.out.println("Enter a grade between 0 and 100.");
        int userGrade = scanner.nextInt();

        System.out.println("Do you want to continue? [Y/N]");
        String placeHolder = scanner.nextLine();
        String userContinue = scanner.nextLine();

        boolean confirmation = userContinue.equalsIgnoreCase("y");

        if (userGrade >= 88 && confirmation == true){
            System.out.println("A");
        } else if (userGrade < 88 && userGrade >= 80 && confirmation == true) {
            System.out.println("B");
        } else if (userGrade < 80 && userGrade >= 67 && confirmation == true) {
            System.out.println("C");
        } else if (userGrade < 67 && userGrade >= 60 && confirmation == true) {
            System.out.println("D");
        } else if (userGrade < 60 && confirmation == true) {
            System.out.println("F");
        }

    }
}
