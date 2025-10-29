/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CafeTests;

import Cafe.CashPayment;
import Cafe.Checkout;
import Cafe.CreditCardPayment;
import Cafe.PaymentStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michal.pokorny
 */
public class CheckoutTest {

    @Test
    public void testCreditCardPayment() {
        PaymentStrategy creditCard = new CreditCardPayment();
        String result = creditCard.pay(150f, 4);
        assertEquals("Customer want to pay 150.0 using Credit Card (table 4)", result);
    }

    @Test
    public void testCashPayment() {
        PaymentStrategy cash = new CashPayment();
        String result = cash.pay(100f, 2);
        assertEquals("Customer want to pay 100.0 by cash (table 2)", result);
    }

    @Test
    public void testCheckoutWithCreditCard() {
        Checkout checkout = new Checkout(new CreditCardPayment());
        String result = checkout.processPayment(200f, 5);
        assertEquals("Customer want to pay 200.0 using Credit Card (table 5)", result);
    }

    @Test
    public void testCheckoutSwitchToCash() {
        Checkout checkout = new Checkout(new CreditCardPayment());
        checkout.setStrategy(new CashPayment());
        String result = checkout.processPayment(50f, 1);
        assertEquals("Customer want to pay 50.0 by cash (table 1)", result);
    }

    @Test
    public void testMultiplePayments() {
        Checkout checkout = new Checkout(new CashPayment());
        String result1 = checkout.processPayment(120f, 3);
        assertEquals("Customer want to pay 120.0 by cash (table 3)", result1);

        checkout.setStrategy(new CreditCardPayment());
        String result2 = checkout.processPayment(250f, 6);
        assertEquals("Customer want to pay 250.0 using Credit Card (table 6)", result2);
    }
}
