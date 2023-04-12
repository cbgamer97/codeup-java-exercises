package Animals;

public class Quote {

    public static String quotes(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        String quote = "";
        if (randomNumber == 1) {
            quote = "Do or do not. There is no try.";
        } else if (randomNumber == 2) {
            quote = "Say hello to my little friend";
        } else if (randomNumber == 3) {
            quote = "Death is just another path, one we must all take.";
        } else if (randomNumber == 4) {
            quote = "You did not kill Anakin Skywalker... I did.";
        }
        return quote;
    }

    public void printQuote(){
        System.out.println(quotes());
    }
}
