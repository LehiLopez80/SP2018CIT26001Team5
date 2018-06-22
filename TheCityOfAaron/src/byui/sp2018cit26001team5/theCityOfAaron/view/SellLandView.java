/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import java.util.Scanner;
import thecityofaaron.TheCityOfAaron;

/**
 *
 * @author Lehi Lopez
 */
public class SellLandView extends ViewBase{

    public SellLandView() {
    }
    
    @Override
    protected String getMessage() {
        
        GameControl gameControl = new GameControl();
    
        int randomInt = (int) ((int)11*Math.random());
        int acresPrice = GameControl.calculateAcresPrice (randomInt);
        
        String message = "Sell Land view"
                + "\n\nThe price of the land is: " + acresPrice
                + "\nHow many acres do you whish to sell?";        
        
        return message;        
    }

    @Override
    public boolean doAction(String input) {
        return true;
    }
    
    @Override
    public void displayView() {
        
        //System.out.println("Sell Land view");
        
        //GameControl gameControl = new GameControl();
    
        //int randomInt = (int) ((int)11*Math.random());
        //int acresPrice = GameControl.calculateAcresPrice (randomInt);
        
        //System.out.println("The price of the land is: " + acresPrice);
        //System.out.println("\nHow many acres do you whish to sell?");
        
        boolean endView = false;
        do {
            int input = this.getIntInput();
            endView = this.doAction(input);
                  
        } while(endView != true);        
    }

    
    public int getIntInput() {
        
        int input = 0;
        boolean valid = false;
        
        String menu = getMessage();
        System.out.println(menu);
        
        Game game = new Game();
        game = TheCityOfAaron.getCurrentGame();
        //System.out.println("\nCurrPop " + game.getCurrentPopulation());
                        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextInt();
                        
            if(input < 0){
                System.out.println("You must not enter a negative value");
                continue;
            }
            
            if(input > game.getAcresOwned()){
                System.out.println("You don't own that many acres");
                continue;
            }
            
            valid = true;
        }
        return input;        
    }

    private boolean doAction(int input) {
        
        System.out.println("Update Acres owned and bushels in store");
        return true;
    }   
}
