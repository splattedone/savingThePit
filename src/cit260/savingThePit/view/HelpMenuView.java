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
public class HelpMenuView extends View {
    
    private String menu;
    private String promptMessage = "Where should we start?";
    private Object savingThePit;

    public HelpMenuView() {
        super("\n"
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
                  + "\n------------------------------");
    }
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        
        switch (value) {
            case "P": //Display gameplay basics
                System.out.println("\nGameplay Help:"
                                 + "\nGameplay here is simple."
                                +"\nYour goal as a public servant is to "
                                +"\nsave the pit from Councilman Jamm."
                                +"\nYou'll need the help of the Parks and "
                                +"\nRecreation department though. They're "
                                +"\nall a little strange (what did you expect "
                                +"\nfrom government workers?) so you'll probably "
                                +"\nhave to bribe them or submit to their silly "
                                +"\nrequests. If you do, each one of them will "
                                +"\ncontribute something useful in your fight "
                                +"\nagainst the total jerk/twerp we all know "
                                +"\nas Councilman Jamm. Defeat his measure to "
                                +"\n build a PonchBurger in the pit and you'll "
                                +"\nrecieve the reward fitting of a public servant"
                                +"\nof your caliber.");
                break;
            case "N": //Display navigation help
                System.out.println("\nNavigation Help:"
                                    +"\nIf you're reading this, you're probably a "
                                    +"\ncollege student in a 300 level class. Don't"
                                    +"\n be silly - you just find the option you want"
                                    +"\nand type the corresponding character. It's so "
                                    +"\neasy, you had to do it a couple of times to get "
                                    +"\nhere, so if you're still confused about it I'm "
                                    +"\nnot sure there's much help for you. Have you "
                                    +"\nconsidered a career in local government?");
                break;
            case "I": //Display item help
                System.out.println("\nItem Help:"
                                    +"\nAs you stroll around City Hall you'll see"
                                    +"\nitems laying around. PICK THEM UP! You never"
                                    +"\n know when you'll need to bribe someone with "
                                    +"\na bushell of rotten tomatoes.");
                break;
            case "B": //Display bribe help
                System.out.println("\nBribe Help:"
                                    +"\nWhat would happen on an average day in "
                                    +"\nCity Hall without any bribes? Once you've"
                                    +"\ncollected items around City Hall, use "
                                    +"\nthem to convince your friends to do your"
                                    +"\nbidding. It's not really as evil as it "
                                    +"\nsounds, unless you're Councilman Jamm - "
                                    +"\nthat guy is just a jerk all around.");
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
