/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;
import java.util.Scanner;
/**
 *
 * @author Alonso
 */
public class HelpMenuView {
     private final String menu;
     private final String promptMessage;
     private static final String MENU = "\n"
                + "\n----------------------------------"
                + "\n Help Menu                        "
                + "\n ---------------------------------"
                + "\nG - What are the goals of the game?"
                + "\nC - Where is the City of Aaron"
                + "\nM - How do I view the Map"
                + "\nL - How do I move to another Location"
                + "\nD - How do I display a list of animals, Provisions an tools in the City store house?"
                + "\nB - Back to the Main Menu"
                + "\nQ - Quit game"
                + "\n----------------------------------";
     
    public HelpMenuView(){
        System.out.println(MENU);
        
        this.promptMessage = "\n Help Menu: Please select an option: ";
        
        this.menu = "\nQ - Quit"
                + "\n----------------------------------"
                + "\n Help Menu                        "
                + "\n ---------------------------------"
                + "\nG - What are the goals of the game?"
                + "\nC - Where is the City of Aaron"
                + "\nM - How do I view the Map"
                + "\nL - How do I move to another Location"
                + "\nD - How do I display a list of animals, Provisions an tools in the City store house?"
                + "\nB - Back to the Main Menu"
                + "\nQ - Quit game"
                + "\n----------------------------------";
                }
    
    
   public void displayHelpMenuView() {
       System.out.println ("HELP MENU"); 
       boolean done = false; //set flag to not done
        do {
            //promp for and gets players name
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q")) //USER WANTS TO QUIT
                    return; //exit the game
            
            //do the requested action adnd display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

   private String getMenuOption() {
       
       Scanner keyboard = new Scanner(System.in); //get infile for keyboard
       String value = ""; //value to be returned
        
        boolean valid;  //initialize to not valid
         valid = false;
        System.out.println("\n\nN - Start new game, "
                + "\nR - Restart existing game, "
                + "\nH - Get help on how to play the game, "
                + "\nE - Exit"
                + "\n\nEnter an option: "); 
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();//getnext line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
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
           case "G": // explains goal of game
               this.goalOfGame();
               
           case "C": //Wheres is the City of Aaron
               this.move();
               
           case "M": // How do I view the map
               this.viewMap();
            
           case "L": //How do I move to another location
               this.anotherLocation();
               
           case "D": //Display lists
               this.displayLists();
               
           //case "B": //back to the main menu
               //this.backMain();
               //break;
              
           default:
               System.out.println("\nInvalid selection *** Try again");
               break;     
       }
       return false;
        }

    private void goalOfGame() {
       System.out.println(
       "\n\n*********************************************"
       + "\n* Welcome to City of Aron, you woke up in this     *"
       + "\n* City but you can't remember anything but your     *"
       + "\n* name, now you need to find a way to live.         *"
       + "\n*                                                     *"
       + "\n* You have to explore the city and look for items   *"
       + "\n* Good luck and have fun in this adventure.           *"
       + "\n*                                                     *"
       + "\n*******************************************************"
       );
    }

    private void move() {
        System.out.println("*** how to move?"); 
    }

    private void viewMap() {
        System.out.println("*** How do I view the map function called"); 
    }

    private void anotherLocation() {
        System.out.println("*** Move another location function called"); 
    }

    private void displayLists() {
        System.out.println("*** Displays lists function called"); 
    }

    
    
}
