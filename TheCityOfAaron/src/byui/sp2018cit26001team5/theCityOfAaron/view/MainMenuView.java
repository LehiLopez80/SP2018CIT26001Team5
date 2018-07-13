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
public class MainMenuView extends ViewBase{

    public MainMenuView() {
    }
    
    @Override
    protected String getMessage() {
        String menu = "\n\nMAIN MENU\nN - Start new game, "
                + "\nR - Restart existing game, "
                + "\nH - Get help on how to play the game, "
                + "\nE - Exit"
                + "\n\nEnter an option: ";
        
        return menu;
    }
    
    @Override
    public boolean doAction(String input){       
                
        input = input.toUpperCase();
        
        switch (input) {
            case "N": 
                StartNewGameView startNewGameView = new StartNewGameView (); 
                startNewGameView.displayView();
                break;
            case "R": 
                RestartGameView restartGameView = new RestartGameView ();
                restartGameView.displayView();
                break;
            case "H": 
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayView(); 
                break;
            case "E": this.console.println("You have exit the program.");
                return true;
            default: ErrorView.display(this.getClass().getName(),
                    "invalid menu item. Please enter a valid value");
                break;
        }     
        
        return false;
    }        
}
