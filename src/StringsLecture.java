import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
//        System.out.println("Hello " + "World!");

//        String message = "Hello";
//        System.out.println(message.equalsIgnoreCase("hello"));
//        System.out.println(message.startsWith("He"));
//        System.out.println(message.endsWith("lo"));

//        String password = "password";
//        System.out.println(password.length() > 7);

//        String message2 = "This is my message";
//        int position = message2.indexOf("my");
//        System.out.println(message2.replace("my", "your"));

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to continue? [Y/N}");
        String userChoice = input.nextLine();
        System.out.println(userChoice.trim().equalsIgnoreCase("y"));

    }
}
