package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a sentence.");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue? [Y/N]");
        String userChoice = scanner.nextLine();
        return userChoice.trim().equalsIgnoreCase("y") ||
                userChoice.trim().equalsIgnoreCase("yes");
    }

    public boolean yesNo(String input) {
        return input.trim().equalsIgnoreCase("y") || input.trim().equalsIgnoreCase("yes");
    }

    public int getInt(){
        System.out.println("Pick a number.");
        int num = scanner.nextInt();
        return num;
    }

    public int getInt(int min, int max){
        System.out.printf("Pick a number between %d, and %d.%n", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        }
        return getInt(min, max);
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int getRandomInt(){
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("This method gives you a random number between 1 and 100.");
        return randomNumber;
    }

    public int getRandomInt(int min, int max) {
        System.out.printf("Get a number between %d, and %d.%n", min, max);
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }

    public double getDouble(){
        System.out.println("Enter a number.");
        int num = scanner.nextInt();
        return num;
    }


    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %.2f and %.2f.%n", min, max);
        double userNumber = scanner.nextDouble();
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        }
        return getDouble(min, max);
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public void getGhost(){
        System.out.println("");
        String ghost = scanner.nextLine();
    }
}
