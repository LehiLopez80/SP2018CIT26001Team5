/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.sp2018cit26001team5.theCityOfAaron.view;

import java.io.PrintWriter;
import thecityofaaron.TheCityOfAaron;

/**
 *
 * @author Lehi Lopez
 */
public class ErrorView {
    private static PrintWriter console = TheCityOfAaron.getOutFile();
    private static PrintWriter log = TheCityOfAaron.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        console.println(
            "\n--- ERROR ----------------------------------------------------"
          + errorMessage
          + "\n--------------------------------------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}
