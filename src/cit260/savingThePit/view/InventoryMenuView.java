/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.GameControl;
import java.util.Scanner;
import savingthepit.SavingThePit;

/**
 *
 * @author bethanyellis
 */
public class InventoryMenuView {
    
    private String menu;
    private String promptMessage = "Let's take a look at your stash ";
    private Object savingThePit;

    public InventoryMenuView() {
        this.menu = "\n"
                  + "\n------------------------------"
                  + "\n| Inventory Menu                  |"
                  + "\n------------------------------"
                  + "\nA - April's Item "
                  + "\nD - Donna's Item"
                  + "\nR - Ron's Item"
                  + "\nG - Gary's Item"
                  + "\nT - Tom's Item"
                  + "\nE - Ethel's Item"
                  + "\nQ - Quit"
                  + "\n------------------------------";
    }
    
    public void displayInventoryMenuView() {
        
        boolean done = false;
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        //System.out.println("\n*** getMenuOption() function called ***");
        //return "N";
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println(this.menu);
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks 
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        return value;
    }    

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //Convert choice to uppercase
        
        switch (choice) {
            case "A": //Display gameplay basics
                System.out.println("\nHere is some black eye shadow");
                break;
            case "D": //Display navigation help
                System.out.println("\nHere is a new iPhone");
                break;
            case "R": //Display item help
                System.out.println("\nHere is a side of Bacon");
                break;
            case "G": //Display bribe help
                System.out.println("\nHere is a half eaten burrito");
                break;  
            case "T": //Display bribe help
                System.out.println("\nHere is some Snake Juice");
                break; 
            case "E": //Display bribe help
                System.out.println("\nHere is An Old Boyfriend's Phone Number");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }
}
