/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

/**
 * @author Salvador Rubio
 */
public class StartProgramView extends ViewBase{

    public StartProgramView() {
    }
    
    @Override
    protected String getMessage() {
        String message = "Hello, welcome to the city of Aaron.\n" +
            "This time you are in charge to manage the entire city and care of the\n" +
            "population. Part of your duties are as follow:\n" +
            "Harvest the fields of wheat\n" +
            "Buy and sell land acording your best criteria\n" +
            "Feed people in the city with the wheat in store\n" +
            "Fulfill with the offerings in an annual way\n" +
            "Avoid that rats eat the wheat in store\n" +
            "Beside all your responsabilities, you have some restrictions; if\n" +
            "you do not have enough wheat to feed people,these will die and\n" +
            "you will reduce your workforce; if you do not pay the tithes, the\n" +
            "number of rats will increase.\n" +
            "Please think smart to manage the city.";          
               
        return message;
    }
    
    @Override
    public void displayView(){
        
        String message = this.getMessage();
        
        this.console.println (message);
        this.doAction("");
    }    

    @Override
    public boolean doAction(String input) {
        
        MainMenuView mainMenuView = new MainMenuView ();
        mainMenuView.displayView();
        
        return true;
    }
}
