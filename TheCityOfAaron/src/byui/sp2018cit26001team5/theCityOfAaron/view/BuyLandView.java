/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import byui.sp2018cit26001team5.theCityOfAaron.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Salvador Rubio
 */
public class BuyLandView {

    public BuyLandView() {
    }
    
    GameControl gameControl = new GameControl();
    
    int randomInt = (int) ((int)11*Math.random());
    int acresPrice = GameControl.calculateAcresPrice (randomInt);
    // System.out.println("The price of the land is: " + acresPrice);
    
    // System.out.println("You must enter a value");
    
}
