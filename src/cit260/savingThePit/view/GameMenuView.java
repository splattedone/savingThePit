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
            case "M":
                this.showMap();
                System.out.println("\nDisplay Map");
                break;
            case "I":
                this.showInventory();
                break;
            case "L":
                this.showInventory();
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
        GameControl gameControl = new GameControl.createNewGame(Player player);
        StartProgramView startProgramView = new StartProgramView();
    }
    
}
