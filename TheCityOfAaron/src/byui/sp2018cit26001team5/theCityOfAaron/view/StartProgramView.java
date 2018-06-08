/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

/**
 *
 * @author Salvador Rubio
 */
public class StartProgramView {

    public StartProgramView() {
    }
    
    public void displayStartProgramView(){
        
        System.out.println ("banner page");
        
        MainMenuView mainMenuView = new MainMenuView ();
        mainMenuView.displayMainMenuView();
        
    }
}
