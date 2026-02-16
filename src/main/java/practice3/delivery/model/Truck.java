package practice3.delivery.model;

public class Truck extends Vehicle {
	private int maxLoad;
	
	public Truck(String model, double baseCost, Engine engine, int maxLoad) {
		super(model, baseCost, engine);
		this.maxLoad = maxLoad;
	}
	
	@Override
	public double calculateDeliveryCost() {
		return baseCost * 1.2;
	}
	
	public double calculateDeliveryCost(double distance, double fuelPrice) {
		return this.calculateDeliveryCost() + distance + fuelPrice + 0.5;
	}
	
	@Override
	public String getVehicleInfo() {
		return super.getVehicleInfo() + ", Max load" + maxLoad;
	}
}
