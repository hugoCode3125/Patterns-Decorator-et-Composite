package ma.horse.patternComposite;

public abstract class Component {
    protected String name;
    protected int level =0;

    public Component(String name) {
        this.name = name;
    }
    public String getTab(){
        String tab="";
        for (int i = 0; i < level; i++) {
            tab+="\t";
        }
        return tab;
    }

    public abstract void print();
}
