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
                this.startSavedGame();
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
                ErrorView.display("MainMenuView", "*** Invalid Selection *** Try again!");
                break;
        }
        
        return false;
    }
    
    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(SavingThePit.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void startSavedGame() {
        this.console.println("\n\nEnter the fule path for file where the game "
                            + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void gameplayMenu() {
        System.out.println("*** gameplayMenu function called ***");
    }
    private void displayBribeHelp() {
        System.out.println("*** displayBribeHelp function called ***");
    }
    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            +"is to be saved");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(SavingThePit.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("mainMenuView", ex.getMessage());
        }
    }
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
