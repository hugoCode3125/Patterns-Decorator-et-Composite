package ma.horse.decorator;

import ma.horse.composant.Boisson;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }

}
