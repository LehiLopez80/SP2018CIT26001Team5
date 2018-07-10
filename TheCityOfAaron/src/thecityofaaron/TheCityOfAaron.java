/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecityofaaron;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.view.StartProgramView;

/**
 *
 * @author Lehi Lopez
 */
public class TheCityOfAaron {
    
    private static Game currentGame = null;
    //private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws GameControlException {
        
        //Catch all unexpcted errors
        try {
            StartProgramView startProgramView = new StartProgramView ();
            startProgramView.displayView();
        
        
            /* Lesson 11 - Team Assignment
            * Code added to prove the calls to control layer funtions that include 
            * error handling which calls are not yet included in any view of the 
            * game program.
            */

            GameControl gameControl = new GameControl();
            System.out.println("\nTests for the calculatePopulation function");

            try {
                GameControl.calculatePopulation(-1,2,1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }

            try {
                GameControl.calculatePopulation(1,-2,1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }

            try {
                GameControl.calculatePopulation(3,2,-1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }

            try {
                GameControl.calculatePopulation(1,2,1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            /* Lesson 11 - Lehi Lopez Individual Assignment
            * Code added to prove the calls to control layer funtions that include 
            * error handling which calls are not yet included in any view of the 
            * game program.
            */
            
            System.out.println("\nTests for the calculateOfferings function");
            
            try {
                GameControl.calculateOfferings(-1, 10);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateOfferings(300, -1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateOfferings(300, 101);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            System.out.println("\nTests for the calculatePeopleMovedToCity function");
            
            try {
                GameControl.calculatePeopleMovedToCity(-1, 5);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculatePeopleMovedToCity(100, -1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculatePeopleMovedToCity(100, 6);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            System.out.println("\nTests for the calculateCropYield function");
            
            try {
                GameControl.calculateCropYield(-1, 5);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateCropYield(10, -1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateCropYield(101, 6);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateCropYield(10, 13);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            System.out.println("\nTests for the calculateAcresPrice function");
            
            try {
                GameControl.calculateAcresPrice(-1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateAcresPrice(12);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }          
        
            /* Lesson 11 - Salvador Rubio Individual Assignment
            * Code added to prove the calls to control layer funtions that include 
            * error handling which calls are not yet included in any view of the 
            * game program.
            */
            
            System.out.println("\nTests for the calculateHarvest function");
            
            try {
                GameControl.calculateHarvest(-1, 20);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateHarvest(50, -1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            
            System.out.println("\nTests for the calculatePeopleStarved function");
            
            try {
                GameControl.calculatePeopleStarved(-1, 20);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculatePeopleStarved(50, -1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            
            System.out.println("\nTests for the calculateBushelsEatenByRats function");
            
            try {
                GameControl.calculateBushelsEatenByRats(-1, 20, 35, 80);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateBushelsEatenByRats(50, -1, 89, 25);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateBushelsEatenByRats(75, 11, -1, 110);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            try {
                GameControl.calculateBushelsEatenByRats(63, 87, 62, -1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }
            
            
             /* Lesson 11 - Alonso Bernaldo Individual Assignment
            * Code added to prove the calls to control layer funtions that include 
            * error handling which calls are not yet included in any view of the 
            * game program.
            */
            
            System.out.println("\nTests for the calculateBushelsToPlant function");
            
            try {
                GameControl.calculateBushelsToPlant(-1);
            } catch (GameControlException gce) {                
                System.out.println(gce.getMessage());                
            }            
                 
                   
        } catch (Throwable te) {
            System.out.println("Error catched at main");
            System.out.println(te.getMessage());
            te.printStackTrace();            
        } finally {
             System.out.println("\nThe program will be closed");
             System.out.close();
        }      
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        TheCityOfAaron.currentGame = currentGame;
    }
}
