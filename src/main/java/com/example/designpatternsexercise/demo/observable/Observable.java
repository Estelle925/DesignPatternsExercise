package com.example.designpatternsexercise.demo.observable;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);
}
