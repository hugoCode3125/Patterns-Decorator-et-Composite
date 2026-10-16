package ma.horse.patternDecorator.decorator;

import ma.horse.patternDecorator.composant.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }

}
