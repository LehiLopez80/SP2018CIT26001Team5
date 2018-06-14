/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Vicky Lopez
 */
public class SellLandView {

    public SellLandView() {
    }
    
    public void displaySellLandView() {
        
        System.out.println("Sell Land view");
        
        GameControl gameControl = new GameControl();
    
        int randomInt = (int) ((int)11*Math.random());
        int acresPrice = GameControl.calculateAcresPrice (randomInt);
        
        System.out.println("The price of the land is: " + acresPrice);
        System.out.println("\nHow many acres do you whish to sell?");
        
        boolean endView = false;
        do {
            int input = this.getInput();
            endView = this.doAction(input);
                  
        } while(endView != true);        
    }

    private int getInput() {
        
        int input = 0;
        
        boolean valid = false;
        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextInt();
                        
            if(input < 0){
                System.out.println("You must not enter a negative value");
                continue;
            }
            
            if(input > 3000){
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
