package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.println("Enter a sentence.");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static String yesNo(){
        System.out.println("Would you like to continue? [Y/N]");
        String userChoice = scanner.nextLine();
        if (userChoice.trim().equalsIgnoreCase("y")) {
            System.out.println("You chose yes, congratulations!");
        } else {
            yesNo();
        }
        return userChoice;
    }

    public static int getInt(){
        System.out.println("Pick a number.");
        int num = scanner.nextInt();
        return num;
    }

    public static int getInt(int min, int max){
        System.out.printf("Pick a number between %d, and %d.%n", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            getInt(min, max);
        }
        return userNumber;
    }

    public static int getRandomInt(){
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("This method gives you a random number between 1 and 100.");
        return randomNumber;
    }

    public static int getRandomInt(int min, int max) {
        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        if (randomNumber >= min && randomNumber <= max){
            System.out.println("Here comes your number!");
        } else {
            getInt(min, max);
        }
        return randomNumber;
    }

    public static double getDouble(){
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
}
