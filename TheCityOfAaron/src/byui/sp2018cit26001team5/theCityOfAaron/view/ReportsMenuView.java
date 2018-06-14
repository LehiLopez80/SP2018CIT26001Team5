/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package byui.sp2018cit26001team5.theCityOfAaron.view;
import java.util.Scanner;
*/
/**
 *
 * @author Salvador Rubio
 
public class ReportsMenuView {
    
     private static final String MENU = "\n"
             
             + "\n----------------------------------"
                + "\n Game Menu                        "
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
     
    
}
*/