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
        
        Game game = new Game();
        game = TheCityOfAaron.getCurrentGame();
                
        String message = "\nSell Land view"
                + "\n\nThe price of the land is: " + game.getAcresPrice()
                + "\nHow many acres do you whish to sell?";        
        
        return message;        
    }

    @Override
    public boolean doAction(String input) {
        
        Game game = new Game();
        game = TheCityOfAaron.getCurrentGame();        
        
        char[] charInput = input.toCharArray();
        
        for (int i = 0; i < input.length(); i++) {
            
            if (charInput[i] > '9' || charInput[i] < '0') {
                if (charInput[i] != '-') {
                    System.out.println("You must enter a numerical value");                
                    return false;
                }
            }
        }
        
        int intInput = Integer.parseInt(input);
                
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
