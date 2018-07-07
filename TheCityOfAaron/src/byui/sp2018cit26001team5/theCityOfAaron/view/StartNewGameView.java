/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import thecityofaaron.TheCityOfAaron;

/**
 *
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
        //player.setName (name); 
               
        /* Lesson 11 - Team Assignment
        * Code added to show on screen the error message displayed when 
        * the createNewGame function is called in erroneous scenario and
        * displays a message using the error handling
        */
        
        try {
            //int returnValue =
            GameControl.createNewGame(player);
        } catch (GameControlException gce) {            
            System.out.println(gce.getMessage()); 
            //gce.printStackTrace();
            //return true;
        }
        
        // End of extra code for L11 Team Assignment
        
        player.setName (name); 
        
        try {
            //int returnValue =
            GameControl.createNewGame(player);
        } catch (GameControlException gce) {            
            System.out.println(gce.getMessage()); 
            //gce.printStackTrace();
            return true;
        }
        
        //if (returnValue < 0) {
        //    System.out.println("ERROR - Failed to create new game");
        //}        
        
        System.out.println("\nWelcome to the game "+ player.getName() 
                + "\nWe hope you have a lot of fun");
        
        System.out.println("\nThe year number (1)"
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
    
    /*public String getInput(){
        
        String input;
        input = "";
        
        System.out.println("\nGame Menu"
                + "\n\nM - View the map"
                + "\nL - Move to a new location"
                + "\nC - Manage the Crops"
                + "\nY - Live the Year"
                + "\nR - Reports Menu"
                + "\nS - Save Game"
                + "\nQ - Return to Main Menu"
                + "\n\nPlease enter an option: n");
        
        boolean valid = false;
        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextLine();
                        
            if(input.length() < 1){
                System.out.println("You must enter a value");
                continue;
            }
            
            valid = true;
        }
        return input;
    }
    
    public boolean doAction(String input){
        
        input = input.toUpperCase();
        
        switch (input) { 
            case "M": System.out.println("Future call to View the map page");
                break;
            case "L": System.out.println("Future call to Move to new location page");
                break;
            case "C": System.out.println("Future call to Manage the Crops page");
                break;
            case "Y": System.out.println("Future call to Live the Year method");
                break;
            case "R": System.out.println("Future call to Reports Menu view");
                break;
            case "S": System.out.println("Future call to save the game page");
                break;
            case "Q": System.out.println("Return to previous main menu");
                return true;
            default: System.out.println("invalid menu item. Please enter a "
                    + "valid value");
                break;
        }     
        
        return false;
    }*/        
}
