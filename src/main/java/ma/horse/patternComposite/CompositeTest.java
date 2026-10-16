package ma.horse.patternComposite;

public class CompositeTest {
    public static void main(String[] args) {
        Folder folder = new Folder("/");
        folder.addChild(new File("insidrun.jar"));
        folder.addChild(new File("config.xml"));
        Folder entities = (Folder) folder.addChild(new Folder("entities"));
        entities.addChild(new File("entity1.txt"));
        entities.addChild(new File("entity2.txt"));
        entities.addChild(new Folder("hugo"));
        folder.print();
    }
}
