// Define the like class that notifies observers
import java.util.ArrayList;
import java.util.List;

public class Like {
    private int count;
    private List<Observer> observers;

    public Like(int count) {
        this.count = count;
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

    public void setCount(int count) {
        this.count = count;
        notifyObservers("Like count updated: " + count);
    }
}