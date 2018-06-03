/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

/**
 *
 * @author Salvador Rubio
 */
public class GameControl {
    
    // Team Assingment
    public static int calculatePopulation(int initialPopulation, int peopleStarved, int peopleMovedToCity){
                
        // Validate there is not negative input.
        if (initialPopulation < 0 || peopleStarved < 0 || peopleMovedToCity < 0) {
            return -1; 
        }
        else 
            // Validate initial population is greater than people starved.
            if (peopleStarved > initialPopulation) {
                return -1;
            }
            else {
                int population = initialPopulation - peopleStarved + peopleMovedToCity;
                
                return population;
            }        
    }
  
    // Individual Assignment Salvador Rubio
    public static int calculateHarvest (int bushelsByAcre, int acresAvailable) {
    
        // Validate there is not negative input.
        if (bushelsByAcre < 0 || acresAvailable < 0) {
            return -1; 
        }
        else {
            
            int finalHarvest = bushelsByAcre * acresAvailable;
            return finalHarvest;
        }                    
    }
    
    // Individual Assignment Alonso Bernaldo
    public static int calculateBushelsToPlant(int acresToPlant){
                
        // Validate there is not negative input.
        if (acresToPlant < 0 ) {
            return -1; 
        }
        else {
                int bushelsToPlant = (acresToPlant) /2; 
                          
                return bushelsToPlant;
            }
    }
    
    //Individual Assignment Lehi Lopez
    public static int calculateOfferings(int bushelsHarvested, int offeringsPercentage) {
        
        // Validate there is not negative input.
        if (bushelsHarvested < 0 || offeringsPercentage < 0) {
            return -1;
        }
        else {
            if (offeringsPercentage > 100) {
                return -1;
            }
            else {
                int tithesAndOfferings = bushelsHarvested * offeringsPercentage / 100;
                return tithesAndOfferings;
            }
        }
    }
} 