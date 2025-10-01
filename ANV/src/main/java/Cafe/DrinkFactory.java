/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class DrinkFactory {
    public static Drink createDrink(String type){
        switch(type) {
            case "tea":
                return new Tea();
            case "lemonade":
                return new Lemonade();
            default:
                System.out.println("Drink " + type + " isn't served here");
                return null;
        }
    }
}
