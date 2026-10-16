package ma.horse.patternDecorator.composant;

public class Expresso extends Boisson {

    public Expresso() {
        this.description = "Expresso";
    }

    @Override
    public double cout() {
        return 12;
    }
}
