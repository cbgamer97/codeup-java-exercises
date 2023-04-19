package vehicles;

import java.util.ArrayList;

public class VehicleTest {
    public static void main(String[] args) {
//        Vehicle hyundai = new Car();
//
//        hyundai.setName("Sonata");
//
//        hyundai.makeNoise();

//        Garage garage = new Garage();
//        garage.vehicles = new Vehicle[3];
//        garage.vehicles[0] = new Motorcycle();
//        garage.vehicles[1] = new Motorboat();
//        garage.vehicles[2] = new Car();
//        garage.alarmCascade();

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        car1.setName("hyundai");
        car2.setName("nissan");
        car3.setName("toyota");

        for (Car car : carList) {
            System.out.println(car.getName());
        }

        System.out.println(carList.size());

        System.out.println(carList.get(1).getName());
    }
}
