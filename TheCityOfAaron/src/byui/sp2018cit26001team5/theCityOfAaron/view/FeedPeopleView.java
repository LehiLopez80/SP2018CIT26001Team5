/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import thecityofaaron.TheCityOfAaron;

/**
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
    
        Game game = TheCityOfAaron.getCurrentGame();        
        
        int intInput;
        try {       
            intInput = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(), 
                    "You must enter a valid number");
            return false;
        }
                
        if(intInput < 0){
            ErrorView.display(this.getClass().getName(), 
                    "You must not enter a negative value");
            return false;
        }
        
        if(intInput > game.getWheatInStorage()){
            ErrorView.display(this.getClass().getName(),
                    "You don't have that many bushels to feed people");
            return false;
        }
        
        int bushels = game.getWheatInStorage();
        int bushelsFeedPeople = Game.getBushelsFeedPeople();
                
        bushels = bushels - intInput;
        game.setWheatInStorage(bushels);
        
        bushelsFeedPeople = bushelsFeedPeople + intInput;
        Game.setBushelsFeedPeople(bushelsFeedPeople);
        
        TheCityOfAaron.setCurrentGame(game);
        
        this.console.println("\nBushels in store updated");        
        return true;
    }         
}
