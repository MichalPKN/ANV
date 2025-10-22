/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CafeTests;


import Cafe.EmployeeObserver;
import Cafe.Observer;
import Cafe.OrderSubject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author michal.pokorny
 */
public class observerNotificationsTest {

    private static class TestObserver implements Observer {
        String lastMessage = null;

        @Override
        public void update(String status) {
            lastMessage = status;
        }
    }

    @Test
    public void testObserverReceivesNotification() {
        OrderSubject order = new OrderSubject();
        TestObserver observer = new TestObserver();
        order.addObserver(observer);
        
        String msg = "Test order ready";
        order.notifyAll(msg);
        
        assertEquals(msg, observer.lastMessage);
    }

    @Test
    public void testNoObserverNoCrash() {
        OrderSubject order = new OrderSubject();
        // should not throw exception
        order.notifyAll("Nothing here");
        assertTrue(true);
    }
}