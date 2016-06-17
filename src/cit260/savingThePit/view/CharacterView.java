/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.InventoryControl;
import cit260.savingThePit.control.UtilitiesControl;
import java.util.Scanner;

/**
 *
 * @author Appel
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * This was Matt trying to work ahead and failing miserably.
 * 
 * Don't grade this yet.
 * 
 * 
 * 
 * 
 * 
 * 
 * Please....
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class CharacterView {
    private String howHard;
    private String actionMenu = "\nM - Make a funny face." 
                                +"\nW - Walk Away" 
                                +"\nB - Bribe"
                                +"\nQ - Quit";
    int howFar, angle, hard;
    String choice; 
    private String promptMessage;
    
    private void aprilView(){
        //Set the Scene
        System.out.println("\nYou walk up to April’s desk to see a note:"
            +"\n"
            +"\n\'Not having a good day. On the roof throwing rocks at pigeons."
            +"\nApril'"
            +"\n"
            +"\nAfter climbing a ladder (which you shouldn’t have done in your skirt) you make your way to the roof only to "
            +"\nfind a rather distraught April. I mean, it’s bad. This is distraught even for April. She is indeed throwing rocks "
            +"\nat pigeons, but has apparently run out as you approach."
            +"\n"
            +"\n-April: You’re lucky I’m out of ammo. Go away"
            +"\n"
            +"\nWhat do you do?");
        //Give April Tomatoes
        System.out.println(this.actionMenu);
        String action = this.getActionOption();
        doAction(action);

}
      
private String getActionOption(){
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            
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
            case "B": //call calcTomatoApril()
                if (choice == "B" && InventoryControl.hasTomatoes() == true)
                    howFar = UtilitiesControl.calcTomatoAngleApril(angle, hard);
                else 
                    System.out.println("\nIt doesn't look like I have anything to bribe                                         her with.");
                    break;
             case "M": //Make a funny face
                System.out.println("\nIt doesn't look like that helped");
                break;
            case "W": //Walk Away
                System.out.println("\n Call mapView");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

}