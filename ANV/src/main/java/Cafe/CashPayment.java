/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class CashPayment implements PaymentStrategy{

    @Override
    public String pay(float amount, int table) {
        return "Customer want to pay " + amount + " by cash (table " + table + ")";
    }
    
}
