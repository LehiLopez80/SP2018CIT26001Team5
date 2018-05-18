/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecityofaaron;

import byui.sp2018cit26001team5.theCityOfAaron.model.Author;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.model.Player;
import byui.sp2018cit26001team5.theCityOfAaron.model.Storehouse;
import java.util.ArrayList;

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
        ArrayList<Game> games = new ArrayList<Game>();
        Storehouse storehouseOne = new Storehouse();
        
        //call setter functions
        
        playerOne.setName("Alonso");
        playerOne.setGames(games);
             
        gameOne.setCurrentPopulation(100);
        gameOne.setAcresOwned(1000);
        gameOne.setWheatInStorage(3000);
        gameOne.setCurrentYear(1);
        gameOne.setPlayer(playerOne);
        gameOne.setStorehouse(storehouseOne);
        
        Game gameTwo = new Game();
        storehouseOne.setGame(gameTwo);
        
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
        
    }
    
}
