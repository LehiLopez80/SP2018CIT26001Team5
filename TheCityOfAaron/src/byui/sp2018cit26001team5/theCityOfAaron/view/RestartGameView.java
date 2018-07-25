/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import java.io.IOException;

/**
 * @author Lehi Lopez
 */
public class RestartGameView extends ViewBase {

    public RestartGameView() {
    }
    
    @Override
    protected String getMessage() {
        String menu = "\n\nLoad a Saved Game View"
                + "\n\nEnter the file path or file name to load the game: ";
        
        return menu;
    }
    
    @Override
    public boolean doAction(String filePath){
        
        try {
            GameControl.getGame(filePath);
        } catch (ClassNotFoundException ex) {
            this.console.println(ex.getMessage());
            ErrorView.display(this.getClass().getName(),
                    "Not able to load the game. Class Exeption. Please try again.");
            return false;
        } catch (GameControlException gce) {
            this.console.println(gce.getMessage());
            ErrorView.display(this.getClass().getName(),
                    "Not able to load the game. Game Exeption. Please try again.");
            return false;
        } catch (IOException ex) {
            this.console.println(ex.getMessage());
            ErrorView.display(this.getClass().getName(),
                    "Not able to load the game. IO Exeption. Please try again.");
            return false;
        }
        
        this.console.println("\nGame loaded successfully.");
        
        GameMenuView gameMenuView = new GameMenuView ();        
        gameMenuView.displayView();
        
        return true;
    }
}
