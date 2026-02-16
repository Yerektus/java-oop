package practice3.delivery.model;

public class Vehicle {
	protected String model;
	protected double baseCost;
	protected Engine engine;
	
	public Vehicle(String model, double baseCost, Engine engine) {
		this.model = model;
		this.baseCost = baseCost;
		this.engine = engine;
	}
	
	public double calculateDeliveryCost() {
		return baseCost * 1.1;
	}
	
	public String getVehicleInfo() {
		return "Model: " + model +
				", Base cost: " + baseCost +
				", " + engine.getEngineInfo();
	}
	
	public String getModel() {
		return this.model;
	}
}
