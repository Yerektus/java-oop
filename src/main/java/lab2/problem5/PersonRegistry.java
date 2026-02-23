package lab2.problem5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRegistry {
    private final List<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        if (p == null) throw new IllegalArgumentException("Person is null");
        if (!people.contains(p)) people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public List<Person> findPeopleWithPets() {
        return people.stream().filter(Person::hasPet).collect(Collectors.toList());
    }

    public List<Person> findPeopleWithoutPets() {
        return people.stream().filter(p -> !p.hasPet()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person p : people) {
            sb.append(" - ").append(p.toString())
              .append(" | petDetails: ").append(p.petInfo())
              .append("\n");
        }
        return sb.toString();
    }
}