/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.util.Scanner;

/**
 *
 * @author Salvador Rubio
 */
 
public class ReportsMenuView {
    
     private static final String MENU = "\n"
             
                + "\n----------------------------------"
                + "\n Reports Menu                        "
                + "\n ---------------------------------"
                + "\n1 - View the animals in the storehouse"
                + "\n2 - View the tools in the storehouse"
                + "\n3 - View the provisions in the storehouse"
                + "\n4 - View the authors of this game"
                + "\n5 - Return to the main menu"
                + "\n----------------------------------";
     
     public void displayReportsMenuView() {
        
        boolean done = false; //set flag to not done
        
        do {
            //promp for and gets players name
            String menuOption = this.getMenuOption();
            
            
            done = this.doAction(menuOption);
        } while (!done);
    }
     
     private String getMenuOption() {      
        
        String value = ""; //value to be returned
        boolean valid;  //initialize to not valid
        valid = false;
         
        System.out.println(MENU);
        
        while (!valid) { // loop while an invalid value is enter
            //System.out.println("\n" + this.promptMessage);
            
            Scanner keyboard = new Scanner(System.in); //get infile for keyboard
            
            
            value = keyboard.nextLine();//getnext line typed on keyboard
            //value = value.trim(); //trim off leading and trailing blanks
            //System.out.println("Trimmed: "+ value);
                    
            
            if (value.length() < 1 ){ //if value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
                            }
            break;
        }
        return value; //returns the value 
        }
     
     private boolean doAction(String menuOption) {
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
        System.out.println("*** Here you can check the tools"); 
    }

    private void viewProvisionsInStorehouse() {
        System.out.println("*** Here you can check the provisions"); 
    }

    private void viewAuthorsOfThisGame() {
        System.out.println("Here you can check the authors of the game"); 
    }
        
    private void returnMainMenu() {
        System.out.println("Return to the main menu."); 
    }
     
    
}
