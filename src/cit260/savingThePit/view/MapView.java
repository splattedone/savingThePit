/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.GameControl;
import cit260.savingThePit.control.UtilitiesControl;
import cit260.savingThePit.exceptions.UtilitiesControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import savingthepit.SavingThePit;

/**
 *
 * @author Appel
 */
public class MapView extends View{
    
    private String menu;
    private String promptMessage = "So... who are we going to visit?";
    private Object savingThePit;

    public MapView() {
        super ("\n"
                  + "\n------------------------------"
                  + "\n| Map Menu                  |"
                  + "\n------------------------------"
                  + "\nA - Visit April"
                  + "\nN - Visit Anne Perkins"
                  + "\nR - Visit Ron Swanson"
                  + "\nD - Visit Donna"
                  + "\nG - Visit Gary Gergich"
                  + "\nT - Visit Tom Haverford"
                  + "\nJ - Visit Councilman Jamm"
                  + "\nE - Visit Ethel Beavers"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        
        switch (value) {
            case "A": //Go Visit April
                this.aprilView();
                break;
            case "N": //Go Visit Anne
                System.out.println("\nNavigation Help");
                break;
            case "R": //Go Visit Ron
                System.out.println("\nItem Help:");
                break;
            case "D": //Go Visit Donna
                System.out.println("\nBribe Help:");
                break;  
             case "G": //Go Visit Gary
                System.out.println("\nGameplay Help");
                break;
            case "T": //Go Visit Tom
                System.out.println("\nNavigation Help");   
                break;
            case "J": //Go Visit Jamm
                System.out.println("\nItem Help:");
                break;
            case "E": //Go Visit Ethel
                this.ethelView();
                break;                
            case "S": // Save Game
                this.saveGame();
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }
    public void visitLocation(String loc){
        switch(loc){
            case "ME":
                ethelView();
                break;
            default:
                System.out.println("nothing to do at " + loc);           
        } 
               
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    private void aprilView() {
        System.out.println("*** aprilView method called ***");
    }
    private static void anneView() {
        /*
        // Create a new anneView
        MapViewControl.anneView();
       
        // display the Anne menu
        MapViewControl anneView = new MapViewControl();
        anneView.anneView();
        */
        System.out.println("*** anneView method called ***");
    }
    private void ronView() {
        System.out.println("*** ronView method called ***");
    }
    private void donnaView() {
        System.out.println("*** donnaView method called ***");
    }
    private void garyView() {
        System.out.println("*** garyView method called ***");
    }
    private void tomView() {
        System.out.println("*** tomView method called ***");
    }
    private void jammView() {
        System.out.println("*** jammView method called ***");
    }
    private void ethelView() {
        System.out.println("how big is your hole? Enter the depth of the hole:");
        Scanner in = new Scanner (System.in);
        int depth = in.nextInt();
        System.out.println("how wide is the hole? Enter the radius of the hole:");
        int radius = in.nextInt();
        double vol;
        try {
            vol = UtilitiesControl.calcAmountOfDirtEthel(depth, radius);
            System.out.println("You will need " + vol + " of dirt");
        } catch (UtilitiesControlException ex) {
            System.out.println(ex.toString());
        }
        
    }
       /*
        public void displayMapView() {
        
        boolean done = false;
        do {
            // prompt for and get players name
            String mapOption = this.getMapOption();
            if (mapOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(mapOption);
            
        } while (!done);
    }
        private String getMapOption() {
        
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
