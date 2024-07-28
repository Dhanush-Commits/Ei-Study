// RegularUser.java
public class RegularUser implements Observer {
    private String name;

    public RegularUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}