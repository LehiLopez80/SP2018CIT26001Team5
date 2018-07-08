/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import thecityofaaron.TheCityOfAaron;

/**
 *
 * @author Salvador Rubio
 */
public class BuyLandView extends ViewBase {

    public BuyLandView() {
    }
    
    @Override
    protected String getMessage() {
        
        Game game = TheCityOfAaron.getCurrentGame();
                
        String message = "\nBuy Land view"
                + "\n\nThe price of the land is: " + game.getAcresPrice()
                + "\nHow many acres do you whish to buy?";        
        
        return message;        
    }
    
    @Override
    public boolean doAction(String input) {
    
        Game game = TheCityOfAaron.getCurrentGame();
        
        int intInput;
        try {
            intInput = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number");
            return false;
        }
                
        if(intInput < 0){
            System.out.println("You must not enter a negative value");
            return false;
        }
            
        if(intInput > game.getAcresOwned()){
            System.out.println("You don't own that many acres");
            return false;
        }
        
        System.out.println("Update Acres owned and bushels in store");
        return true;
    }       
}
