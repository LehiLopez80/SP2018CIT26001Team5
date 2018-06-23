/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import java.util.Scanner;
import thecityofaaron.TheCityOfAaron;

/**
 *
 * @author Alonso Bernaldo
 */
public class FeedPeopleView extends ViewBase{
    
    public FeedPeopleView() {
    }
    
    @Override
    protected String getMessage() {
                    
        String message = "\nFeed People View"
                + "\n\nHow many bushels do you whish to feed your people?";        
        
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
        
        if(intInput > game.getWheatInStorage()){
            System.out.println("You don't have that many bushels to feed people");
            return false;
        }    
       
        System.out.println("Update bushels in store");
        return true;
    }       
    
    
}
