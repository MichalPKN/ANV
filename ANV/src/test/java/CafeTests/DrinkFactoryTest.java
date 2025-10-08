/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CafeTests;

import Cafe.Lemonade;
import Cafe.Tea;
import Cafe.Drink;
import Cafe.DrinkFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michal.pokorny
 */
public class DrinkFactoryTest {
    @Test
    public void testCreateTea() {
        Drink drink = DrinkFactory.createDrink("tea");
        assertNotNull(drink);
        assertTrue(drink instanceof Tea);
        assertEquals("Serving tea", drink.serve());
    }

    @Test
    public void testCreateLemonade() {
        Drink drink = DrinkFactory.createDrink("lemonade");
        assertNotNull(drink);
        assertTrue(drink instanceof Lemonade);
        assertEquals("Serving lemonade", drink.serve());
    }

    @Test
    public void testCreateUnknownDrink() {
        Drink drink = DrinkFactory.createDrink("nonexistent_drink");
        assertNull(drink);
    }
    
}
