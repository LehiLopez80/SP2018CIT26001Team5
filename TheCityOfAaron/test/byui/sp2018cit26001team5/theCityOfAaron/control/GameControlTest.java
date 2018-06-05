/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

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
    }
    
    /**
     * Test of calculateHarvest method, of class GameControl.
     */
    @Test
    public void testCalculateHarvest() {
        System.out.println("calculateHarvest");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int bushelsByAcre = 50;
        int acresAvailable = 10;
        
        int expResult = 500; // define the expected output variable
        
        // call the method
        int result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        bushelsByAcre = -33;
        acresAvailable = 12;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        bushelsByAcre = 45;
        acresAvailable = -15;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        bushelsByAcre = 53;
        acresAvailable = 0;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        bushelsByAcre = 0;
        acresAvailable = 20;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result); 
    }
    
    /**
     * Test of calculateBushelsToPlant method, of class GameControl.
     */
    @Test
    public void testCalculateBushelsToPlant() {
        System.out.println("calculateBushelsToPlant"); 
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int acresToPlant  = 20;
                
        int expResult = 10; // define the expected output variable
        
        // call the method
        int result = GameControl.calculateBushelsToPlant(acresToPlant);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
         // define the input variables
        acresToPlant  = -20;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsToPlant(acresToPlant);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        acresToPlant  = 0;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsToPlant(acresToPlant);        
        
        // test to see if the result reurned equals the expected result     
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculatePopulation method, of class GameControl.
     */
    @Test
    public void testCalculateOfferings() {
        System.out.println("calculateOfferings");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int bushelsHarvested = 3000;
        int offeringsPercentage = 13;
                
        int expResult = 390; // define the expected output variable
        
        // call the method
        int result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        bushelsHarvested = -100;
        offeringsPercentage = 10;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        bushelsHarvested = 2000;
        offeringsPercentage = -5;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        bushelsHarvested = 2500;
        offeringsPercentage = 102;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        bushelsHarvested = 0;
        offeringsPercentage = 8;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        bushelsHarvested = 3500;
        offeringsPercentage = 0;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        // define the input variables
        bushelsHarvested = 1500;
        offeringsPercentage = 100;
                
        expResult = 1500; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);        
    }  
    
    @Test
    public void testCalculatePeopleStarved() {
        System.out.println("calculatePeopleStarved");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int people = 70;
        int bushelsFeed = 50;
        
        int expResult = 20; // define the expected output variable
        
        // call the method
        int result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        people = 80;
        bushelsFeed = -22;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        people = -45;
        bushelsFeed = 15;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        people = 53;
        bushelsFeed = 0;
        
        expResult = 53; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        people = 0;
        bushelsFeed = 20;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
    }
}
