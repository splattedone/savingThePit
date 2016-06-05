/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

/**
 *
 * @author bethanyellis
 */
public class MainMenuView {
    
    private String menu;

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
        System.out.println("\n*** getMenuOption() function called ***");
        return "N";
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
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
        }
        
        return false;
    }
    
    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
}
