package lab2.problem4;

public class Series extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDiff;

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDiff;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDiff = V;

        double totalR = getResistance();
        double current = V / totalR;

        double V1 = current * c1.getResistance();
        double V2 = current * c2.getResistance();

        c1.applyPotentialDiff(V1);
        c2.applyPotentialDiff(V2);
    }
}
