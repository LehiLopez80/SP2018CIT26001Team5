/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.control;

import static byui.sp2018cit26001team5.theCityOfAaron.control.MapControl.createMap;
import static byui.sp2018cit26001team5.theCityOfAaron.control.StorehouseControl.createStorehouse;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.Map;
import byui.sp2018cit26001team5.theCityOfAaron.model.Player;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import thecityofaaron.TheCityOfAaron;
import static thecityofaaron.TheCityOfAaron.setCurrentGame;

/**
 *
 * @author Salvador Rubio
 */
public class GameControl {

    public GameControl() {
    }       
    
    public static void createNewGame(Player player) throws GameControlException {
        
        if (player.getName() == null) {
         //return -1;
         throw new GameControlException("Error: Missing players' name");
        }
        
        Game game = new Game();
        game.setPlayer(player);
                
        game.setCurrentPopulation(100);
        game.setAcresOwned(1000);
        game.setCurrentYear(1);
        game.setWheatInStorage(2700);
                
        int randomInt = (int) ((int)11*Math.random());
        int acresPrice = calculateAcresPrice (randomInt);
        game.setAcresPrice(acresPrice);
        
        Storehouse storehouse = createStorehouse();
        game.setStorehouse(storehouse);
        
        Map map = createMap();
        game.setMap(map);
        
        TheCityOfAaron.setCurrentGame(game);         
        
        //return 1;
    }  
    
    public static void saveGame (Game game, String filePath) 
            throws GameControlException, FileNotFoundException, IOException {
        
        if (game == null)
             throw new GameControlException ("Error: game object is null.");
        else if (filePath == null)
             throw new GameControlException ("Error: filePath object is null.");
        else if (filePath.length() < 1)
             throw new GameControlException ("Error: Empty filePath value");
//        else if (filePath == null)
//             throw new GameControlException ("Error: Invalid file path or name entered.");
        
        try (FileOutputStream fileOutput = new FileOutputStream(filePath);
                ObjectOutputStream objectOutput = new ObjectOutputStream (fileOutput)) {
            objectOutput.writeObject(game);
        } catch (IOException ex) {
            throw new IOException ("\nError saving game to file.");
        }        
    }
    
    public static Game getGame(String filePath) throws GameControlException, ClassNotFoundException, IOException {
        
        Game game = new Game();
        
        if (filePath == null)
             throw new GameControlException ("\nError: filePath object is null.");
        else if (filePath.length() < 1)
             throw new GameControlException ("\nError: Empty filePath value");
        
        try (FileInputStream fileInput = new FileInputStream(filePath);
                ObjectInputStream objectInput = new ObjectInputStream (fileInput)) {
            game = (Game) objectInput.readObject();
            setCurrentGame(game);
        } catch (IOException ex) {
            throw new IOException ("\nError loading the game. File not found.");
        }
        
        return game;
    }
    
    // Team Assingment
    public static int calculatePopulation(int initialPopulation, int peopleStarved
            , int peopleMovedToCity) throws GameControlException {
                
        // Validate there is not negative input.
        if (initialPopulation < 0 ) {
            throw new GameControlException ("\nError: Initial population is less than zero");
            // return -1; 
        }
        else if (peopleStarved < 0 ) {
            throw new GameControlException ("\nError: People starved is less than zero");
            // return -2;
        }
        else if (peopleMovedToCity < 0) {
            throw new GameControlException ("\nError: People Moved To City is less than zero");
            // return -3;
        }
        else 
            // Validate initial population is greater than people starved.
            if (peopleStarved > initialPopulation) {
                throw new GameControlException ("\nError: People starved is greater than Initial population");
                // return -4;
            }
            else {
                int population = initialPopulation - peopleStarved + peopleMovedToCity;
                
                return population;
            }        
    }
    
    /*********************************************************************
     * Salvador Rubio individual Assignment                              *
     * *******************************************************************
     */
  
    // Individual Assignment Salvador Rubio
    public static int calculateHarvest (int bushelsByAcre, int acresAvailable) 
            throws GameControlException {
    
        // Validate there is not negative input.
        if (bushelsByAcre < 0) {
            throw new GameControlException ("Error: Bushels are less than zero"); 
        } else if  (acresAvailable < 0) {
            throw new GameControlException ("Error: Acres are less than zero"); 
        } 
        else {   
            int finalHarvest = bushelsByAcre * acresAvailable;
            return finalHarvest;
        }                    
    }
    
    //Individual Assignment Salvador Rubio
    public static int calculatePeopleStarved (int people, int bushelsFeed)
            throws GameControlException {
     
        // Validate there is not negative input.
        if (people < 0 )  {
            throw new GameControlException ("Error: People are less than zero"); 
        } else if (bushelsFeed < 0) {
            throw new GameControlException ("Error: Bushels are less than zero"); 
        }
        else {
            
            if (people < (bushelsFeed/20)) {
                return 0;
            }
            else {
               int peopleStarved = people - (bushelsFeed/20);
                       return peopleStarved;
            }
            
        }                    
    }
    
    /*********************************************************************
     * Alonso Bernaldo individual Assignment                              *
     * *******************************************************************
     */
    
    // Individual Assignment Alonso Bernaldo
    public static int calculateBushelsToPlant(int acresToPlant)
           throws GameControlException{
                
        // Validate there is not negative input.
        if (acresToPlant < 0 ) {
           throw new GameControlException ("Error: Acres are less than zero");
        }
        else {
                int bushelsToPlant = (acresToPlant) /2; 
                          
                return bushelsToPlant;
            }
    }
    
    /*********************************************************************
     * Lehi Lopez individual Assignment                              *
     * *******************************************************************
     */
    
    /**
     * Function Name: calculateOfferings
     * Description: Function used to calculate the amount of bushels that will  
     *              be paid in tithes and afferings.
     * Inputs:
     *   - int bushelsHarvested: The amount of bushels harvested for the year.
     *   - int offeringsPercentage: The percentage to be paid in tithes and offerings.
     * Conditions: 
     *   - bushelsHarvested and offeringsPercentage must be greater or equal to zero.
     *   - offeringsPercentage must be less or equal to 100.
     * Output:
     *   - int tithesAndOfferings: The amount of bushels to be paid in tithes and offerings.
     * Author: Lehi Lopez
     */
    public static int calculateOfferings (int bushelsHarvested, int offeringsPercentage) 
                throws GameControlException {
        
        // Validate there is not negative input.
        if (bushelsHarvested < 0) {
            throw new GameControlException ("Error: Bushels harvested is less than zero");
        } else if (offeringsPercentage < 0) {
            throw new GameControlException ("Error: Tithes and Offerings percentage is less than zero");
        }       
        else {
            // Validate offeringsPercentage upper limit.
            if (offeringsPercentage > 100) {
                throw new GameControlException ("Error: Tithes and Offerings percentage is greater than 100");
            }            
            // Calculate output.
            else {
                int tithesAndOfferings = bushelsHarvested * offeringsPercentage / 100;
                // Ceil rounding if applicable, preferable for tithing and offerings
                if (((bushelsHarvested * offeringsPercentage) % 100) > 0) {
                    tithesAndOfferings++;
                }
                return tithesAndOfferings;
            }
        }
    }
    
    /**
     * Function Name: calculatePeopleMovedToCity
     * Description: Function used to calculate the number of people moved to the city.
     * Inputs:
     *   - int currentPopulation: The current population.
     *   - int randomInt: A random number between 1% and 5%
     * Conditions: 
     *   - currentPopulation must be greater or equal to zero.
     *   - randomInt must be an integer number between 0 and 5.
     * Output:
     *   - int growPopulation: The amount of people who moved to the city.
     * Author: Lehi Lopez
     */
    
    public static int calculatePeopleMovedToCity (int currentPopulation, int randomInt)
            throws GameControlException {
        
        // Validate there is not negative input.
        if (currentPopulation < 0) {
            throw new GameControlException ("Error: Current population is less than zero");
        } else if (randomInt < 0) {
            throw new GameControlException ("Error: Random Integer value is less than zero");
        }
        else {
            //Validate randomInt upper limit.
            if (randomInt > 5) {
                throw new GameControlException ("Error: Random Integer value is greater than five");
            }
            // Calculate output.
            else {
                int growPercentage = randomInt + 1;
                
                if (growPercentage > 5) {
                    growPercentage = 5;
                }
                
                int growPopulation = currentPopulation * growPercentage / 100;
                if (((currentPopulation * growPercentage) % 100) >= 50) {
                    growPopulation++;
                }
                return growPopulation;
            }
        }
    }
    
    /**
     * Function Name: calculateCropYield
     * Description: Function used to calculate the crop yield.
     * Inputs:
     *   - int offeringsPercentage: The percentage to be paid in tithes and offerings.
     *   - int randomInt: A random number between 0 and 12.
     * Conditions: 
     *   - offeringsPercentage must be an integer number between 0 and 100.
     *   - randomInt must be an integer number between 0 and 12.
     * Output:
     *   - int cropYield: The crop yield of the year.
     * Author: Lehi Lopez
     */
    
    public static int calculateCropYield (int offeringsPercentage, int randomInt) 
            throws GameControlException {
        
        // Validate there is not negative input.
        if (offeringsPercentage < 0) {
            throw new GameControlException ("Error: Tithes and Offerings percentage is less than zero");
        } else if (randomInt < 0) {
            throw new GameControlException ("Error: Random Integer value is less than zero");
        }
        else {
            //Validate offeringsPercentage and randomInt upper limits.
            if (offeringsPercentage > 100) {
                throw new GameControlException ("Error: Tithes and Offerings percentage is greater than 100");
            } else if (randomInt > 12) {
                throw new GameControlException ("Error: Random Integer value is greater than twelve");
            }
            // Calculate output.
            else {
                int cropYield;
                
                if (offeringsPercentage <= 12) {
                    if (randomInt < 4) {
                        cropYield = 1;
                    }
                    else {
                        if (randomInt < 8) {
                            cropYield = 2;
                        }
                        else {
                            cropYield = 3;
                        }
                    }
                    if (offeringsPercentage >=8) {
                        cropYield++;
                    }
                }
                else { //offeringPercentage > 12
                    if (randomInt < 3) {
                        cropYield = 2;
                    }
                    else {
                        if (randomInt < 6) {
                            cropYield = 3;
                        }
                        else {
                            if (randomInt < 9) {
                                cropYield = 4;
                            }
                            else {
                                cropYield = 5;
                            }
                        }
                    }
                }                
                                
                return cropYield;
            }
        }        
    }
    
    /**
     * Function Name: calculateAcresPrice
     * Description: Function used to calculate the price of an acre for the year.
     * Inputs:
     *   - int randomInt: A random number between 0 and 11.
     * Conditions: 
     *   - randomInt must be an integer number between 0 and 11.
     * Output:
     *   - int acresPrice: The price of an acre of price (between 17 and 27).
     * Author: Lehi Lopez
     */
    
    public static int calculateAcresPrice (int randomInt) throws GameControlException {
        
        //validate input range
        if (randomInt < 0) {
            throw new GameControlException ("Error: Random Integer value is less than zero");
        }
        if (randomInt > 11) {
            throw new GameControlException ("Error: Random Integer value is greater than eleven");
        }
        // Calculate output.
        else {
            int acresPrice = randomInt + 17;
            
            if (acresPrice > 27) {
                acresPrice = 27;
            }
            
            return acresPrice;
        }
    }

    //Individual Assignment Salvador Rubio
    public static int calculateBushelsInStore (int currentBushels, int bushelsHarvested, int bushelsOffered, int bushelsEatenByRats, int bushelsFeedToPeople, int bushelsToBuy, int bushelsFromSell) {
     
        // Validate there is not negative input.
        if (currentBushels < 0 || bushelsHarvested < 0 || bushelsOffered < 0 || bushelsEatenByRats < 0 || bushelsFeedToPeople < 0 || bushelsToBuy < 0 || bushelsFromSell < 0 ) {
            return -1; 
        }
        else {
                            
            int bushelsInStore = (currentBushels + bushelsHarvested - bushelsOffered - bushelsEatenByRats - bushelsFeedToPeople + bushelsToBuy - bushelsFromSell);
           
            if (bushelsInStore < 0) {
                return -1;
            }
            else {   
                return bushelsInStore;
            
            }
        }                    
    }
    
    //Individual Assignment Salvador Rubio
    public static int calculateBushelsEatenByRats (int bushelsInStore, int offeringsPercentage, 
            int randomEat, int randomPercentage)throws GameControlException {
        
        // Validate there is not negative input.
        if (bushelsInStore < 0){  
            throw new GameControlException ("Error: Bushels in store is less than zero");
        } else if (offeringsPercentage < 0) {
            throw new GameControlException ("Error: Offerings percentage is less than zero");
        } else if (randomEat < 0) {
            throw new GameControlException ("Error: Random eaten is less than 0");
        } else if (randomPercentage < 0) {
            throw new GameControlException ("Error: Random percentage is less than 0");
        }
        else {
            if (offeringsPercentage > 100) {
                throw new GameControlException ("Error: Bushels in store is greater than 100");
            } else if (randomEat > 100) {
                throw new GameControlException ("Error: Random eaten is greater than 100");
            } else if (randomPercentage > 15) {
                throw new GameControlException ("Error: Random percentage is greater than 15");
            }           
            else {          
                randomEat++;
                if (randomEat >= 30) {
                    return 0;
                }
                else {
                    int bushelsPercentage;
                    if (offeringsPercentage <= 12) {
                        if (randomPercentage < 3) {
                            bushelsPercentage = 3;
                        }
                        else {
                            if (randomPercentage < 6){
                                bushelsPercentage = 4;
                            }
                            else {
                                if (randomPercentage < 9) {
                                    bushelsPercentage = 5;
                                }
                                else {
                                    if (randomPercentage < 12) {
                                        bushelsPercentage = 6;
                                    }
                                    else {
                                        bushelsPercentage = 7;
                                    }
                                }
                            }
                        }
                        if (offeringsPercentage < 8) {
                            bushelsPercentage += 3;
                        }
                    }
                    else {
                        if (randomPercentage < 5) {
                            bushelsPercentage = 3;
                        }
                        else {
                            if (randomPercentage < 10) {
                                bushelsPercentage = 4;
                            }
                            else {
                                bushelsPercentage = 5;
                            }
                        }
                    }
                    int bushelsEatenByRats = bushelsInStore * bushelsPercentage;
                    return bushelsEatenByRats;
                }
            }
        }
    }
}
   