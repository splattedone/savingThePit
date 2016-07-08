/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.control;

import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.InventoryItem;
import cit260.savingThePit.model.Map;
import cit260.savingThePit.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import savingthepit.SavingThePit;

/**
 *
 * @author Appel
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player ();
        player.setName(playersName);
        
        SavingThePit.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        SavingThePit.setCurrentGame(game); // save in SavingThePit
        
        game.setPlayer(player); // save player in game
        
        //create the inventory list and save in the game
        InventoryItem[] inventoryList = InventoryControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map);
        
        // move actors to starting position in the map
        MapControl.movePlayerToStartingLocation(map);
        
    }
    
    public static InventoryItem[] createInventoryList(){
        System.out.println("*** called createInventoryList() in GameContol ***");
        return null;
    }
    
    public static void saveGame(Game game, String filepath) throws GameControlException {
        try ( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame( String filepath) throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        
        SavingThePit.setCurrentGame(game); // save in SavingThePit
    }
}
