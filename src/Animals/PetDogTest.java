package Animals;

import java.util.ArrayList;

public class PetDogTest {
    public static void main(String[] args) {
        PetDog dog1 = new PetDog("Connor", "Great Dane", false);
        PetDog dog2 = new PetDog("Bozo", "Labrador", true);
        PetDog dog3 = new PetDog("kitten", "Chihuahuah", false);
        ArrayList<PetDog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        PetDog.allSnuggle(dogs);
    }
}
