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
public class HelpMenuView {
    
    private String menu;
    private String promptMessage = "Where should we start?";
    private Object savingThePit;

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n------------------------------"
                  + "\n| Help Menu                  |"
                  + "\n------------------------------"
                  + "\nP - Playing the Game"
                  + "\nN - Navigating the Game"
                  + "\nI - How Do Items Work?"
                  + "\nB - How Do Bribes Work?"
                  + "\nM - Return to Main Menu"
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
            case "P": //Display gameplay basics
                System.out.println("\nGameplay Help:"
                                 + "\nGameplay here is simple. Your goal as a public servant is to save the pit from Councilman Jamm. You'll need the help of the Parks and Recreation department though. They're all a little strange (what did you expect from government workers?) so you'll probably have to bribe them or submit to their silly requests. If you do, each one of them will contribute something useful in your fight against the total jerk/twerp we all know as Councilman Jamm. Defeat his measure to build a PonchBurger in the pit and you'll recieve the reward fitting of a public servant of your caliber.");
                break;
            case "N": //Display navigation help
                System.out.println("\nNavigation Help:"
                                    +"\nIf you're reading this, you're probably a college student in a 300 level class. Don't be silly - you just find the option you want and type the corresponding character. It's so easy, you had to do it a couple of times to get here, so if you're still confused about it I'm not sure there's much help for you. Have you considered a career in local government?");
                break;
            case "I": //Display item help
                System.out.println("\nItem Help:"
                                    +"\nAs you stroll around City Hall you'll see items laying around. PICK THEM UP! You never know when you'll need to bribe someone with a bushell of rotten tomatoes. ");
                break;
            case "B": //Display bribe help
                System.out.println("\nBribe Help:"
                                    +"\nWhat would happen on an average day in city hall without any bribes? Once you've collected items around City Hall, use them to convince your friends to do your bidding. It's not really as evil as it sounds, unless you're Councilman Jamm - that guy is just a jerk all around.");
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
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
}
