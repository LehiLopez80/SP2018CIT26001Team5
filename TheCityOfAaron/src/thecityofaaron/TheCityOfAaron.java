/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecityofaaron;

import byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException;
import byui.sp2018cit26001team5.theCityOfAaron.model.Game;
import byui.sp2018cit26001team5.theCityOfAaron.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Lehi Lopez
 */
public class TheCityOfAaron {
    
    private static Game currentGame = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     * @throws byui.sp2018cit26001team5.theCityOfAaron.exceptions.GameControlException
     */
    public static void main(String[] args) throws GameControlException {
        
        //Catch all unexpected errors
        try {            
            //open character stream files for end user input and output
            inFile =  new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");
            
            StartProgramView startProgramView = new StartProgramView ();
            startProgramView.displayView();                        
                   
        } catch (Throwable te) {
            System.out.println("Error catched at main");
            System.out.println(te.getMessage());
            te.printStackTrace();            
        } finally {                
            try {    
                if (TheCityOfAaron.inFile != null)
                    TheCityOfAaron.inFile.close();
                if (TheCityOfAaron.outFile != null)
                    TheCityOfAaron.outFile.close();
                if (logFile != null)
                    logFile.close();
            } catch (IOException ex) {
                System.out.println("\nThe input or output file did not close successfully");
            }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheCityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheCityOfAaron.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logfile) {
        TheCityOfAaron.logFile = logfile;
    }   
}
