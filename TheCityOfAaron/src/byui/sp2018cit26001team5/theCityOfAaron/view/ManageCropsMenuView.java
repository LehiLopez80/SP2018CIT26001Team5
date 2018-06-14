/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author Vicky Lopez
 */
public class ManageCropsMenuView {

    public ManageCropsMenuView() {
    }
    
    public void displayManageCropsMenuView() {
                
        boolean endView = false;
        
        do {
            String input = this.getInput();
            //System.out.println("In[ut ="+ input);
            //if (input == "Q"){
            //   break;
            //}
            endView = this.doAction(input);
                  
        } while(endView != true);
    }
    
    public String getInput(){
        
        String input;
        input = "";
        
        System.out.println ("\n\nManage Crops Menu");
        System.out.println("\nB - Buy Land, "
                + "\nS - Sell Land, "
                + "\nF - Feed the People, "
                + "\nP - Plant Crops, "
                + "\nT - Pay Tithes and Offerings, "
                + "\nR - Return to thr Game Menu"
                + "\n\nEnter an option: ");
        
        boolean valid = false;
        
        while(valid == false){
            Scanner inFile;
            inFile = new Scanner(System.in);

            input = inFile.nextLine();
            //input = input.trim(); //Pending to check trim.
            //System.out.println(input);
            
            if(input.length() < 1){
                System.out.println("You must enter a value");
                continue;
            }
            
            valid = true;
        }
        return input;
    }
    
    public boolean doAction(String input){
        
        BuyLandView buyLandView = new BuyLandView();
        
        input = input.toUpperCase();
        
        switch (input) { 
            case "B": System.out.println("Future call to Buy Land view");
                break;
            case "S": 
                SellLandView sellLandView = new SellLandView();
                sellLandView.displaySellLandView();
                break;
            case "F": System.out.println("Future call to Feed the People view");
                break;
            case "P": System.out.println("Future call to Plant Crops view");
                break;
            case "T": System.out.println("Future call to Pay Tithes and Offerings view");
                break;
            case "R": System.out.println("Return to the Game Menu");
                return true;
            default: System.out.println("invalid menu item. Please enter a "
                    + "valid value");
                break;
        }       
        
        return false;
    }
}
