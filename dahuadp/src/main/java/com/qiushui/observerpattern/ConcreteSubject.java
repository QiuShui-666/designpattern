package com.qiushui.observerpattern;

import java.util.ArrayList;
import java.util.List;

// 具体目标
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private String state;

    @Override
    public void registerObserver(Observer observer) {
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

    public void changeState(String newState) {
        this.state = newState;
        System.out.println("Subject state changed to: " + newState);
        notifyObservers(newState);
    }

}
