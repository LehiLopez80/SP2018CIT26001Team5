/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author Salvador Rubio
 */
public class MainMenuView {

    public MainMenuView() {
    }
    
    public void displayMainMenuView() {
                
        boolean endView = false;
        
        do {
            String input = this.getInput();
            //System.out.println("In[ut ="+ input);
            //if (input == "Q"){
            //   break;
            //}
            endView = this.doAction(input);
                  
        } while(endView != true);
    }
    
    public String getInput(){
        
        String input;
        input = "";
        
        System.out.println ("\n\nMAIN MENU");
        System.out.println("\nN - Start new game, "
                + "\nR - Restart existing game, "
                + "\nH - Get help on how to play the game, "
                + "\nE - Exit"
                + "\n\nEnter an option: ");
        
        boolean valid = false;
        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextLine();
            //input = input.trim(); //Pending to check trim.
            //System.out.println(input);
            
            if(input.length() < 1){
                System.out.println("You must enter a value");
                continue;
            }
            
            valid = true;
        }
        return input;
    }
    
    public boolean doAction(String input){
        
        StartNewGameView startNewGameView = new StartNewGameView ();        
        RestartGameView restartGameView = new RestartGameView ();
        HelpMenuView helpMenuView = new HelpMenuView();
                
        input = input.toUpperCase();
        
        switch (input) {
            case "N": // this.startNewGame();
                startNewGameView.displayStartNewGameView();
                break;
            case "R": // this.restartGame();
                restartGameView.displayRestartGameView();
                break;
            case "H": // this.getHelp();
                helpMenuView.displayHelpMenuView();
                break;
            case "E": System.out.println("You have exit the program.");
                return true;
            default: System.out.println("invalid menu item. Please enter a "
                    + "valid value");
                break;
        }     
        
        return false;
    }
}
