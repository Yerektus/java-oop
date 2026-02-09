package lab1.problem3;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		this.value = 0;
		this.scale = 'C';
	}
	
	public Temperature(double value) {
		this.value = value;
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0;
		this.scale = scale;
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public double getCelsius() {
		if (this.scale == 'C') {
			return this.value;
		} else {
			return 5 * (this.value - 32) / 9;
		}
	}
	
	public double getFahrenheit() {
		if (this.scale == 'F') {
			return this.value;
		} else {
			return (9 * this.value) / 5 + 32;
		}
	}
	
	public char getScale() {
		return this.scale;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
		if (scale == 'C' || scale == 'F') {
			this.scale = scale;
		}
	}
	
	public void setTemperature(double value, char scale) {
		setValue(value);
		setScale(scale);
	}
}
