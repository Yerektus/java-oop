package lab2.problem1.vehicle;

import java.util.Objects;

class Car extends Vehicle {
    private String vin;

    public Car(String brand, int year, String vin) {
        super(brand, year);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vin);
    }

    @Override
    public String toString() {
        return super.toString() + ", VIN: " + vin;
    }
}