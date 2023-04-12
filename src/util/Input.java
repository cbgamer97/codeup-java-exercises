package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.println("Enter a sentence.");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static boolean yesNo(){
        System.out.println("Yes, or No?");
        boolean userChoice = Boolean.parseBoolean(scanner.nextLine());
        return userChoice;
    }

    public static int getInt(int min, int max){
        System.out.println("What is your number?");
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            getInt(min, max);
        }
        return userNumber;
    }

    public static int getInt(){
        System.out.println("What number is your favorite?");
        int num = scanner.nextInt();
        return num;
    }

    public static double getDouble(double min, double max){
        System.out.println("What is your number?");
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            getDouble(min, max);
        }
        return userNumber;
    }

    public static double getDouble(){
        System.out.println("What number is your favorite?");
        int num = scanner.nextInt();
        return num;
    }
}
