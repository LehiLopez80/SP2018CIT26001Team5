/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

/**
 *
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
                this.viewTheMap();
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
                System.out.println("Return to the main menu."); 
                return true;   
              
            default:
                System.out.println("\nInvalid selection *** Try again");
                break;     
        }
        return false;
    }
      
    private void viewTheMap() {
        System.out.println("*** Would you like to view the map?");
    }

    private void moveNewLocation() {
        System.out.println("*** The new location is..."); 
    }

    private void liveTheYear() {
        System.out.println("Chose this option to live the year."); 
    }

    private void saveGame() {
        System.out.println("Here you can save the game."); 
    }
    
}
