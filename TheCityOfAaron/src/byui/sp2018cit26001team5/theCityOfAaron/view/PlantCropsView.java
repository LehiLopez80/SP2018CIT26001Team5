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
public class PlantCropsView extends ViewBase {

    public PlantCropsView() {
    }      

    @Override
    protected String getMessage() {        
                      
        String message = "\nPlant Crops View"
                + "\n\nHow many acres of crops do you whish to plant?";        
        
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
                    "\nYou don't have that many acres to plant");
            return false;
        }
        
        if(intInput > game.getWheatInStorage()/2) {
            ErrorView.display(this.getClass().getName(),
                    "\nYou don't have enough bushels to plant that many acres");
            return false;
        }
        
        int bushels = game.getWheatInStorage();
        int cropsPlanted = Game.getCropsPlanted();
                
        bushels = bushels - intInput/2;
        game.setWheatInStorage(bushels);
        
        cropsPlanted = cropsPlanted + intInput;
        Game.setCropsPlanted(cropsPlanted);
        
        TheCityOfAaron.setCurrentGame(game);
        
        this.console.println("Bushels in store updated");        
        return true;       
    }    
}
