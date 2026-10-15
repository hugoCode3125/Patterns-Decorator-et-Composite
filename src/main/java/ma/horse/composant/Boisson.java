package ma.horse.composant;

public abstract class Boisson {
    protected String description;

    public String getDescription() {
        return description;
    }

    public  abstract double cout();
}
