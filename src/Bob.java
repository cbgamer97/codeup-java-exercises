import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sure = "Sure.";
        String whoa = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever";

        System.out.println("What would you like to say to Bob?");
        String userInput = scanner.nextLine();
        while(!userInput.isBlank()) {
            if (userInput.endsWith("?")) {
                System.out.println(sure);
            } else if (userInput.endsWith("!")) {
                System.out.println(whoa);
            } else if (userInput.trim().equals("")) {
                System.out.println(fine);
                break;
            } else {
                System.out.println(whatever);
            }
            userInput = scanner.nextLine();
        }
    }
}
