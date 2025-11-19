/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe.second;

import Cafe.OrderSubject;

/**
 *
 * @author michal.pokorny
 */
public class OrderCommand implements Command{
    
    public OrderSubject subject;
    public String name;
    
    public OrderCommand(OrderSubject os, String name){
        subject = os;
        this.name = name;
    }

    @Override
    public void execute() {
        subject.notifyAll(name);
    }
    
}
