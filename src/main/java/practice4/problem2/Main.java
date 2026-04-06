package practice4.problem2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();
        Student student = new Student();

        System.out.println("--- Serving Cat ---");
        restaurant.servePizza(cat);

        System.out.println("--- Serving Student ---");
        restaurant.servePizza(student);
    }
}