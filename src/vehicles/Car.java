package vehicles;

public class Car extends Vehicle{

    public void makeNoise(){
        System.out.printf("The %s goes: vroom vroom", getName());
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("breaking down noise");
    }
}
