package patterns.codeChallenges.observer;


import java.util.ArrayList;

public class Teacher implements ObservedSubject {
    private ArrayList<Observer> observers;

    public Teacher() {
        observers = new ArrayList<>();
    }

    public void teach(String topic) {
        notifyObservers("learned about " + topic);
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

