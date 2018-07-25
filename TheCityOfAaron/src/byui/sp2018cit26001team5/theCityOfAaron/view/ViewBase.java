/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import thecityofaaron.TheCityOfAaron;

/**
 * @author Lehi Lopez
 */
public abstract class ViewBase implements View {

    protected final BufferedReader keyboard = TheCityOfAaron.getInFile();
    protected final PrintWriter console = TheCityOfAaron.getOutFile();
    
    public ViewBase() {
    }
    
    protected abstract String getMessage(); //
    
    @Override
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
        this.console.println(menu);
        
        try {
            while (valid == false) { // loop while an invalid value is enter

                input = this.keyboard.readLine();//getnext line typed on keyboard
                input = input.trim(); //trim off leading and trailing blanks

                if (input.length() < 1 ){ //if value is blank
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                    continue;
                }
                break;            
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return input; //returns the value 
    }    
}
