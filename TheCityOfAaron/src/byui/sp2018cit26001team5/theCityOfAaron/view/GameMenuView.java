/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.Location;
import byui.sp2018cit26001team5.theCityOfAaron.model.Map;
import thecityofaaron.TheCityOfAaron;

/**
 * @author Salvador Rubio
 */
public class GameMenuView extends ViewBase{

    public GameMenuView() {
    }
            
    @Override
    protected String getMessage() {
        String menu = "\n"
                + "\n----------------------------------"
                + "\n Game Menu                        "
                + "\n ---------------------------------"
                + "\nM - View the map"
                + "\nL - Move to a new location"
                + "\nC - Manage the Crops"
                + "\nY - Live the year"
                + "\nR - Reports menu"
                + "\nS - Save game"
                + "\nQ - Return to main menu"
                + "\n----------------------------------"                
                + "\n\nPlease enter an option: ";
        
        return menu;
    }
    
    @Override
    public boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); //converts to upper case
                          
        switch (menuOption){
            case "M": // view the map
                this.displayMap();
                break;
               
            case "L": //Move to a new location
                this.moveNewLocation();
                break;
               
            case "C": // Manage the crops
                ManageCropsMenuView manageCropsMenuView = new ManageCropsMenuView();
                manageCropsMenuView.displayView();
                break;
            
            case "Y": { //Live the year
                try {
                    this.liveTheYear();
                } catch (GameControlException gce) {
                    ErrorView.display(this.getClass().getName(),gce.getMessage());                     
                }
            }
                break;
                       
            case "R": //Reports menu
                ReportsMenuView reportsMenuView = new ReportsMenuView();
                reportsMenuView.displayView();
                break;
               
            case "S": //Save game
                this.saveGame();
                break;
               
            case "Q": //Return to the main menu
                this.console.println("Return to the main menu."); 
                return true;   
              
            default:
                ErrorView.display(this.getClass().getName(),
                        "Invalid selection *** Try again");
                break;     
        }
        return false;
    }
      
    private void displayMap() {
        this.console.println("\nThe City of Aaron Map");
        
        Game game = TheCityOfAaron.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        this.console.println("\n     0      1      2       3        4"
                + "\n  ┌───┬───┬────┬────┬────┐"
                + "\n  │     │     │      │       │      │"
                + "\n 0│ "+locations[0][0].getMapSymbol()
                    +"  │ "+locations[0][1].getMapSymbol()
                    +"  │ "+locations[0][2].getMapSymbol()
                    +"   │ "+locations[0][3].getMapSymbol()
                    +"    │ "+locations[0][4].getMapSymbol()+"   │"
                + "\n  ├───┼───┼────┼────┼────┤"
                + "\n  │     │     │      │       │      │"
                + "\n 1│ "+locations[1][0].getMapSymbol()
                    +"  │ "+locations[1][1].getMapSymbol()
                    +"  │ "+locations[1][2].getMapSymbol()
                    +"   │ "+locations[1][3].getMapSymbol()
                    +"    │ "+locations[1][4].getMapSymbol()+"   │"
                + "\n  ├───┼───┼────┼────┼────┤"
                + "\n  │     │     │      │       │      │"
                + "\n 2│ "+locations[2][0].getMapSymbol()
                    +"  │ "+locations[2][1].getMapSymbol()
                    +"  │ "+locations[2][2].getMapSymbol()
                    +"   │ "+locations[2][3].getMapSymbol()
                    +"    │ "+locations[2][4].getMapSymbol()+"   │"
                + "\n  ├───┼───┼────┼────┼────┤"
                + "\n  │     │     │      │       │      │"
                + "\n 3│ "+locations[3][0].getMapSymbol()
                    +"  │ "+locations[3][2].getMapSymbol()
                    +"  │ "+locations[3][2].getMapSymbol()
                    +"   │ "+locations[3][3].getMapSymbol()
                    +"    │ "+locations[3][4].getMapSymbol()+"   │"
                + "\n  ├───┼───┼────┼────┼────┤"
                + "\n  │     │     │      │       │      │"
                + "\n 4│ "+locations[4][0].getMapSymbol()+"  │ "
                    +locations[4][1].getMapSymbol()
                    +"  │ "+locations[4][2].getMapSymbol()
                    +"   │ "+locations[4][3].getMapSymbol()
                    +"    │ "+locations[4][4].getMapSymbol()+"   │"
                + "\n  └───┴───┴────┴────┴────┘"
                
                +"\n\n RC - The Ruler´s court"
                +"\n CG - The City´s Granary"
                +"\n SH - Store House"                
                +"\n WF - Wheat Field"                
                +"\n UL - Undeveloped Land"                
                +"\n TV - The village"                
                +"\n AR - A river"                
                +"\n BL - The border of the Lamanites land"                
                +"\n TT - The temple");
    }

    private void moveNewLocation() {
        this.console.println("*** The new location is..."); 
    }

    private void liveTheYear() throws GameControlException {
        
        Game game = TheCityOfAaron.getCurrentGame();
        
        //Increment current year
        int currentYear = game.getCurrentYear();
        game.setCurrentYear(currentYear + 1);
        
        //calculate the number of bushels of wheat that are harvested
        int randomInt = (int) ((int)12*Math.random());
        int offeringsPercentage = Game.getOfferingsPercentage();
        int cropYield = GameControl.calculateCropYield(offeringsPercentage, randomInt);
        int acresPlanted = Game.getCropsPlanted();
        int bushelsHarvested = GameControl.calculateHarvest(cropYield, acresPlanted);
        
        //calculate the number of bushels of wheat paid in offerings
        int offerings = GameControl.calculateOfferings (bushelsHarvested, offeringsPercentage);
        
        //calculate the number of bushels of wheat in store
        int currentBushels = game.getWheatInStorage();
        currentBushels = GameControl.calculateBushelsInStore (currentBushels, bushelsHarvested
                , offerings, 0);
        
        //calculate the number of bushels of wheat in store eaten by rats
        int randomEat = (int) ((int)99*Math.random());
        int randomPercentage = (int) ((int)12*Math.random());
        int eatenByRats = GameControl.calculateBushelsEatenByRats (currentBushels, offeringsPercentage, 
            randomEat, randomPercentage);
        
        //recalculate the number of bushels of wheat in store
        currentBushels = GameControl.calculateBushelsInStore (currentBushels, 0, 0, eatenByRats);
        game.setWheatInStorage(currentBushels);
        
        //calculate the number of people starved
        int people = game.getCurrentPopulation();
        int bushelsFeed = Game.getBushelsFeedPeople();
        int peopleStarved = GameControl.calculatePeopleStarved (people, bushelsFeed);
        
        //validate if too many people have starved to end the game
        boolean endGame = false;
        if (peopleStarved*2 >= people)
            endGame = true;
        
        //calculate the number of people that move into the city
        int randomPeople = (int) ((int)5*Math.random());
        int peopleMoved = GameControl.calculatePeopleMovedToCity (people, randomPeople);
        
        //calculate current population
        people = GameControl.calculatePopulation(people, peopleStarved, peopleMoved);
        game.setCurrentPopulation(people);
        
        //Reset variables for next year
        randomInt = (int) ((int)11*Math.random());
        int acresPrice = GameControl.calculateAcresPrice (randomInt);
        Game.setAcresPrice(acresPrice);
        Game.setBushelsFeedPeople(0);
        Game.setCropsPlanted(0);
        Game.setOfferingsPercentage(0);
        
        //display the current annual report
        this.console.println("\nCurrent Annual Report\n"
                + "\nThe year number (" + game.getCurrentYear() + ")"
                + "\nHow many people startved (" + peopleStarved + ")"
                + "\nHow many people came to the city (" + peopleMoved + ")"
                + "\nThe current population (" + people + ")"
                + "\nThe number of acres of crop land owned by the city ("
                    + game.getAcresOwned() + ")"
                + "\nThe number of bushels per acre in this year harvest ("
                    + cropYield + ")"
                + "\nThe total number of bushels of wheat harvested ("
                    + bushelsHarvested + ")"
                + "\nThe number of bushels paid in tithes and offerings (" + offerings + ")"
                + "\nThe number of bushels of wheat eaten by rats (" + eatenByRats + ")"
                + "\nThe number of bushels of wheat in store (" + currentBushels + ")");
        
        TheCityOfAaron.setCurrentGame(game);
        
        //validate if too many people have starved to end the game
        if (endGame) {
            this.console.println("\nThe game is over. Many people starved.");
            this.console.close(); //Need to finish the program
        }
         
        if (currentYear > 10) {
            double rating = game.getAcresOwned()/people;
            this.console.println("\nYour ruler time is over. You have done a great job."
                    + "\n\nYour performance is: " + rating + " acres per people.");
            this.console.close(); //Need to finish the program
        }
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.displayView();
    }    
}
