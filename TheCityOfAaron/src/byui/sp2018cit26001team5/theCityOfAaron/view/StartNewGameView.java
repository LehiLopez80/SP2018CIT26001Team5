/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.model.Player;
import java.util.Scanner;
import thecityofaaron.TheCityOfAaron;

/**
 *
 * @author Lehi Lopez
 */
public class StartNewGameView {

    public StartNewGameView() {
    }
    
    public void displayStartNewGameView() {
        
        this.requestPlayerName();
        // this.displayYearReport();
        // this.displayGameMenuView();
        
        AnnualReportView annualReportView = new AnnualReportView();
        annualReportView.displayAnnualReportView();
        
        GameMenuView gameMenuView = new GameMenuView ();        
        gameMenuView.displayGameMenuView();
    }
    
    public void requestPlayerName() {
                 
        String name = this.getPlayerName();
        
        Player player = new Player();
        player.setName (name);
        TheCityOfAaron.setPlayer(player);

        System.out.println("\nWelcome to the game "+ name 
                + "\nWe hope you have a lot of fun");
              
    }
    
    public String getPlayerName(){
        
        String name;
        name = "";
        
        boolean valid = false;
        
        while(valid == false){
        
            System.out.println("\n\nPlease enter your name: ");
                
            Scanner inFile;
            inFile = new Scanner(System.in);

            name = inFile.nextLine();

            if(name.length() < 1){
                System.out.println("You must enter a value");
                continue;
            }    
            valid = true;
        }        
        
        return name;
    }
    
    public void displayYearReport() {
        
        System.out.println("\nThe year number (1)"
                + "\nHow many people startved (0)"
                + "\nHow many people came to the city (5)"
                + "\nThe current population (100)"
                + "\nThe number of acres of crop land owned by the city (1000)"
                + "\nThe number of bushels per acre in this year harvest (3)"
                + "\nThe total number of bushels of wheat harvested (3000)"
                + "\nThe number of bushels of wheat eaten by rats (0)"
                + "\nThe number of bushels of wheat in store (2700)");
    }
    
    public void displayGameMenuView() {
                    
        boolean endView = false;
                        
        do {
            String input = this.getInput();
            endView = this.doAction(input);                  
        } while(endView != true); 
    }
    
    public String getInput(){
        
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
    }
    
}
