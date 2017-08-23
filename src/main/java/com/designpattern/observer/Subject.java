package com.designpattern.observer;


import java.util.ArrayList;

/**
 * Created by chenwinfred on 1/10/16.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();

}
