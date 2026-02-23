package lab2.problem1.vehicle;

import java.util.HashSet;
import java.util.Set;

class VehicleTest {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car("Toyota", 2020, "ABC123"));
        cars.add(new Car("Toyota", 2020, "ABC123"));
        cars.add(new Car("Toyota", 2020, "XYZ999"));

        System.out.println("Total cars in set: " + cars.size());

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}