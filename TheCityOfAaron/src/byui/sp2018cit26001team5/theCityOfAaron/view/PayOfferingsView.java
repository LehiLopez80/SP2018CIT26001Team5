/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import thecityofaaron.TheCityOfAaron;

/**
 * @author Lehi Lopez
 */
public class PayOfferingsView extends ViewBase {

    public PayOfferingsView() {
    }
    
    @Override
    protected String getMessage() {
        
        String message = "\nPay Tithes and Offerings View"
                + "\n\nWhat percentage of your harvest do you want to pay in tithes and offerings?";        
        
        return message;
    }

    @Override
    public boolean doAction(String input) {
        
        Game game = TheCityOfAaron.getCurrentGame();        
                
        int intInput;
        try {
            intInput = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), "You must enter a valid number.");
            return false;
        }
        
        if(intInput < 0){
            ErrorView.display(this.getClass().getName(), 
                    "Percentage of tithes and offerings must not be a negative value.");
            return false;
        }
            
        if(intInput > 100){
            ErrorView.display(this.getClass().getName(),
                    "Percentage of tithes and offerings must not be greater than 100.");
            return false;
        }
        
        Game.setOfferingsPercentage(intInput);        
              
        return true;
    }   
}
