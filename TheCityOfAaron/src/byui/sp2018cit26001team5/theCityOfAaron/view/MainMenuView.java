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
        System.out.println ("MAIN MENU");
        
        boolean endView = false;
        
        do {
            String input = this.getInput();
            if (input == "Q"){
                return;
            }
            endView = this.doAction(input);
                  
        } while(endView != true);
    }
    
    public String getInput(){
        
        String input;
        input = "";
        
        System.out.println("\n\nN - Start new game, "
                + "\nR - Restart existing game, "
                + "\nH - Get help on how to play the game, "
                + "\nE - Exit"
                + "\n\nEnter an option: ");
        
        boolean valid = false;
        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextLine();
            input = input.trim(); //Pending to check trim.
System.out.println(input);
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
            case "N": // this.startNewGame();
                System.out.println("start new game");
                return true;
            case "R": // this.restartGame();
                System.out.println("restart game");
                return true;
            case "H": // this.getHelp();
                System.out.println("get help");
                return true;
            case "E": System.out.println("You have exit the programe");
                return true;
            default: System.out.println("invalid menu item");
        }     
        
        return false;
    }
}
