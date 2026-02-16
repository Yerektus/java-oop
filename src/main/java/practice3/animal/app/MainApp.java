package practice3.animal.app;

import practice3.animal.model.Animal;
import practice3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Animal("GenericAnimal", 5);
        Dog dog1 = new Dog("Rex", 3, "German Shepherd");
        Dog dog2 = new Dog("Buddy", 2, "Labrador");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(dog1);
        animals.add(dog2);

        for (Animal a : animals) {
            a.getInfo();
            a.makeSound();
            a.eat();
            a.eat("meat");
            System.out.println("-------------------");
        }
    }
}