package vehicles;

public class Car extends Vehicle{


    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("breaking down noise");
    }
}
