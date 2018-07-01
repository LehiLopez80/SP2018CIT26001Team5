/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.StorehouseControl;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.InventoryItem;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;
import java.util.Scanner;
import thecityofaaron.TheCityOfAaron;

/**
 *
 * @author Alonso Bernaldo
 */
 
public class ReportsMenuView extends ViewBase{
    
    public ReportsMenuView() {
    }
     
    @Override
    protected String getMessage() {
        String menu = "\n"
                + "\n----------------------------------"
                + "\n Reports Menu                        "
                + "\n ---------------------------------"
                + "\n1 - View the animals in the storehouse"
                + "\n2 - View the tools in the storehouse"
                + "\n3 - View the provisions in the storehouse"
                + "\n4 - View the authors of this game"
                + "\n5 - Return to the game menu"
                + "\n----------------------------------"
                + "\n\nEnter an option: ";
        
        return menu;
    }
    
    @Override
    public boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); //converts to upper case
       
       switch (menuOption){
           case "1": // view the map
               this.viewAnimalsInStorehouse();
               break;
               
           case "2": //Move to a new location
               this.viewToolsInStorehouse();
               break;
               
           case "3": // Manage the crops
               this.viewProvisionsInStorehouse();
               break;
            
           case "4": //Live the year
               this.viewAuthorsOfThisGame();
               break;               
                          
            case "5": //Return to the main menu
               this.returnMainMenu();
               return true;   
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }
     
     private void viewAnimalsInStorehouse() {
       
       System.out.println("*** Here you can check the animals");
    }

    private void viewToolsInStorehouse() {
        System.out.println("\nTools Report View"
                    + "\n\nQuantity   Tool"); 
        
        Game game = TheCityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getStorehouse();
        InventoryItem[] toolItems = storehouse.getTools();
        
        for (InventoryItem toolItem: toolItems) {
            System.out.println("   " + toolItem.getQuantity() + "       "
                    + toolItem.getName());
        }
        
        StorehouseControl storehouseControl = new StorehouseControl();
        int minVal = storehouseControl.minimumToolItems(toolItems);
        
        System.out.println("\nTHe minimum quantity value of tolls is " + minVal);
    }

    private void viewProvisionsInStorehouse() {
        System.out.println("*** Here you can check the provisions"); 
    }

    private void viewAuthorsOfThisGame() {
        System.out.println("Here you can check the authors of the game"); 
    }
        
    private void returnMainMenu() {
        System.out.println("Return to the game menu."); 
    }
     
    
}
