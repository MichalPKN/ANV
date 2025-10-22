/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CafeTests;

import Cafe.CustomDrink;
import Cafe.Drink;
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
        assertEquals(Drink.KEYWORD + " coffee", drink.toString(), "Drink should be just coffee without milk, sugar, or caramel.");
    }

    @Test
    public void testWithMilk() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().build();
        assertEquals(Drink.KEYWORD + " coffee, milk", drink.toString(), "Drink should have milk.");
    }

    @Test
    public void testWithSugar() {
        CustomDrink drink = new CustomDrink.Builder("coffee").sugar().build();
        assertEquals(Drink.KEYWORD + " coffee, sugar", drink.toString(), "Drink should have sugar.");
    }

    @Test
    public void testWithCaramel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").caramel().build();
        assertEquals(Drink.KEYWORD + " coffee, caramel", drink.toString(), "Drink should have caramel.");
    }

    @Test
    public void testWithMilkAndSugar() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().sugar().build();
        assertEquals(Drink.KEYWORD + " coffee, milk, sugar", drink.toString(), "Drink should have milk and sugar.");
    }

    @Test
    public void testWithMilkAndCaramel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().caramel().build();
        assertEquals(Drink.KEYWORD + " coffee, milk, caramel", drink.toString(), "Drink should have milk and caramel.");
    }

    @Test
    public void testWithSugarAndCaramel() {
        CustomDrink drink = new CustomDrink.Builder("coffee").sugar().caramel().build();
        assertEquals(Drink.KEYWORD + " coffee, sugar, caramel", drink.toString(), "Drink should have sugar and caramel.");
    }

    @Test
    public void testWithAllAdditives() {
        CustomDrink drink = new CustomDrink.Builder("coffee").milk().sugar().caramel().build();
        assertEquals(Drink.KEYWORD + " coffee, milk, sugar, caramel", drink.toString(), "Drink should have milk, sugar, and caramel.");
    }

    @Test
    public void testBuilderWithDifferentBases() {
        CustomDrink drink = new CustomDrink.Builder("tea").sugar().build();
        assertEquals(Drink.KEYWORD + " tea, sugar", drink.toString(), "Latte should have milk and sugar.");
    }

}