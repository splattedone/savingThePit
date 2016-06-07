    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.GameControl;
import cit260.savingThePit.model.Player;
import java.util.Scanner;

/**
 *
 * @author bethanyellis
 */
public class StartProgramView {
    
    private String promptMessage;
   
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println(
                "\n********************************************"
               +"\n*                                          *"
               +"\n* This is the game of Saving The Pit       *"
               +"\n* In this game you will help Leslie defeat *"
               +"\n* the evil councilman Jamm.                *"
               +"\n*                                          *"
               +"\n* To do this, you will travel all over the *"
               +"\n* city hall and work with various people   *"
               +"\n* who will help you thwart Jamm's plan     *"
               +"\n* You will travel to each lovation to find *"
               +"\n* different characters who will require    *"
               +"\n* you to do something to acquire something *"
               +"\n* or get information to prove their mettle *"
               +"\n* The more ridiculous the task, the better *"
               +"\n*                                          *"
               +"\n* In the end, you will have gathered all   *" 
               +"\n* you need to beat councilman Jamm and     *"
               +"\n* receive a reward fitting for a goverment *"
               +"\n* employee.  Good luck!                    *"
               +"\n*                                          *"
               +"\n********************************************"
        );
    }

    public void displayStartProgramView() {
           
        boolean done =  false;  // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
         
           } while (!done);
        
        }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks 
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
    }
   
    return value; // return the value entered
}
    private boolean doAction(String playersName) {
        
        if (playersName.length() <2) {
            System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
    }
    
    // call createPlayer() control function
    Player player = GameControl.createPlayer(playersName);
    
    if (player == null) { //if unsuccessful
        System.out.println("\nError creating the player.");
        return false;
    }
    
    // display next view
    this.displayNextView(player);
    
    return true; // success !
    }   

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n======================================"
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you are able to defeat the evil Councilman Jamm!"
                          + "\n====================================="
                          );   
        
        // create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}
