/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salvador Rubio
 */
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    /**
     * Test of calculatePopulation method, of class GameControl.
     */
    @Test
    public void testCalculatePopulation() {
        System.out.println("calculatePopulation");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int initialPopulation = 100;
        int peopleStarved = 10;
        int peopleMovedToCity = 5;
        
        int expResult = 95; // define the expected output variable
        
        // call the method
        int result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        initialPopulation = -120;
        peopleStarved = 35;
        peopleMovedToCity = 13;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        initialPopulation = 224;
        peopleStarved = -16;
        peopleMovedToCity = 8;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        initialPopulation = 150;
        peopleStarved = 7;
        peopleMovedToCity = -2;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        initialPopulation = 30;
        peopleStarved = 42;
        peopleMovedToCity = 11;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        initialPopulation = 0;
        peopleStarved = 0;
        peopleMovedToCity = 15;
        
        expResult = 15; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        // define the input variables
        initialPopulation = 200;
        peopleStarved = 20;
        peopleMovedToCity = 0;
        
        expResult = 180; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 8 ---
        System.out.println("\tTest case 8");
        
        // define the input variables
        initialPopulation = 170;
        peopleStarved = 170;
        peopleMovedToCity = 25;
        
        expResult = 25; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePopulation(initialPopulation, peopleStarved, peopleMovedToCity);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype."); 
    }
    
}
