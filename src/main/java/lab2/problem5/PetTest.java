package lab2.problem5;

public class PetTest {
    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");

        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetWith(alice);
        System.out.println("After leaving pet with Alice:");
        System.out.println(registry);

        john.retrievePetFrom(alice);
        System.out.println("After retrieving pet from Alice:");
        System.out.println(registry);

        try {
            Animal rex = new Dog("Rex", 3);
            alice.assignPet(rex);
        } catch (Exception e) {
            System.out.println("Expected restriction: " + e.getMessage());
        }

        try {
            Animal rex2 = new Dog("Rex2", 4);
            Person bob = new Employee("Bob", 28, "Manager");
            bob.assignPet(rex2);
            registry.addPerson(bob);

            bob.leavePetWith(alice);
        } catch (Exception e) {
            System.out.println("Expected restriction (leave dog with PhD): " + e.getMessage());
        }
    }
}