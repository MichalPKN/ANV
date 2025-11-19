/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe.second;

import Cafe.Checkout;
import Cafe.OrderSubject;
import Cafe.PaymentStrategy;

/**
 *
 * @author michal.pokorny
 */
public class PaymentCommand implements Command{
    
    public OrderSubject subject;
    public Checkout checkout;
    public float amount;
    public int table;
    
    
    public PaymentCommand(OrderSubject os, Checkout checkout, float amount, int table ){
        subject = os;
        this.checkout = checkout;
        this.amount = amount;
        this.table = table;
    }

    @Override
    public void execute() {
        checkout.processPayment(amount, table);
    }
    
}
