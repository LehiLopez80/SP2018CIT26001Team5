/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.control.StorehouseControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Animal;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.InventoryItem;
import byui.sp2018cit26001team5.theCityOfAaron.model.Provision;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import thecityofaaron.TheCityOfAaron;

/**
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
                + "\n5 - Print the animals report"
                
                + "\n7 - Print the provisions report"
                + "\n8 - Return to the game menu"
                + "\n----------------------------------"
                + "\n\nEnter an option: ";
        
        return menu;
    }
    
    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); //converts to upper case
       
        switch (menuOption){
            case "1": 
                this.viewAnimalsInStorehouse();
                break;
               
            case "2": 
                this.viewToolsInStorehouse();
                break;
               
            case "3": 
                this.viewProvisionsInStorehouse();
                break;
            
            case "4": 
                this.viewAuthorsOfThisGame();
                break;               
                          
                case "5": 
        {
           try {
                this.printAnimalsReport();
            } catch (FileNotFoundException ex) {                
                ErrorView.display(this.getClass().getName(),
                    "\nFileNotFoundException on Print Animal Report");
            }
        }
                break;
            
            
            case "7": 
            {
                try {
                    this.printProvisionsReport();
                } catch (FileNotFoundException ex) {
                    //this.console.println("\nFileNotFoundException on Print Provision Report");
                    ErrorView.display(this.getClass().getName(),
                        "\nFileNotFoundException on Print Provision Report");
                }
            }
                break;
            
            case "8": //Return to the main menu
               this.returnMainMenu();
               return true;                 
             
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid selection *** Try again");
                break;     
        }
        return false;
        }
     
    private void viewAnimalsInStorehouse() {
       
        this.console.println("\nTools Report View"
                    + "\n\nQuantity   Tool");
       
        Game game = TheCityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getStorehouse();
        Animal[] animals = storehouse.getAnimals();
        
        for (Animal animal: animals) {
            this.console.println("   " + animal.getQuantity() + "       "
                    + animal.getName());
        }
        
        //StorehouseControl storehouseControl = new StorehouseControl();
        int total = StorehouseControl.totalAnimals(animals);
        
        this.console.println("\nThe total quantity of animals is " + total);
    }

    private void viewToolsInStorehouse() {
        this.console.println("\nTools Report View"
                    + "\n\nQuantity   Tool"); 
        
        Game game = TheCityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getStorehouse();
        InventoryItem[] toolItems = storehouse.getTools();
        
        for (InventoryItem toolItem: toolItems) {
            this.console.println("   " + toolItem.getQuantity() + "       "
                    + toolItem.getName());
        }
        
        //StorehouseControl storehouseControl = new StorehouseControl();
        int minVal = StorehouseControl.minimumToolItems(toolItems);
        
        this.console.println("\nThe minimum quantity value of tools is " + minVal);
    }

    private void viewProvisionsInStorehouse() { //sortProvitionItems
        
        this.console.println("\nProvision Report View"
                    + "\n\nProvision Quantity");
       
        Game game = TheCityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getStorehouse();
        Provision[] provisions = storehouse.getProvisions();
        
        for (Provision provision: provisions) {
            this.console.println(provision.getName() + "      " 
                    + provision.getQuantity());
        }
        
        //StorehouseControl storehouseControl = new StorehouseControl();
        Provision[] orderedProvisions = StorehouseControl.sortProvisions(provisions);
        
        this.console.println("\nProvision Report View ordered by quantity"
                    + "\n\nProvision Quantity");
        
        for (Provision orderedProvision: orderedProvisions) {
            this.console.println(orderedProvision.getName() + "      " 
                    + orderedProvision.getQuantity());
        }
    }
    
    private void printProvisionsReport() throws FileNotFoundException {
        this.console.println("\n\nEnter the file path or name to print the report: ");
        
        String filePath = ""; //value to be returned
        boolean valid = false;  //initialize to not valid
        
        Game game = TheCityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getStorehouse();
        Provision[] provisions = storehouse.getProvisions();        
               
        try {
            while (valid == false) { // loop while an invalid value is enter

                filePath = this.keyboard.readLine();//getnext line typed on keyboard
                filePath = filePath.trim(); //trim off leading and trailing blanks

                if (filePath.length() < 1 ){ //if value is blank
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                    continue;
                }
                
                try {
                    this.printProvisionsReportFile(provisions, filePath);
                } catch (FileNotFoundException fex) {
                    //this.console.println("\nFileNotFoundException on Print Provision Report");
                    ErrorView.display(this.getClass().getName(), fex.getMessage());
                            //"\nInvalid file path or name provided. Please try again");
                    continue;
                } 
                
                break;            
            }
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }       
        
        this.console.println("\nThe report was successfully printed on the following location: "
                + filePath);               
    }
    
    private void printProvisionsReportFile(Provision[] provisions, String filePath) 
            throws FileNotFoundException {
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            
            out.println("\n\n            Provision Report");
            out.printf("%n%-10s%10s%10s", "Name", "Quantity", "Condition");
            out.printf("%n%-10s%10s%10s", "----", "--------", "---------");
            
            for (Provision provision: provisions) {
                out.printf("%n%-10s%7d%10s", provision.getName()
                                           , provision.getQuantity()
                                           , provision.getCondition());
            }        
        } catch (FileNotFoundException fex) {
            //this.console.println("\nFileNotFoundException on Print Provision Report");
            throw new FileNotFoundException("\nInvalid file path or name provided. Please try again.");
            //ErrorView.display(this.getClass().getName(),
            //        "\nInvalid file path or name provided. Please try again.");
        }       
    }
    
    private void printAnimalsReport() throws FileNotFoundException {
        this.console.println("\n\nEnter the file path or name to print the report: ");
        
        String filePath = ""; //value to be returned
        boolean valid = false;  //initialize to not valid
        
        Game game = TheCityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getStorehouse();
        Animal[] animals = storehouse.getAnimals();        
               
        try {
            while (valid == false) { // loop while an invalid value is enter

                filePath = this.keyboard.readLine();//getnext line typed on keyboard
                filePath = filePath.trim(); //trim off leading and trailing blanks

                if (filePath.length() < 1 ){ //if value is blank
                    ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                    continue;
                }
                
                try {
                    this.printAnimalsReportFile(animals, filePath);
                } catch (FileNotFoundException fex) {
                    //this.console.println("\nFileNotFoundException on Print Animal Report");
                    ErrorView.display(this.getClass().getName(), fex.getMessage());
                            //"\nInvalid file path or name provided. Please try again");
                    continue;
                } 
                
                break;            
            }
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }       
        
        this.console.println("\nThe report was successfully printed on the following location: "
                + filePath);               
    }
    
    private void printAnimalsReportFile(Animal[] animals, String filePath) 
            throws FileNotFoundException {
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            
            out.println("\n\n            Animals Report");
            out.printf("%n%-10s%10s%10s", "Name", "Quantity", "Condition");
            out.printf("%n%-10s%10s%10s", "----", "--------", "---------");
            
            for (Animal animal: animals) {
                out.printf("%n%-10s%7d%10s", animal.getName()
                                           , animal.getQuantity()
                                           , animal.getCondition());
            }        
        } catch (FileNotFoundException fex) {
            //this.console.println("\nFileNotFoundException on Print Animal Report");
            throw new FileNotFoundException("\nInvalid file path or name provided. Please try again.");
            //ErrorView.display(this.getClass().getName(),
            //        "\nInvalid file path or name provided. Please try again.");
        }       
    }

    private void viewAuthorsOfThisGame() {
        this.console.println("Here you can check the authors of the game"); 
    }
        
    private void returnMainMenu() {
        this.console.println("Return to the game menu."); 
    }   
}
