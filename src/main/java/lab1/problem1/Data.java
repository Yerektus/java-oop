package lab1.problem1;

public class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		this.sum = 0;
		this.max = Double.NEGATIVE_INFINITY;
		this.count = 0;
	}
	
	public void addValue(double value) {
		if (value > max) {
			this.max = value;
		}
		
		++count;
	}
	
	public double getAverage() {
		return (this.count == 0) ? 0.0 : (sum / count);
	}
	
	public double getLargest() {
		return (count == 0) ? 0.0 : this.max;
	}
}
