package com.pattern.compound.quack;


public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
