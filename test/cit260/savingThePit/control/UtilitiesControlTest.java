/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Appel
 */
public class UtilitiesControlTest {
    
    public UtilitiesControlTest() {
    }

    /**
     * Test of calcTomatoAngleApril method, of class UtilitiesControl.
     */
    @Test
    public void testCalcTomatoAngleApril() {
        System.out.println("calcTomatoAngleApril");
        
        /*******************************
         * Test Case #1
         ******************************/
        System.out.println("\tTest case #1");
        
        int angle = 15;
        String expResult = "Nice! You hit him right in the ear. He'll feel that for awhile.";
        // You hit him right in the ear. He'll feel that for awhile"
        UtilitiesControl instance = new UtilitiesControl();
        String result = instance.calcTomatoAngleApril(angle);
        assertEquals(expResult, result);
        System.out.println(expResult);
        System.out.println(result);

    }

    /**
     * Test of calcTablespoonsTom method, of class UtilitiesControl.
     */
    @Test
    public void testCalcTablespoonsTom() {
        System.out.println("calcTablespoonsTom");
        double tonsOfDirt = 20.0;
        double ounces = 1.0;
        UtilitiesControl instance = new UtilitiesControl();
        double expResult = 40000.0;
        double result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);

    }
    
}
