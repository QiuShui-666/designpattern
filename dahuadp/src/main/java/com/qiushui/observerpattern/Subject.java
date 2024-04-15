package com.qiushui.observerpattern;

// 目标接口
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);

    void changeState(String newState);

}
