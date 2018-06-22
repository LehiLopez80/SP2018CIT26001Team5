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
 * @author Alonso Bernaldo
 */
public class FeedPeopleView {
    
    public FeedPeopleView() {
    }
    
    public void displayFeedPeopleView() {
        
        System.out.println("Feed People View");
        
        GameControl gameControl = new GameControl();
                    
        System.out.println("\nHow many bushels do you whish to feed your people?");
        
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
            
            if(input > 2700){
                System.out.println("You don't have enough bushels to buy");
                continue;
            }
            
            valid = true;
        }
        return input;        
    }

    private boolean doAction(int input) {
        
        System.out.println("Update bushels in store");
        return true;
    }
  
    
}
