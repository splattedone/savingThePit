/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import java.util.Scanner;

/**
 *
 * @author Appel
 */
public class GameMenuView {
    
    private String menu;
    private String promptMessage = "Let's take a look at your stash ";
    private Object savingThePit;

    public void GameMenuView() {
        this.menu = "\n"
                  + "\n------------------------------"
                  + "\n| Game Menu                  |"
                  + "\n------------------------------"
                  + "\nM - Display Map "
                  + "\nI - View Inventory"
                  + "\nL - Move to new location"
                  + "\nQ - Quit"
                  + "\n------------------------------";
    }
    
    public void displayGameMenuView() {
        
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
            case "M": //Display gameplay basics
                this.showInventory();
                System.out.println("\nDisplay Map");
                break;
            case "I": //Display navigation help
                System.out.println("\nView Inventory");
                break;
            case "L": //Display item help
                System.out.println("\nMove to New Location");
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void showInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView(); 
        inventoryMenu.displayInventoryMenuView();
    }
    private void showMap() {
        MapView mapMenu = new MapView(); 
        mapMenu.displayMapView();
    }
}
