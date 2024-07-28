// Define the post class that notifies observers
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String content;
    private List<Observer> observers;

    public Post(String content) {
        this.content = content;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers("Post updated: " + content);
    }
}