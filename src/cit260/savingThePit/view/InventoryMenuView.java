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
public class InventoryMenuView extends View{
    
    private String menu;
    private String promptMessage = "Let's take a look at your stash ";
    private Object savingThePit;

    public InventoryMenuView() {
        super("\n"
                  + "\n------------------------------"
                  + "\n| Inventory Menu                  |"
                  + "\n------------------------------"
                  + "\nA - April's Item "
                  + "\nD - Donna's Item"
                  + "\nR - Ron's Item"
                  + "\nG - Gary's Item"
                  + "\nT - Tom's Item"
                  + "\nE - Ethel's Item"
                  + "\nJ - Jamm's Item"
                  + "\nN - Anne's Item"
                  + "\nQ - Quit"
                  + "\n------------------------------");
    }
  
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        
        switch (value) {
            case "A": //Display gameplay basics
                System.out.println("\nHere is bushell of rotting tomatoes");
                break;
            case "D": //Display navigation help
                System.out.println("\nHere is a new iPhone");
                break;
            case "R": //Display item help
                System.out.println("\nHere is a side of Bacon");
                break;
            case "G": //Display bribe help
                System.out.println("\nHere is a half eaten burrito");
                break;  
            case "T": //Display bribe help
                System.out.println("\nHere is some Snake Juice");
                break; 
            case "J": //Display bribe help
                System.out.println("\nHere is a petition");
                break; 
            case "N": //Display bribe help
                System.out.println("\nHere is a keyring full of keys");
                break; 
            case "E": //Display bribe help
                System.out.println("\nHere is An Old Boyfriend's Phone Number");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

}