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
public class MainMenuView {
    
    private String menu;
    private String promptMessage = "Where should we start?";

    public MainMenuView() {
        this.menu = "\n"
                  + "\n------------------------------"
                  + "\n| Main Menu                  |"
                  + "\n------------------------------"
                  + "\nN - Start new game"
                  + "\nR - Resume a Game"
                  + "\nG - Show Me the Game Play Menu"
                  + "\nH - Show Me the Help Menu"
                  + "\nB - Tell Me About Bribes"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n------------------------------";
    }
    
    public void displayMainMenuView() {
        
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start existing game
                this.startExistingGame();
                break;
            case "H": //Display help menu
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }
    
    private void startNewGame() {
        //System.out.println("*** startNewGame function called ***");
        
        // Create a new game
        GameControl.createNewGame(SavingThePit.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    private boolean displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        System.out.println(helpMenu);
        return false;
    }
    
}
