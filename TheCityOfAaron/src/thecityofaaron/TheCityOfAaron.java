/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecityofaaron;

import byui.sp2018cit26001team5.theCityOfAaron.model.Animal;
import byui.sp2018cit26001team5.theCityOfAaron.model.Author;
import byui.sp2018cit26001team5.theCityOfAaron.model.Condition;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.InventoryItem;
import byui.sp2018cit26001team5.theCityOfAaron.model.ItemType;
import byui.sp2018cit26001team5.theCityOfAaron.model.Location;
import byui.sp2018cit26001team5.theCityOfAaron.model.Map;
import byui.sp2018cit26001team5.theCityOfAaron.model.Player;
import byui.sp2018cit26001team5.theCityOfAaron.model.Point;
import byui.sp2018cit26001team5.theCityOfAaron.model.Provision;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;

/**
 *
 * @author Lehi Lopez
 */
public class TheCityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create objects
        Player playerOne = new Player();
        Game gameOne = new Game();
        Storehouse storehouseOne = new Storehouse();
        
        //team assignmnt call setter functions
        
        playerOne.setName("Alonso");
                     
        gameOne.setCurrentPopulation(100);
        gameOne.setAcresOwned(1000);
        gameOne.setWheatInStorage(3000);
        gameOne.setCurrentYear(1);
        gameOne.setPlayer(playerOne);
        gameOne.setStorehouse(storehouseOne);
        
        Author[] authorsOne = new Author[3];
        storehouseOne.setAuthors(authorsOne);
        
        //call getter functions and print to screen
        
        String playerOneName = playerOne.getName();
        System.out.println("Name = " + playerOneName);
        System.out.println(playerOne.toString());
        
        int gameOneCurrentPopulation = gameOne.getCurrentPopulation();
        System.out.println("Current Population = " + gameOneCurrentPopulation);
        int gameOneAcresOwned = gameOne.getAcresOwned();
        System.out.println("Acres Owned = " + gameOneAcresOwned);
        int gameOneWheatInStorage = gameOne.getWheatInStorage();
        System.out.println("Wheat In Storage = " + gameOneWheatInStorage);
        int gameOneCurrentYear = gameOne.getCurrentYear();
        System.out.println("Current Year = " + gameOneCurrentYear);
        System.out.println(gameOne.toString());
        
        System.out.println(storehouseOne.toString());
        
        //test the enum
        String authorOneTitle = Author.Alonso.getTitle();
        String authorOneName = Author.Alonso.getName();
        System.out.println("Author One = " + authorOneTitle + " " + authorOneName);
        String authorTwoTitle = Author.Lehi.getTitle();
        String authorTwoName = Author.Lehi.getName();
        System.out.println("Author Two = " + authorTwoTitle + " " + authorTwoName);
        String authorThreeTitle = Author.Salvador.getTitle();
        String authorThreeName = Author.Salvador.getName();
        System.out.println("Author Three = " + authorThreeTitle + " " + authorThreeName);
        
        
        //// Lehi Lopez - L4 Individual assignment tests
        
        //create objects
        Map mapOne = new Map();
        Location locationOne = new Location();
                
        String[] gameTipsOne = new String[2];
        Location[][] locationsOne = new Location[5][5];
                
        //call setter functions
        
        locationOne.setName("Temple");
        locationOne.setDescription("Place to whorship God");
        locationOne.setMapSymbol("T");
        locationOne.setGameTips(gameTipsOne);
        mapOne.setLocations(locationsOne);
        
        //call getter functions and print to screen
        String locationOneName = locationOne.getName();
        System.out.println("Location One Name = " + locationOneName);
        String locationOneDescription = locationOne.getDescription();
        System.out.println("Location One Description = " + locationOneDescription);
        String locationOneMapSymbol = locationOne.getMapSymbol();
        System.out.println("Location One Map Symbol = " + locationOneMapSymbol);
              
        System.out.println(locationOne.toString());
        System.out.println(mapOne.toString());
        
        //End Lehi Lopez L4 Individual Assignment
        
        //// ALonso Bernaldo - L4 Individual assignment tests
        
        //create objects
        Point pointOne = new Point();
        InventoryItem inventoryItemOne = new InventoryItem();
        
        ItemType itemTypeOne = null;
        Condition conditionOne = null;
        
        //call setter functions
        
        pointOne.setRow(2);
        pointOne.setColumn(3);
        inventoryItemOne.setItemType(itemTypeOne);
        inventoryItemOne.setQuantity(10);
        inventoryItemOne.setCondition(conditionOne);
        
        //call getter functions and print to screen
                      
        System.out.println(pointOne.toString());
        System.out.println(inventoryItemOne.toString());
        
        //End Alonso Bernaldo L4 Individual Assignment
        
        
         //// Salvador Rubio - L4 Individual assignment tests
        
        //create objects
        Animal animalOne = new Animal();
        Provision provisionOne = new Provision();
        
        
        
        //call setter functions
        
        animalOne.setName("Cow");
        animalOne.setAge(13);
        provisionOne.setName("wheat");
        provisionOne.setPerishable(true);
        
        
        //call getter functions and print to screen
                      
        System.out.println(animalOne.toString());
        System.out.println(provisionOne.toString());
        
        //End Salvador Rubio L4 Individual Assignment
       
    }
    
}
