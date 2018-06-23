/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author Lehi Lopez
 */
public abstract class ViewBase implements View {

    public ViewBase() {
    }
    
    protected abstract String getMessage(); //
    
    public abstract boolean doAction (String input);
    
    @Override
    public void displayView() {
        
        boolean endView = false;
        
        do {            
            String input = this.getInput();
            endView = this.doAction(input); 
            
        } while(endView != true);        
    }
    
    @Override
    public String getInput() {
        
        String input = ""; //value to be returned
        boolean valid = false;  //initialize to not valid
        
        String menu = this.getMessage();
        System.out.println(menu);
        
        while (valid == false) { // loop while an invalid value is enter
                        
            Scanner keyboard = new Scanner(System.in); //get infile for keyboard
                        
            input = keyboard.nextLine();//getnext line typed on keyboard
            input = input.trim(); //trim off leading and trailing blanks
                                    
            if (input.length() < 1 ){ //if value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;            
        }
        return input; //returns the value 
    }    
}
