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
public class RestartGameView extends ViewBase {

    public RestartGameView() {
    }
    
    @Override
    protected String getMessage() {
        String menu = "\n\nLoad a Saved Game View"
                + "\n\nPage under construction"
                + "\n\nEnter Q to quit the view: ";
        
        return menu;
    }
    
    @Override
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
