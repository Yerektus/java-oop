package lab1.problem3;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        System.out.println("t1: " + t1.getCelsius() + " C, " + t1.getFahrenheit() + " F");
        
        Temperature t2 = new Temperature(25);
        System.out.println("t2: " + t2.getCelsius() + " C, " + t2.getFahrenheit() + " F");

        Temperature t3 = new Temperature('F');
        System.out.println("t3: " + t3.getCelsius() + " C, " + t3.getFahrenheit() + " F");

        Temperature t4 = new Temperature(98.6, 'F');
        System.out.println("t4: " + t4.getCelsius() + " C, " + t4.getFahrenheit() + " F");

        t1.setValue(100);
        System.out.println("t1 after setValue(100): " + t1.getCelsius() + " C");

        t1.setScale('F');
        System.out.println("t1 after setScale('F'): " + t1.getCelsius() + " C");

        t1.setTemperature(32, 'F');
        System.out.println("t1 after setTemperature(32, 'F'): "
                + t1.getCelsius() + " C, "
                + t1.getFahrenheit() + " F");

        System.out.println("t1 scale: " + t1.getScale());
    }
}