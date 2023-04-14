import util.Input;

import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {"Happy", "Beautiful", "Fast", "Cozy", "Joyful", "Majestic", "Delicious", "Serene", "Vibrant", "Spacious"};
    private static String[] nouns = {"Dog","Computer", "Tree", "Car", "Book", "Beach", "Guitar", "Flower", "Chair", "Mountain"};
    static Input input = new Input();
    static Random random = new Random();
    public static String randomElement(String[] randomStringArr){
        String randomString = "";
        int index = input.getRandomInt(0, randomStringArr.length);

        return randomStringArr[index];
    }

    public static void main(String[] args) {
        String noun = randomElement(nouns);
        String adjective = randomElement(adjectives);
        System.out.println("Here is your server name.");
        System.out.printf("%s-%s", adjective, noun);
    }
}
