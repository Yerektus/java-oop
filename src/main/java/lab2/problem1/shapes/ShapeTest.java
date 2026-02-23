package lab2.problem1.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape c = new Cylinder(3, 5);
        Shape s = new Sphere(4);
        Shape cube = new Cube(2);

        System.out.println("Cylinder volume: " + c.volume());
        System.out.println("Cylinder surface: " + c.surfaceArea());

        System.out.println("Sphere volume: " + s.volume());
        System.out.println("Sphere surface: " + s.surfaceArea());

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface: " + cube.surfaceArea());
    }
}