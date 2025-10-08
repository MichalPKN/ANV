/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CafeTests;

import Cafe.CustomDrink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michal.pokorny
 */
public class CustomDrinkTest {

    @Test
    public void testNoAdditives() {
        CustomDrink drink = new CustomDrink.Builder("coffee").build();
        assertEquals("Serving coffee", drink.toString(), "Drink should be just coffee without milk, sugar, or caramel.");
    }

    @Test
    public void testWithMilk() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().build();
        assertEquals("Serving coffee, milk", drink.toString(), "Drink should have milk.");
    }

    @Test
    public void testWithSugar() {
        CustomDrink drink = new CustomDrink.Builder("coffee").sugar().build();
        assertEquals("Serving coffee, sugar", drink.toString(), "Drink should have sugar.");
    }

    @Test
    public void testWithCaramel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").caramel().build();
        assertEquals("Serving coffee, caramel", drink.toString(), "Drink should have caramel.");
    }

    @Test
    public void testWithMilkAndSugar() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().sugar().build();
        assertEquals("Serving coffee, milk, sugar", drink.toString(), "Drink should have milk and sugar.");
    }

    @Test
    public void testWithMilkAndCaramel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().caramel().build();
        assertEquals("Serving coffee, milk, caramel", drink.toString(), "Drink should have milk and caramel.");
    }

    @Test
    public void testWithSugarAndCaramel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").sugar().caramel().build();
        assertEquals("Serving coffee, sugar, caramel", drink.toString(), "Drink should have sugar and caramel.");
    }

    @Test
    public void testWithAllAdditives() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().sugar().caramel().build();
        assertEquals("Serving coffee, milk, sugar, caramel", drink.toString(), "Drink should have milk, sugar, and caramel.");
    }

    @Test
    public void testBuilderWithDifferentBases() {
        CustomDrink drink = new CustomDrink.Builder("tea").sugar().build();
        assertEquals("Serving tea, sugar", drink.toString(), "Latte should have milk and sugar.");
    }

}