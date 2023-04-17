package birds;

public class BirdTest {

    public static void main(String[] args) {
        Bird quaker = new Quaker();
        quaker.setName("Quaker");
        quaker.makeNoise();
        Bird finch = new Finch();
        finch.setName("Finch");
        finch.makeNoise();
        Goose goose = new Goose();
        goose.setName("Goose");
        goose.makeNoise("honk");
    }
}
