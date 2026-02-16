package practice3.delivery.service;

import java.util.List;

import practice3.delivery.model.Vehicle;

public class DeliveryService {
	public void printAllVehicles(List<Vehicle> vehicles) {
		for (Vehicle v : vehicles) {
			System.out.println(v.getVehicleInfo());
		}
	}
	
	public void calculateAllDeliveries(List<Vehicle> vehicles) {
		for (Vehicle v : vehicles) {
			System.out.println("Delivery cost for " + v.getModel() + ": " + v.calculateDeliveryCost());
		}
	}
	
	public double calculateTotalCost(List<Vehicle> vehicles) {
		double total = 0;
		
		for (Vehicle v : vehicles) {
			total += v.calculateDeliveryCost();
		}
		
		return total;
	}

}
