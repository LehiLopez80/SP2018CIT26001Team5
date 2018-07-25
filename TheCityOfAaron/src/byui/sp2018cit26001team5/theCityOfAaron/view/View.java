/*
 * This class defines the interface that is common to all views.    
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

/**
 * @author Lehi Lopez
 */
public interface View {
    
    public void displayView();
    
    public String getInput();
    
    public boolean doAction(String input);    
}
