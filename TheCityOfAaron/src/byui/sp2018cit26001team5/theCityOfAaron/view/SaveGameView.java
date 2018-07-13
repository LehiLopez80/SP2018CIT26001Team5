/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import java.io.IOException;
import thecityofaaron.TheCityOfAaron;

/**
 * @author Lehi Lopez
 */
public class SaveGameView extends ViewBase{

    public SaveGameView() {
    }    

    @Override
    protected String getMessage() {
        
        String message = "\nSave Game View"
                + "\n\nEnter the file path or file name to save the game: ";        
        
        return message; 
    }

    @Override
    public boolean doAction(String filePath) {
        
        Game game = TheCityOfAaron.getCurrentGame();
        
        try {
            GameControl.saveGame(game, filePath);
        } catch (GameControlException gce) {
            this.console.println(gce.getMessage());
            ErrorView.display(this.getClass().getName(),
                    "Not able to save the game. Game Exception. Please try again.");
            return false;
        } catch (IOException ex) {
            this.console.println(ex.getMessage());
            ErrorView.display(this.getClass().getName(),
                    "Not able to save the game. IO Exeption. Please try again.");
            return false;
        }               
        
        this.console.println("\nThe game was successfully saved on the following location: "
                + filePath);
        return true;
    }
    
}
