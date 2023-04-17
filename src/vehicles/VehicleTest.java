package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle hyundai = new Car();
//
//        hyundai.setName("Sonata");
//
//        hyundai.makeNoise();

        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Motorcycle();
        garage.vehicles[1] = new Motorboat();
        garage.vehicles[2] = new Car();
        garage.alarmCascade();
    }
}
