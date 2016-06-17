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
public class MainMenuView extends View{
    
    public MainMenuView(){
        super("\n"
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
                  + "\n------------------------------");
    }
    
    private String promptMessage = "Where should we start?";
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // create and start a new game
                this.resumeGame();
                break; 
            case "G": // get and start existing game
                this.gameplayMenu();
                break;
            case "H": //Display help menu
                this.displayHelpMenu();
                break;
            case "B": //Display help menu
                this.displayBribeHelp();
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
        gameMenu.display();
    }
    private void resumeGame() {
        System.out.println("*** resumeGame function called ***");
    }
    private void gameplayMenu() {
        System.out.println("*** gameplayMenu function called ***");
    }
    private void displayBribeHelp() {
        System.out.println("*** displayBribeHelp function called ***");
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    /*
    private String menu = "\n"
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
    */
    /*
    public void displayMainMenuView() {
        boolean done = false;
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; //  exit the game
            
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
    
    */ 
    
}
