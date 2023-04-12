package Animals;

public class DogPark {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Asha");
        dog.setSound("Ruff");
        dog.makeSound();

        Animal dog2 = new Animal("Bear", "Ruff");
        dog2.makeSound();

        Animal dragon = new Animal("Ghost", Quote.quotes());
        dragon.makeSound();
    }
}
