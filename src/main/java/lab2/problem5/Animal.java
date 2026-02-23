package lab2.problem5;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Animal name is empty");
        if (age < 0) throw new IllegalArgumentException("Animal age < 0");
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', age=" + age + ", sound='" + getSound() + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                name.equals(animal.name) &&
                getClass().equals(animal.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), name, age);
    }
}