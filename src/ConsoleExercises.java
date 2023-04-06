import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of PI is approximately %4.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);

        System.out.println("Enter 3 words");
        String firstInput = scanner.next();
        String secondInput = scanner.next();
        String thirdInput = scanner.next();
        System.out.println("You entered: " + firstInput);
        System.out.println("You entered: " + secondInput);
        System.out.println("You entered: " + thirdInput);

        System.out.println("Enter a sentence.");

        String userSentence = scanner.nextLine();

        System.out.println("The sentence you entered was: " + userSentence);
    }
}
