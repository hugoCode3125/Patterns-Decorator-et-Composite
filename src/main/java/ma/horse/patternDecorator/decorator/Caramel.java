package ma.horse.patternDecorator.decorator;

import ma.horse.patternDecorator.composant.Boisson;

public class Caramel extends Decorator {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au Caramel";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
