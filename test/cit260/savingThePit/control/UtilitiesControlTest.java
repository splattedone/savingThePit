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
    
        /*******************************
         * Test Case #1
         ******************************/
    public void testCalcTomatoAngleApril() {
        System.out.println("calcTomatoAngleApril");

        System.out.println("\tTest case #1");
        
        int angle = 15;
        int howHard = 5;
        int expResult = 75;

        UtilitiesControl instance = new UtilitiesControl();
        int result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #2
         ******************************/
        
        System.out.println("\tTest case #2");
        
        angle = 15;
        howHard = 0;
        expResult = 0;
 
        result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #3
         ******************************/
        
        System.out.println("\tTest case #3");
        
        angle = 30;
        howHard = 11;
        expResult = -1;
 
        result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #4
         ******************************/
        
        System.out.println("\tTest case #4");
        
        angle = 90;
        howHard = 3;
        expResult = -1;
 
        result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #5
         ******************************/
        
        System.out.println("\tTest case #5");
        
        angle = 25;
        howHard = 2;
        expResult = 50;
 
        result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #6
         ******************************/
        
        System.out.println("\tTest case #6");
        
        angle = 10;
        howHard = 1;
        expResult = 10;
 
        result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #7
         ******************************/
        
        System.out.println("\tTest case #7");
        
        angle = 10;
        howHard = 10;
        expResult = 100;
 
        result = instance.calcTomatoAngleApril(angle, howHard);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);

    }

    /**
     * Test of calcTablespoonsTom method, of class UtilitiesControl.
     */
    @Test
    public void testCalcTablespoonsTom() {
        System.out.println("calcTablespoonsTom");
        
        /*******************************
         * Test Case #1
         ******************************/
        
        System.out.println("\tTest case #1");
        
        double tonsOfDirt = 20.0;
        double ounces = 1.0;
        UtilitiesControl instance = new UtilitiesControl();
        double expResult = 40000.0;
        double result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #2
         ******************************/
        
        System.out.println("\tTest case #2");
        
        tonsOfDirt = 1.0;
        ounces = 1.0;
        
        expResult = -1;
        result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                        
        /*******************************
         * Test Case #3
         ******************************/
        
        System.out.println("\tTest case #3");
        
        tonsOfDirt = 20.0;
        ounces = 3.0;
        
        expResult = -2;
        result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                        
        /*******************************
         * Test Case #4
         ******************************/
        
        System.out.println("\tTest case #4");
        
        tonsOfDirt = 10.0;
        ounces = 1.0;
        
        expResult = -1;
        result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                        
        /*******************************
         * Test Case #5
         ******************************/
        
        System.out.println("\tTest case #5");
        
        tonsOfDirt = 0.0;
        ounces = 1.0;
        
        expResult = -1;
        result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                        
        /*******************************
         * Test Case #6
         ******************************/
        
        System.out.println("\tTest case #6");
        
        tonsOfDirt = 1000.0;
        ounces = 1.0;
        
        expResult = -1;
        result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                        
        /*******************************
         * Test Case #7
         ******************************/
        
        System.out.println("\tTest case #7");
        
        tonsOfDirt = 20.0;
        ounces = -1.0;
        
        expResult = -2;
        result = instance.calcTablespoonsTom(tonsOfDirt, ounces);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);

    }
    
    /**
     * Test of calcAmountOfDirtEthel method, of class UtilitiesControl.
     */
    @Test
    public void testCalcAmountOfDirtEthel() {
        System.out.println("calcAmountOfDirtEthel");
        
        /*******************************
         * Test Case #1
         ******************************/
        
        System.out.println("\tTest case #1");
        
        int height = 15;
        int radius = 35;
        int expResult = 57726;

        UtilitiesControl instance = new UtilitiesControl();
        int result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
         /*******************************
         * Test Case #2
         ******************************/
        
        System.out.println("\tTest case #2");
        
        height = 9;
        radius = 24;
        expResult = -1;

        result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #3
         ******************************/
        
        System.out.println("\tTest case #3");
        
        height = -1;
        radius = 20;
        expResult = -1;


        result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #4
         ******************************/
        
        System.out.println("\tTest case #4");
        
        height = 8;
        radius = -1;
        expResult = -1;


        result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #5
         ******************************/
        
        System.out.println("\tTest case #5");
        
        height = 10;
        radius = 30;
        expResult = 28274;


        result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #6
         ******************************/
        
        System.out.println("\tTest case #6");
        
        height = 15;
        radius = 25;
        expResult = 29452;


        result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #7
         ******************************/
        
        System.out.println("\tTest case #7");
        
        height = 10;
        radius = 25;
        expResult = 19634;


        result = (int) instance.calcAmountOfDirtEthel(height, radius);
        assertEquals(expResult, result);
        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
    }

    /**
     * Test of calcWafflesAnne method, of class UtilitiesControl.
     */
    @Test
    public void testCalcWafflesAnne() {
        System.out.println("calcWafflesAnne");
        
        /*******************************
         * Test Case #1
         ******************************/
        
        System.out.println("\tTest case #1");
        
        double size = 2;
        double howMany = 3;
        UtilitiesControl instance = new UtilitiesControl();
        
        double expResult = -6;
        double result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
        
        /*******************************
         * Test Case #2
         ******************************/
        
        System.out.println("\tTest case #2");
        
        size = .25;
        howMany = 4;

        expResult = -1;
        result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #3
         ******************************/
        
        System.out.println("\tTest case #3");
        
        size = 1.0;
        howMany = 5;

        expResult = -5;
        result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #4
         ******************************/
        
        System.out.println("\tTest case #4");
        
        size = .5;
        howMany = 8;

        expResult = -4;
        result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #5
         ******************************/
        
        System.out.println("\tTest case #5");
        
        size = .5;
        howMany = 12;

        expResult = -6;
        result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #6
         ******************************/
        
        System.out.println("\tTest case #6");
        
        size = 2.0;
        howMany = 0;

        expResult = -10;
        result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
                
        /*******************************
         * Test Case #7
         ******************************/
        
        System.out.println("\tTest case #7");
        
        size = 1.5;
        howMany = 0;

        expResult = -10;
        result = instance.calcWafflesAnne(size, howMany);
        assertEquals(expResult, result, 0.0);

        System.out.println("\t\tExpected result is: " + expResult);
        System.out.println("\t\tActual result is: " + result);
    
    
    
    
    
    }
}

    