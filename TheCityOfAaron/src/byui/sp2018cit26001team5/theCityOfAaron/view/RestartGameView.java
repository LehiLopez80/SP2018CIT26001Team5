/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author Vicky Lopez
 */
public class RestartGameView {

    public RestartGameView() {
    }
    
    public void displayRestartGameView() {
                    
        boolean endView = false;
        
        do {
            String input = this.getInput();
            endView = this.doAction(input);                  
        } while(endView != true); 
    }
    
    public String getInput(){
        
        String input;
        input = "";
        
        System.out.println("\n\nLoad a Saved Game View"
                + "\n\nPage under construction"
                + "\n\nEnter Q to quit the view: ");
        
        boolean valid = false;
        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextLine();
            //input = input.trim(); //Pending to check trim.
            //System.out.println("Trimmed input: " +input);
            
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
