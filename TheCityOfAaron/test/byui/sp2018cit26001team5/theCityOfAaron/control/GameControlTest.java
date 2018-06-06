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
     * Author: Team Assignment.
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
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
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
    }
    
    /*********************************************************************
     * Salvador Rubio individual Assignment                              *
     * *******************************************************************
     */
    
    /**
     * Test of calculateHarvest method, of class GameControl.
     * Author: Salvador Rubio
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
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        bushelsByAcre = -33;
        acresAvailable = 12;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        bushelsByAcre = 45;
        acresAvailable = -15;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        bushelsByAcre = 53;
        acresAvailable = 0;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        bushelsByAcre = 0;
        acresAvailable = 20;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateHarvest(bushelsByAcre, acresAvailable);
        
        // test to see if the result returned equals the expected result        
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
        
        int expResult = 68; // define the expected output variable
        
        // call the method
        int result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        people = 80;
        bushelsFeed = -22;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        people = -45;
        bushelsFeed = 15;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        people = 53;
        bushelsFeed = 0;
        
        expResult = 53; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        people = 0;
        bushelsFeed = 40;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleStarved(people, bushelsFeed);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
    }
    
    /*********************************************************************
     * Alonso Bernaldo individual Assignment                              *
     * *******************************************************************
     */
    
    /**
     * Test of calculateBushelsToPlant method, of class GameControl.
     * Author: Alonso Bernaldo
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
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
         // define the input variables
        acresToPlant  = -20;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsToPlant(acresToPlant);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        acresToPlant  = 0;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsToPlant(acresToPlant);        
        
        // test to see if the result returned equals the expected result     
        assertEquals(expResult, result);
    }
    
    /*********************************************************************
     * Lehi Lopez individual Assignment                              *
     * *******************************************************************
     */
    
    /**
     * Test of calculateOfferings method, of class GameControl.
     * Author: Lehi Lopez
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
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        bushelsHarvested = -100;
        offeringsPercentage = 10;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        bushelsHarvested = 2000;
        offeringsPercentage = -5;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        bushelsHarvested = 2500;
        offeringsPercentage = 102;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        bushelsHarvested = 0;
        offeringsPercentage = 8;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        bushelsHarvested = 3500;
        offeringsPercentage = 0;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        // define the input variables
        bushelsHarvested = 1500;
        offeringsPercentage = 100;
                
        expResult = 1500; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 8 ---
        System.out.println("\tTest case 8");
        
        // define the input variables
        bushelsHarvested = 1001;
        offeringsPercentage = 10;
                
        expResult = 101; // define the expected output variable
        
        // call the method
        result = GameControl.calculateOfferings(bushelsHarvested, offeringsPercentage);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);  
    }  
    
    /**
     * Test of calculatePeopleMovedToCity method, of class GameControl.
     * Author: Lehi Lopez
     */
    @Test
    public void testCalculatePeopleMovedToCity() {
        System.out.println("calculatePeopleMovedToCity");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int currentPopulation = 100;
        int randomInt = 3;
                
        int expResult = 4; // define the expected output variable
        
        // call the method
        int result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        currentPopulation = 120;
        randomInt = 2;
                
        expResult = 4; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result returned equals the expected result         
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        currentPopulation = -1;
        randomInt = 4;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        currentPopulation = 150;
        randomInt = -1;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        currentPopulation = 110;
        randomInt = 6;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        currentPopulation = 0;
        randomInt = 1;
                
        expResult = 0; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        // define the input variables
        currentPopulation = 200;
        randomInt = 0;
                
        expResult = 2; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 8 ---
        System.out.println("\tTest case 8");
        
        // define the input variables
        currentPopulation = 160;
        randomInt = 4;
                
        expResult = 8; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 9 ---
        System.out.println("\tTest case 9");
        
        // define the input variables
        currentPopulation = 180;
        randomInt = 5;
                
        expResult = 9; // define the expected output variable
        
        // call the method
        result = GameControl.calculatePeopleMovedToCity(currentPopulation, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculateCropYield method, of class GameControl.
     * Author: Lehi Lopez
     */
    @Test
    public void testCalculateCropYield() {
        System.out.println("calculateCropYield");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int offeringsPercentage = 0;
        int randomInt = 3;
                
        int expResult = 1; // define the exofferingsPercentagepected output variable
        
        // call the method
        int result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        offeringsPercentage = 5;
        randomInt = 4;
                
        expResult = 2; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result         
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        offeringsPercentage = 7;
        randomInt = 12;
                
        expResult = 3; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        offeringsPercentage = 8;
        randomInt = 0;
                
        expResult = 2; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        offeringsPercentage = 10;
        randomInt = 7;
                
        expResult = 3; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        offeringsPercentage = 12;
        randomInt = 8;
                
        expResult = 4; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        // define the input variables
        offeringsPercentage = 13;
        randomInt = 2;
                
        expResult = 2; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 8 ---
        System.out.println("\tTest case 8");
        
        // define the input variables
        offeringsPercentage = 20;
        randomInt = 3;
                
        expResult = 3; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 9 ---
        System.out.println("\tTest case 9");
        
        // define the input variables
        offeringsPercentage = 50;
        randomInt = 6;
                
        expResult = 4; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 10 ---
        System.out.println("\tTest case 10");
        
        // define the input variables
        offeringsPercentage = 100;
        randomInt = 9;
                
        expResult = 5; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 11 ---
        System.out.println("\tTest case 11");
        
        // define the input variables
        offeringsPercentage = -1;
        randomInt = 1;
                
        expResult = -1; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 12 ---
        System.out.println("\tTest case 12");
        
        // define the input variables
        offeringsPercentage = 4;
        randomInt = -1;
                
        expResult = -1; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result         
        assertEquals(expResult, result);
        
        // --- Test case 13 ---
        System.out.println("\tTest case 13");
        
        // define the input variables
        offeringsPercentage = 101;
        randomInt = 11;
                
        expResult = -1; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 14 ---
        System.out.println("\tTest case 14");
        
        // define the input variables
        offeringsPercentage = 11;
        randomInt = 13;
                
        expResult = -1; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 15 ---
        System.out.println("\tTest case 15");
        
        // define the input variables
        offeringsPercentage = 14;
        randomInt = 0;
                
        expResult = 2; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 16 ---
        System.out.println("\tTest case 16");
        
        // define the input variables
        offeringsPercentage = 15;
        randomInt = 5;
                
        expResult = 3; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 17 ---
        System.out.println("\tTest case 17");
        
        // define the input variables
        offeringsPercentage = 16;
        randomInt = 8;
                
        expResult = 4; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 18 ---
        System.out.println("\tTest case 18");
        
        // define the input variables
        offeringsPercentage = 17;
        randomInt = 11;
                
        expResult = 5; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 19 ---
        System.out.println("\tTest case 19");
        
        // define the input variables
        offeringsPercentage = 18;
        randomInt = 12;
                
        expResult = 5; // define the exofferingsPercentagepected output variable
        
        // call the method
        result = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculateAcresPrice method, of class GameControl.
     * Author: Lehi Lopez
     */
    @Test
    public void testCalculateAcresPrice() {
        System.out.println("calculateAcresPrice");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int randomInt = 3;
                
        int expResult = 20; // define the expected output variable
        
        // call the method
        int result = GameControl.calculateAcresPrice(randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        randomInt = -1;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateAcresPrice(randomInt);
        
        // test to see if the result returned equals the expected result         
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        randomInt = 12;
                
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateAcresPrice(randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        randomInt = 0;
                
        expResult = 17; // define the expected output variable
        
        // call the method
        result = GameControl.calculateAcresPrice(randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        randomInt = 10;
                
        expResult = 27; // define the expected output variable
        
        // call the method
        result = GameControl.calculateAcresPrice(randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
        
        // --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        randomInt = 11;
                
        expResult = 27; // define the expected output variable
        
        // call the method
        result = GameControl.calculateAcresPrice(randomInt);
        
        // test to see if the result returned equals the expected result        
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCalculateBushelsInStore() {
        System.out.println("calculateBushelsInStore");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        // define the input variables
        int currentBushels = 350;
        int bushelsHarvested = 500;
	int bushelsOffered = 50;
	int bushelsEatenByRats = 15;
	int bushelsFeedToPeople = 420;
	int bushelsToBuy = 100;
	int bushelsFromSell = 20;
        
        int expResult = 445; // define the expected output variable
        
        // call the method
        int result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 2 ---
        System.out.println("\tTest case 2");
        
        // define the input variables
        currentBushels = -250;
        bushelsHarvested = 400;
	bushelsOffered = 40;
	bushelsEatenByRats = 52;
	bushelsFeedToPeople = 350;
	bushelsToBuy = 200;
	bushelsFromSell = 15;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);

	
	// --- Test case 3 ---
        System.out.println("\tTest case 3");
        
        // define the input variables
        currentBushels = 400;
        bushelsHarvested = -230;
	bushelsOffered = 25;
	bushelsEatenByRats = 63;
	bushelsFeedToPeople = 612;
	bushelsToBuy = 350;
	bushelsFromSell = 50;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 4 ---
        System.out.println("\tTest case 4");
        
        // define the input variables
        currentBushels = 380;
        bushelsHarvested = 500;
	bushelsOffered = -50;
	bushelsEatenByRats = 38;
	bushelsFeedToPeople = 590;
	bushelsToBuy = 185;
	bushelsFromSell = 30;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 5 ---
        System.out.println("\tTest case 5");
        
        // define the input variables
        currentBushels = 550;
        bushelsHarvested = 640;
	bushelsOffered = 64;
	bushelsEatenByRats = -45;
	bushelsFeedToPeople = 460;
	bushelsToBuy = 258;
	bushelsFromSell = 70;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 6 ---
        System.out.println("\tTest case 6");
        
        // define the input variables
        currentBushels = 620;
        bushelsHarvested = 180;
	bushelsOffered = 18;
	bushelsEatenByRats = 23;
	bushelsFeedToPeople = -470;
	bushelsToBuy = 520;
	bushelsFromSell = 30;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 7 ---
        System.out.println("\tTest case 7");
        
        // define the input variables
        currentBushels = 740;
        bushelsHarvested = 540;
	bushelsOffered = 54;
	bushelsEatenByRats = 15;
	bushelsFeedToPeople = 800;
	bushelsToBuy = -320;
	bushelsFromSell = 40;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 8 ---
        System.out.println("\tTest case 8");
        
        // define the input variables
        currentBushels = 680;
        bushelsHarvested = 740;
	bushelsOffered = 74;
	bushelsEatenByRats = 67;
	bushelsFeedToPeople = 650;
	bushelsToBuy = 380;
	bushelsFromSell = -62;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 9 ---
        System.out.println("\tTest case 9");
        
        // define the input variables
        currentBushels = 0;
        bushelsHarvested = 480;
	bushelsOffered = 48;
	bushelsEatenByRats = 35;
	bushelsFeedToPeople = 800;
	bushelsToBuy = 1025;
	bushelsFromSell = 50;
        
        expResult = 572; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 10 ---
        System.out.println("\tTest case 10");
        
        // define the input variables
        currentBushels = 1500;
        bushelsHarvested = 0;
	bushelsOffered = 50;
	bushelsEatenByRats = 79;
	bushelsFeedToPeople = 960;
	bushelsToBuy = 680;
	bushelsFromSell = 62;
        
        expResult = 1029; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 11 ---
        System.out.println("\tTest case 11");
        
        // define the input variables
        currentBushels = 1260;
        bushelsHarvested = 850;
	bushelsOffered = 0;
	bushelsEatenByRats = 53;
	bushelsFeedToPeople = 690;
	bushelsToBuy = 760;
	bushelsFromSell = 40;
        
        expResult = 2087; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 12 ---
        System.out.println("\tTest case 12");
        
        // define the input variables
        currentBushels = 2500;
        bushelsHarvested = 1120;
	bushelsOffered = 112;
	bushelsEatenByRats = 0;
	bushelsFeedToPeople = 3000;
	bushelsToBuy = 900;
	bushelsFromSell = 10;
        
        expResult = 1398; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 13 ---
        System.out.println("\tTest case 13");
        
        // define the input variables
        currentBushels = 1600;
        bushelsHarvested = 960;
	bushelsOffered = 96;
	bushelsEatenByRats = 37;
	bushelsFeedToPeople = 0;
	bushelsToBuy = 780;
	bushelsFromSell = 64;
        
        expResult = 3143; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 14 ---
        System.out.println("\tTest case 14");
        
        // define the input variables
        currentBushels = 980;
        bushelsHarvested = 1080;
	bushelsOffered = 108;
	bushelsEatenByRats = 67;
	bushelsFeedToPeople = 1300;
	bushelsToBuy = 0;
	bushelsFromSell = 90;
        
        expResult = 495; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);


	// --- Test case 15 ---
        System.out.println("\tTest case 15");
        
        // define the input variables
        currentBushels = 2100;
        bushelsHarvested = 2000;
	bushelsOffered = 200;
	bushelsEatenByRats = 150;
	bushelsFeedToPeople = 3700;
	bushelsToBuy = 1500;
	bushelsFromSell = 0;
        
        expResult = 1550; // define the expected output variable
        
        // call the method
        result = GameControl.calculateBushelsInStore(currentBushels, bushelsHarvested, bushelsOffered, bushelsEatenByRats, bushelsFeedToPeople, bushelsToBuy, bushelsFromSell);
        
        // test to see if the result reurned equals the expected result        
        assertEquals(expResult, result);
    
}
}