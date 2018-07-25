/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Player;

/**
 * @author Lehi Lopez
 */
public class StartNewGameView extends ViewBase {

    public StartNewGameView() {
    }
    
    @Override
    protected String getMessage() {
        
        String menu = "\n\nPlease enter your name: ";
        return menu;
    }
    
    @Override
    public boolean doAction(String name) {
        
        GameControl gameControl = new GameControl();
        Player player = new Player();
        player.setName (name);                
                
        try {            
            GameControl.createNewGame(player);
        } catch (GameControlException gce) {            
            ErrorView.display(this.getClass().getName(),gce.getMessage()); 
            //gce.printStackTrace();
            return true;
        }         
        
        this.console.println("\nWelcome to the game "+ player.getName() 
                + "\nWe hope you have a lot of fun");
        
        this.console.println("\nCurrent Annual Report\n"
                + "\nThe year number (1)"
                + "\nHow many people startved (0)"
                + "\nHow many people came to the city (5)"
                + "\nThe current population (100)"
                + "\nThe number of acres of crop land owned by the city (1000)"
                + "\nThe number of bushels per acre in this year harvest (3)"
                + "\nThe total number of bushels of wheat harvested (3000)"
                + "\nThe number of bushels paid in tithes and offerings (300)"
                + "\nThe number of bushels of wheat eaten by rats (0)"
                + "\nThe number of bushels of wheat in store (2700)");
 
        GameMenuView gameMenuView = new GameMenuView ();        
        gameMenuView.displayView();
        
        return true;
    }      
}
