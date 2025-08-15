package BroCode.ArrayOfObjects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "golden");
        Car car2 = new Car("Skoda", "blue");

        Car car3 = new Car("Red");
        car3.name = "Jeep";

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for(Car car : cars){
            car.drive();
        }
    }
}
