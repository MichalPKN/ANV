/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;
import java.util.ArrayList;

/**
 *
 * @author michal.pokorny
 */
public class OrderSubject {
    
    private ArrayList<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    
    public void notifyAll(String name){
        for (Observer observer : observers) {
            observer.update(name);
        }
    }
    
}
