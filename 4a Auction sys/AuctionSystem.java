// AuctionSystem.java

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String message);
}

// Subject Interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Auction Class (Subject)
class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String item;
    private boolean biddingStarted = false;

    public void setItem(String item) {
        this.item = item;
        notifyObservers("Item available: " + item);
    }

    public void startBidding() {
        if (!biddingStarted) {
            biddingStarted = true;
            notifyObservers("Bidding started for: " + item);
        }
    }

    public void endBidding() {
        if (biddingStarted) {
            biddingStarted = false;
            notifyObservers("Bidding ended for: " + item);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Bidder Class (Observer)
class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
