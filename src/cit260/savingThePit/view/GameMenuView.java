/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

import cit260.savingThePit.control.GameControl;
import static cit260.savingThePit.control.GameControl.createNewGame;
import cit260.savingThePit.control.InventoryControl;
import cit260.savingThePit.control.MapControl;
import static cit260.savingThePit.control.MapControl.getPercentage;
import cit260.savingThePit.exceptions.MapControlException;
import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.InventoryItem;
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
                  + "\nM - Display Map"
                  + "\nV - Display Visited"
                  + "\nU - Display Unvisited"
                  + "\nI - View Inventory"
                  + "\nC - Count Inventory"
                  + "\nL - Move to new location"
                  + "\nW - Visit Character"
                  + "\nQ - Quit"
                  + "\n------------------------------");
    }    

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        try {
            switch (value) {
                case "M":
                    this.showMap();
                    System.out.println("\nDisplay Map");
                    break;
                case "V":
                    displayVisited(true);
                    break;
                case "U":
                        displayVisited(false); 
                    break;
                case "I":
                    this.showInventory();
                    break;
                /*case "C":
                    this.countInventory();
                    break;    */
                case "L":
                    this.moveLocation();
                    break; 
                case "X":
                    this.getDoubleNumber();
                    break;
                case "W":
                    this.visitCharacter();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try Again");
                    break;
            }
        }catch (MapControlException me) {
            System.out.println(me.getMessage());
        }   
        return false;
    }

    private void showInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView(); 
        inventoryMenu.display();
    }
    private void moveLocation() {
        this.showMap();
        Game game = SavingThePit.getCurrentGame();
        Map map = game.getMap();
        System.out.println("Enter Row:");
        Scanner in = new Scanner (System.in);
        int row = in.nextInt();
        System.out.println("Enter Column:");
        int column = in.nextInt();
        MapControl.movePlayer(map, row, column);
        if (map.getCurrentLocation().getScene() != null)
            this.visitCharacter(map.getCurrentLocation().getScene().getMapSymbol());
        else
            this.showMap();
    }
    private void visitCharacter(String ch) {
        MapView mapView = new MapView();
        mapView.visitLocation(ch);
    }
    private void visitCharacter() {
        MapView mapView = new MapView();
        mapView.display();
    }
    private void displayVisited(boolean showVisited) throws MapControlException {
        Game game = SavingThePit.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        int visitedCounter = 0;
        int notVisitedCounter = 0;
         for( int row = 0; row < locations.length; row++){
           for( int column = 0; column < locations[row].length; column++){
               if(locations[row][column].isVisited()){
                   visitedCounter++;
               } else {
                   notVisitedCounter++;
               }
           } 
        } 
        double percent = 0;
            
         if (showVisited){
             try {
                percent = getPercentage(visitedCounter, visitedCounter+notVisitedCounter);
                System.out.println("You have visited " + visitedCounter + " which is " 
                        + percent + "%.");
             } catch (MapControlException me) {
                 System.out.println(me.getMessage());
             } 
            }
         else 
             System.out.println("You have not visited " + notVisitedCounter + " which is" + percent + "%.");
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
              for (Location location : locations[row]) {
                  leftIndicator = " ";
                  rightIndicator = " ";
                  if (location == map.getCurrentLocation()) {
                      leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                      rightIndicator = "*"; // same as above
                  } else if (location.isVisited()) {
                      leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                      rightIndicator = "<"; // same as above
                  }
                  System.out.print("|"); // start map with a |
                  if (location.getScene() == null) {
                      System.out.print(leftIndicator + "??" + rightIndicator);
                  } else {
                      System.out.print(leftIndicator + location.getScene().getMapSymbol() + rightIndicator);
                  }
              }
            System.out.println("|");
          }
        }catch (Exception e) {
          System.out.println("Error");
        }
            System.out.println("Your current location is " + map.getCurrentLocation().getScene().getDescription());
  }
    
    public double getDoubleNumber() {
        Double number = null;
        while (number == null){
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            try {
            number = Double.parseDouble(value);
            } catch (NumberFormatException nf){
                System.out.println("You need a valid number.");
            }
        }   
        return number;
    }
   /*
  public void countInventory(){
      InventoryItem[] inventory = Game.getInventory();
      InventoryControl.countInventory(inventory);
  }
    */

}
