import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(3, 5));
//        getInteger();
//        System.out.println(factorial());
//        System.out.println(dice());
    }

    public static int addition(int num1, int num2) {
        int returnedNumber = num1 + num2;
        return returnedNumber;
    }

    public static int subtraction(int num1, int num2) {
        int returnedNumber = num1 - num2;
        return returnedNumber;
    }

    public static int multiplication(int num1, int num2) {
        int returnedNumber = num1 * num2;
        return returnedNumber;
    }

    public static int division(int num1, int num2) {
        int returnedNumber = num1 / num2;
        return returnedNumber;
    }

    public static int modulus(int num1, int num2) {
        int returnedNumber = num1 % num2;
        return returnedNumber;
    }

    public static int getInteger(int min, int max){
        System.out.println("Enter a number between 1 and 10.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int userNumber = Integer.parseInt(userInput);
        if (userNumber >= min && userNumber <= max){
            System.out.println(userNumber);
            return userNumber;
        }
        return getInteger(min, max);
    }

    public static long factorial(int num){
        Scanner scanner = new Scanner(System.in);

        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    public static int dice(){
        int userChoice = getInteger(4, 20);
        return userChoice;
    }
    public static int randomNumber(int min, int max){
        int result = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }
    public static String rollDice(int sides) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to roll the dice? [Y/N]");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("y")){
            int result1 = randomNumber(1, sides);
            int result2 = randomNumber(1, sides);
            return "The first dice rolled a " + result1 + ". The second dice rolled a " + result2 + ".";
        }
        return "Fine. Go away";
    }
}
