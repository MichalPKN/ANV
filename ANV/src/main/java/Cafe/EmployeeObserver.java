/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class EmployeeObserver implements Observer{
    
    private String name;
    
    public EmployeeObserver(String name){
        this.name = name;
    }
    
    @Override
    public void update(String status) {
        System.out.println(name + " notified: " + status);
    }
    
}
