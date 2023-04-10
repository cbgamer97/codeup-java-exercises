import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n ");


        double pi = 3.14159;
        System.out.printf("The value of PI is approximately %.2f.%n", pi);

        System.out.println("Enter a number.");
        String userInt = scanner.nextLine();
        int parseUserInt = Integer.parseInt(userInt);
        System.out.println("You entered: " + parseUserInt);

        System.out.println("Enter 3 words");
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();
        System.out.println("You entered: " + firstInput);
        System.out.println("You entered: " + secondInput);
        System.out.println("You entered: " + thirdInput);

        System.out.println("Enter a sentence.");

        String userSentence = scanner.nextLine();

        System.out.println("The sentence you entered was: " + userSentence);

        System.out.println("Enter the width.");
        String width = scanner.nextLine();
        System.out.println("Enter the height.");
        String length = scanner.nextLine();
        int parsedWidth = Integer.parseInt(width);
        int parsedLength = Integer.parseInt(length);
        int area = parsedLength * parsedWidth;
        System.out.println("The area of the class is: " + area);
        int perimeter = (2 * parsedLength) + (2 * parsedWidth);
        System.out.println("The perimeter of the class is: " + perimeter);
        System.out.println("If you would like to calculate the volume, enter a length value.");
        String height = scanner.nextLine();
        int parsedHeight = Integer.parseInt(height);
        int volume = parsedHeight * parsedWidth * parsedLength;
        System.out.println("The volume of the room is: " + volume);

//        BONUSES

        System.out.println("Enter your favorite quote!");
//        String placeHolder = scanner.nextLine();
        String userQuote = scanner.nextLine();
        System.out.println("Your quote was: " + userQuote);
        System.out.println("How many words are in the quote?");
        String numberOfWords = scanner.nextLine();
        int parsedNumberOfWords = Integer.parseInt(numberOfWords);
        System.out.println("You count " + parsedNumberOfWords + " words.");
        int lengthOfInput = userQuote.length();
        if  (parsedNumberOfWords >= lengthOfInput) {
            System.out.println("You were correct!");
        } else {
            System.out.println("Count the words again!");
        }
    }
}
