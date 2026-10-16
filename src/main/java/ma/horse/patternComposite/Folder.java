package ma.horse.patternComposite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    List<Component> components = new ArrayList<Component>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {

        System.out.println(getTab() + "Folder : " +name);

        for (Component component : components) {
            component.print();
        }
    }

    public Component addChild(Component component) {
        component.level = this.level + 1;
        this.components.add(component);
        return component;
    }

    public void removeChild(Component component) {
        this.components.remove(component);
    }
}
