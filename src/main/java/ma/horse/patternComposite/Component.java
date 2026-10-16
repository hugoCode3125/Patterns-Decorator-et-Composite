package ma.horse.patternComposite;

public abstract class Component {
    protected String name;
    protected int level =0;

    public Component(String name) {
        this.name = name;
    }

    public abstract void print();
}
