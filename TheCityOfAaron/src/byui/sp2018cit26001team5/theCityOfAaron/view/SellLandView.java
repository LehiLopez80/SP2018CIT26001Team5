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
public class SellLandView extends ViewBase{

    public SellLandView() {
    }
    
    @Override
    protected String getMessage() {        
                
        String message = "\nSell Land view"
                + "\n\nThe price of the land is: " + Game.getAcresPrice()
                + "\nHow many acres do you whish to sell?";        
        
        return message;        
    }

    @Override
    public boolean doAction(String input) {
        
        Game game = TheCityOfAaron.getCurrentGame();        
                
        int intInput;
        try {
            intInput = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number");
            return false;
        }
                
        if(intInput < 0){
            ErrorView.display(this.getClass().getName(),
                    "\nYou must not enter a negative value");
            return false;
        }
            
        if(intInput > game.getAcresOwned()){
            ErrorView.display(this.getClass().getName(),
                    "\nYou don't own that many acres to sell");
            return false;
        }
        
        int acres = game.getAcresOwned();
        int bushels = game.getWheatInStorage();
        
        acres = acres - intInput;
        game.setAcresOwned(acres);
        
        bushels = bushels + intInput * Game.getAcresPrice();
        game.setWheatInStorage(bushels);
        
        TheCityOfAaron.setCurrentGame(game);
        
        this.console.println("Acres owned and bushels in store updated");
        
        return true;
    }
}
