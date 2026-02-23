package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private final String name;
    private final int age;

    private Animal pet;               
    private Animal ownedPet;   
    
    public Person(String name, int age) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Person name is empty");
        if (age < 0) throw new IllegalArgumentException("Person age < 0");
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public boolean hasPet() { return pet != null; }
    public Animal getPet() { return pet; }

    public abstract String getOccupation();

    public void assignPet(Animal pet) {
        if (pet == null) throw new IllegalArgumentException("Pet is null");
        if (this.pet != null) throw new IllegalStateException(name + " already has a pet right now");
        if (!canTakeCareOf(pet)) {
            throw new IllegalArgumentException(getClass().getSimpleName() + " cannot have " + pet.getClass().getSimpleName());
        }
        this.pet = pet;
        this.ownedPet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public void leavePetWith(Person caretaker) {
        if (caretaker == null) throw new IllegalArgumentException("Caretaker is null");
        if (this.pet == null) throw new IllegalStateException(this.name + " has no pet to leave");
        if (caretaker.pet != null) throw new IllegalStateException(caretaker.name + " already has a pet");
        if (!caretaker.canTakeCareOf(this.pet)) {
            throw new IllegalArgumentException("Cannot leave " + pet.getClass().getSimpleName() + " with " + caretaker.getClass().getSimpleName());
        }

        caretaker.pet = this.pet;
        caretaker.ownedPet = caretaker.ownedPet; 
        this.pet = null;
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) throw new IllegalArgumentException("Caretaker is null");
        if (this.ownedPet == null) throw new IllegalStateException(this.name + " never owned a pet");
        if (this.pet != null) throw new IllegalStateException(this.name + " already has a pet");
        if (caretaker.pet == null) throw new IllegalStateException(caretaker.name + " has no pet right now");

        if (!caretaker.pet.equals(this.ownedPet)) {
            throw new IllegalStateException("The pet with " + caretaker.name + " is not owned by " + this.name);
        }

        this.pet = caretaker.pet;
        caretaker.pet = null;
    }

    protected boolean canTakeCareOf(Animal animal) {
        return true;
    }

    public String petInfo() {
        if (pet == null) return "no pet";
        return pet.toString();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", occupation='" + getOccupation() + "'" +
                ", pet=" + (pet == null ? "none" : pet.getClass().getSimpleName() + "(" + pet.getName() + ")") +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                getClass().equals(person.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), name, age);
    }
}