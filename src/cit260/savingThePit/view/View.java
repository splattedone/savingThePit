/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import savingthepit.SavingThePit;

/**
 *
 * @author Appel
 */
public abstract class View implements ViewInterface{
    /*Inherits the following functions from ViewInterface:
        public void display();
        public String getInput();
        public boolean doAction(String value);
    */
    protected String message;
    
    protected final BufferedReader keyboard = SavingThePit.getInFile();
    protected final PrintWriter console = SavingThePit.getOutFile();
       
    public View(String message){
        this.message = message;
    }
    
    @Override
    public void display() {
        String value;
        boolean done = false;
        
        do {
            this.console.println(this.message);
            value = this.getInput();
            done = this.doAction(value);
            /*String value = this.getInput(); // prompt for and get players name
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            */
            
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false; // initialize to not valid
        String value = null;
        try {
            while (!valid) { // loop while an invalid value is entered

                // prompt for the player's name
                System.out.println("\n" + this.message);

                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks 

                if (value.length() < 1) { // value is blank
                    System.out.println("\nInvalid value: value can not be blank");
                    continue;
                }
                break; // end the loop
            }
        } catch (Exception e){
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value; // return the name
    }  
    
}
