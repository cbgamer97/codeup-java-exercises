package Animals;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion{
    public Boolean trained;

    public String snuggle(){
        return this.getName() + " wants to snuggle";
    }

    public PetDog(Boolean trained) {
        this.trained = trained;
    }

    public PetDog(String name, String type, Boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public Boolean isTrained(){
        return trained;
    }

    public static void allSnuggle (ArrayList<PetDog>arr1){
        for(PetDog everyDog : arr1){
            System.out.println(everyDog.snuggle());
        }
    }
}
