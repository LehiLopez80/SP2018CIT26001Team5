/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

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
                + "\n1 - View the map"
                + "\n2 - Move to a new location"
                + "\n3 - Manage the crops"
                + "\n4 - Live the year"
                + "\n5 - Reports menu"
                + "\n6 - Save game"
                + "\n7 - Return to the main menu"
                + "\n----------------------------------";
        
        return menu;
    }
    
    @Override
    public boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); //converts to upper case
                          
        switch (menuOption){
            case "1": // view the map
                this.displayMap();
                break;
               
            case "2": //Move to a new location
                this.moveNewLocation();
                break;
               
            case "3": // Manage the crops
                ManageCropsMenuView manageCropsMenuView = new ManageCropsMenuView();
                manageCropsMenuView.displayView();
                break;
            
            case "4": //Live the year
                this.liveTheYear();
                break;
                       
            case "5": //Reports menu
                ReportsMenuView reportsMenuView = new ReportsMenuView();
                reportsMenuView.displayView();
                break;
               
            case "6": //Save game
                this.saveGame();
                break;
               
            case "7": //Return to the main menu
                this.console.println("Return to the main menu."); 
                return true;   
              
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid selection *** Try again");
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

    private void liveTheYear() {
        this.console.println("Chose this option to live the year."); 
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.displayView();
    }    
}
