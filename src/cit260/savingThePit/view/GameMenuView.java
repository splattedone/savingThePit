/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.GameControl;
import static cit260.savingThePit.control.GameControl.createNewGame;
import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.Location;
import cit260.savingThePit.model.Map;
import cit260.savingThePit.model.Player;
import java.util.Scanner;
import savingthepit.SavingThePit;
import static sun.audio.AudioPlayer.player;

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
        String leftIndicator;
        String rightIndicator;

        Game game = SavingThePit.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        try { 
          System.out.print("  |");
          for( int column = 0; column < locations[0].length; column++){
            System.out.print("  " + column + " |"); // print col numbers to side of map
          }
          System.out.println();
          for( int row = 0; row < locations.length; row++){
            System.out.print(row + " "); // print row numbers to side of map
            for( int column = 0; column < locations[row].length; column++){
              leftIndicator = " ";
              rightIndicator = " ";
              if(locations[row][column] == map.getCurrentLocation()){
                leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                rightIndicator = "*"; // same as above
              } 
              else if(locations[row][column].isVisited()){
                 leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                 rightIndicator = "<"; // same as above
              }
              System.out.print("|"); // start map with a |
              if(locations[row][column].getScene() == null)
                System.out.print(leftIndicator + "??" + rightIndicator);
              else
                System.out.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
            }
            System.out.println("|");
          }
        }catch (Exception e) {
          System.out.println("Error");
        }
            System.out.println("Your current location is " + map.getCurrentLocation().getScene().getDescription());
  }
    
}
