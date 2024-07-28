// Implement the observer for VIP users
public class VIPUser implements Observer {
    private String name;

    public VIPUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}