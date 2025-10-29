/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class Checkout {
    
    private PaymentStrategy strategy;
    
    public Checkout(PaymentStrategy ps){
        setStrategy(ps);
    }
    
    public void setStrategy(PaymentStrategy ps){
        strategy = ps;
    }
    
    public String processPayment(float amount, int table){
        return strategy.pay(amount, table);
    }
}
