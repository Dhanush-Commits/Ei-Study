import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private String name;
    private List<Component> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("Directory: " + name);
        for (Component component : components) {
            component.print();
        }
    }
}