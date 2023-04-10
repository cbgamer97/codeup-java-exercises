import java.util.Scanner;
public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        USER STRING INPUTS

//        System.out.println("Enter your name!");
//        String userName = scanner.next();
//        System.out.println("Hello, " + userName);
//        System.out.println("What's your full name?");
//        String nextLine = scanner.nextLine();
//        String fullName = scanner.nextLine();
//        System.out.println("Hi, " + fullName);

//        INTEGER USER INPUTS

        System.out.println("Please enter an integer");
        String userInputInteger = scanner.nextLine();
        System.out.println(userInputInteger + userInputInteger);
        System.out.println("Your integer was: " + Integer.parseInt(userInputInteger));
        int parsedUserInput = Integer.parseInt(userInputInteger);
        System.out.println(parsedUserInput + parsedUserInput);

        System.out.println( "What is your name?");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
