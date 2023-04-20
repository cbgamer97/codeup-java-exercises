package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
//        System.out.println("Enter a sentence.");
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
        String s = getString();
        try {
            Integer.valueOf(s);
        } catch (Exception e) {
            e.printStackTrace();
            getInt();
        }
        return Integer.parseInt(s);
    }

    public int getInt(int min, int max){
        System.out.printf("Pick a number between %d, and %d.%n", min, max);
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        }catch (NumberFormatException e){
            System.out.println("You did not enter a number.");
            getInt(min, max);
        }
        int userNumber = Integer.parseInt(userInput);
        if (userNumber >= min && userNumber <= max){
            return userNumber;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int getRandomInt(){
        int randomNumber = (int) (Math.random() * 100) + 1;
        return randomNumber;
    }

    public int getRandomInt(int min, int max) {
        int randomNumber = (int) (Math.random() * max) + min;
        return randomNumber;
    }

    public double getDouble(){
        System.out.println("Pick a number.");
        String s = getString();
        try {
            Double.valueOf(s);
        } catch (Exception e) {
            e.printStackTrace();
            getDouble();
        }
        return Double.parseDouble(s);
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

    public double getBinary(){
        System.out.println("Pick a number.");
        String s = getString();
        try {
            Double.valueOf(s);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return Double.valueOf(s);
    }
}
