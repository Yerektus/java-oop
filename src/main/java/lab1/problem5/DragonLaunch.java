package lab1.problem5;

import java.util.Vector;

public class DragonLaunch {
    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot() {
        int top = -1;

        for (int i = 0; i < kidnapped.size(); i++) {
            Person current = kidnapped.get(i);

            if (top >= 0) {
                Person last = kidnapped.get(top);
                if (last.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    top--;
                    continue;
                }
            }

            top++;
            kidnapped.set(top, current);
        }

        kidnapped.setSize(top + 1);

        return kidnapped.size() > 0;
    }

    public Vector<Person> getKidnapped() {
		return kidnapped;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Line: ");
        for (Person p : kidnapped) {
            sb.append(p.getGender() == Gender.BOY ? "B" : "G");
        }
        return sb.toString();
    }
}