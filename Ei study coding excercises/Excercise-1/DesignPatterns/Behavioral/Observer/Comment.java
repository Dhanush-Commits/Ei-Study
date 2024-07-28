// Define the comment class that notifies observers
import java.util.ArrayList;
import java.util.List;

public class Comment {
    private String content;
    private List<Observer> observers;

    public Comment(String content) {
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
        notifyObservers("Comment updated: " + content);
    }
}