package vehicles;

public class Garage {

    protected Vehicle[] vehicles;

    public void alarmCascade() {
        for(Vehicle vehicle : this.vehicles){
            vehicle.makeNoise();
        }
    }
}
