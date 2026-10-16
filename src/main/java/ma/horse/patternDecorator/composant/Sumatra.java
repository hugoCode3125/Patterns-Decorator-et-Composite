package ma.horse.patternDecorator.composant;

public class Sumatra extends Boisson {

    public Sumatra() {
        this.description = "Sumatra";
    }

    @Override
    public double cout() {
        return 6;
    }
}
