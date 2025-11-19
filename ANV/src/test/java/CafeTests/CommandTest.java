/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CafeTests;

import Cafe.OrderSubject;
import Cafe.second.OrderCommand;
import Cafe.second.PaymentCommand;
import Cafe.Checkout;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author michal.pokorny
 */
public class CommandTest {
    
    // Simple fake subject that captures notifyAll input
    static class FakeOrderSubject extends OrderSubject {
        public String lastMessage = null;

        @Override
        public void notifyAll(String msg) {
            this.lastMessage = msg;
        }
    }

    @Test
    public void testOrderCommandCallsNotifyAll() {
        FakeOrderSubject subject = new FakeOrderSubject();
        String name = "coffee in kavarna1";

        OrderCommand cmd = new OrderCommand(subject, name);
        cmd.execute();

        assertEquals(name, subject.lastMessage);
    }
    
    
    // Simple fake checkout that records pay calls
    static class FakeCheckout extends Checkout {

        public float lastAmount = -1;
        public int lastTable = -1;

        public FakeCheckout() {
            super(null); // null strategy for testing
        }

        @Override
        public String processPayment(float amount, int table) {
            this.lastAmount = amount;
            this.lastTable = table;
            return "OK"; // irrelevant for test
        }
    }

    @Test
    public void testPaymentCommandCallsProcessPayment() {
        OrderSubject subject = new OrderSubject();
        FakeCheckout checkout = new FakeCheckout();

        PaymentCommand cmd = new PaymentCommand(subject, checkout, 150f, 4);
        cmd.execute();

        assertEquals(150f, checkout.lastAmount);
        assertEquals(4, checkout.lastTable);
    }
}
