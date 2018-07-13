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
        
        Game game = TheCityOfAaron.getCurrentGame();
                
        String message = "\nSell Land view"
                + "\n\nThe price of the land is: " + game.getAcresPrice()
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
                    "\nYou don't own that many acres");
            return false;
        }
        
        this.console.println("\nUpdate Acres owned and bushels in store");
        return true;
    }
    
    /*@Override
    public void displayView() {
                        
        boolean endView = false;
        do {
            int input = this.getIntInput();
            endView = this.doAction(input);
                  
        } while(endView != true);    
    }*/
    
    /*public int getIntInput() {
        
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
    }*/
    
    /*private boolean doAction(int input) {
        
        System.out.println("Update Acres owned and bushels in store");
        return true;
    }*/   
}
