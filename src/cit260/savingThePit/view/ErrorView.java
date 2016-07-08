/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import java.io.PrintWriter;
import savingthepit.SavingThePit;

/**
 *
 * @author Appel
 */
public class ErrorView {
    private static final PrintWriter errorFile = SavingThePit.getOutFile();
    private static final PrintWriter logFile = SavingThePit.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
          "------------------------------------------------------------"
        + "\n-ERROR - " + errorMessage
        + "\n------------------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
