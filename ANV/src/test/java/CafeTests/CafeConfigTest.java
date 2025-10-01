/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CafeTests;

import Cafe.CafeConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michal.pokorny
 */
public class CafeConfigTest {
    @Test
    public void testSingleton() {
        CafeConfig cafe = CafeConfig.getInstance("kavarna1");
        CafeConfig secondCafe = CafeConfig.getInstance("cafe2");
        System.out.println(cafe.getCafeName());
        System.out.println(secondCafe.getCafeName());
        System.out.println(CafeConfig.getInstance("cukrarna3").getCafeName());

        assertEquals("kavarna1", cafe.getCafeName());
        assertEquals("kavarna1", secondCafe.getCafeName());
        assertEquals("kavarna1", CafeConfig.getInstance("cukrarna3").getCafeName());
    }
    
}
