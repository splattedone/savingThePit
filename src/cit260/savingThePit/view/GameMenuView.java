/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.GameControl;
import static cit260.savingThePit.control.GameControl.createNewGame;
import cit260.savingThePit.model.Player;
import java.util.Scanner;

/**
 *
 * @author Appel
 */
public class GameMenuView extends View{
    
    private String menu;
    private String promptMessage = "Let's take a look at your stash ";
    private Object savingThePit;

    public GameMenuView() {
        super("\n"
                  + "\n------------------------------"
                  + "\n| Game Menu                  |"
                  + "\n------------------------------"
                  + "\nM - Display Map "
                  + "\nI - View Inventory"
                  + "\nL - Move to new location"
                  + "\nQ - Quit"
                  + "\n------------------------------");
    }    

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        
        switch (value) {
            case "M": //Display gameplay basics
                this.showInventory();
                System.out.println("\nDisplay Map");
                break;
            case "I": //Display navigation help
                System.out.println("\nView Inventory");
                break;
            case "L": //Display item help
                System.out.println("\nMove to New Location");
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void showInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView(); 
        inventoryMenu.display();
    }
    private void showMap() {
        MapView mapMenu = new MapView(); 
        mapMenu.display();
    }
    public void startNewGame(){
        GameControl gameControl = new GameControl.createNewGame(Player);
        StartProgramView startProgramView = new StartProgramView();
    }
    
}
