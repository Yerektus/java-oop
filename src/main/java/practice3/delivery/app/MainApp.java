package practice3.delivery.app;

import practice3.delivery.model.*;
import practice3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Engine engine1 = new Engine("Petrol", 150);
        Engine engine2 = new Engine("Diesel", 400);

        Car car = new Car("Toyota Camry", 10000, engine1, 5);
        Truck truck = new Truck("Volvo FH", 30000, engine2, 20000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        DeliveryService service = new DeliveryService();

        service.printAllVehicles(vehicles);
        System.out.println("------------------");
        service.calculateAllDeliveries(vehicles);
        System.out.println("------------------");

        double total = service.calculateTotalCost(vehicles);
        System.out.println("Total delivery cost: " + total);
    }
}