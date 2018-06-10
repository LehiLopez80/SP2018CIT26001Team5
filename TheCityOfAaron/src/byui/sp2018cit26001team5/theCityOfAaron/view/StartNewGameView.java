/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
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
                    
        boolean endView = false;
        
        do {
            String name = this.getName();
            //endView = this.setName(name);
            Player player = new Player();
            player.setName (name);
            //GameControl.setPlayer(player);
            endView = true;            
        } while(endView != true); 
        
        do {
            String input = this.getInput();
            endView = this.doAction(input);                  
        } while(endView != true); 
    }
    
    public String getName(){
        
        String name;
        name = "";
        
        System.out.println("\n\nPlease enter your name: ");
        
        boolean valid = false;
        
        while(valid == false){
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
    
    public String getInput(){
        
        String input;
        input = "";
        
        System.out.println("\n\nLoad the Start New Game View"
                + "\n\nPage under construction"
                + "\n\nEnter Q to quit the view: ");
        
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
            case "Q": System.out.println("Return to previous main menu");
                return true;
            default: System.out.println("invalid menu item. Please enter a "
                    + "valid value");
                break;
        }     
        
        return false;
    }
    
}
