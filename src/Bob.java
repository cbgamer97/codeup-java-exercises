import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sure = "Sure.";
        String whoa = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever";

        System.out.println("Ask Bob a question!");
        String userInput = scanner.nextLine();
        if (userInput.endsWith("?")){
            System.out.println(sure);
        } else if (userInput.endsWith("!")) {
            System.out.println(whoa);
        } else if (userInput.trim().equals("")) {
            System.out.println(fine);
        } else {
            System.out.println(whatever);
        }
    }
}
