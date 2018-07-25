/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

/**
 * @author Lehi Lopez
 */
public class ManageCropsMenuView extends ViewBase {

    public ManageCropsMenuView() {
    }
        
    @Override
    protected String getMessage() {
        String message = "\n\nManage Crops Menu"
                + "\nB - Buy Land, "
                + "\nS - Sell Land, "
                + "\nF - Feed the People, "
                + "\nP - Plant Crops, "
                + "\nT - Pay Tithes and Offerings, "
                + "\nR - Return to the Game Menu"
                + "\n\nEnter an option: ";
        return message;
    }
    
    @Override
    public boolean doAction(String input){
                        
        input = input.toUpperCase();
        
        switch (input) { 
            case "B": 
                BuyLandView buyLandView = new BuyLandView();
                buyLandView.displayView();
                break;
            case "S": 
                SellLandView sellLandView = new SellLandView();
                sellLandView.displayView();
                break;
            case "F": 
                FeedPeopleView feedPeopleView = new FeedPeopleView();
                feedPeopleView.displayView();
                break;
            case "P": 
                PlantCropsView plantCropsView = new PlantCropsView();
                plantCropsView.displayView();
                break;
            case "T": 
                PayOfferingsView payOfferingsView = new PayOfferingsView();
                payOfferingsView.displayView();
                break;
            case "R": this.console.println("Return to the Game Menu");
                return true;
            default: ErrorView.display(this.getClass().getName(),
                    "invalid menu item. Please enter a valid value");
                break;
        }       
        
        return false;
    }    
}
