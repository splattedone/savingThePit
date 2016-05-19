/*
 *
 */
package savingthepit;

import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.InventoryItem;
import cit260.savingThePit.model.Location;
import cit260.savingThePit.model.Map;
import cit260.savingThePit.model.Player;
import java.util.HashSet;

/**
 *
 * @author M@ Appel and Bethany Ellis
 */
public class SavingThePit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    // Player Test
            Player playerOne = new Player();   

            playerOne.setName("Leslie");
            playerOne.setBestScore(7.00);

            String playerInfo = playerOne.toString();
            System.out.println(playerInfo);
    
    // Game Test
            Game gameSaveOne = new Game();

            gameSaveOne.setMap("MattsGame");
            gameSaveOne.setPlayer("Leslie");

            String gameInfo = gameSaveOne.toString();
            System.out.println(gameInfo);
     
    // Location Test 
            // Note 1: I realized I had planned to name locations after characters, so to keep things simple I plan to just specify for each object. We'll have locationAnne and characterAnne, and the respective format for the other characters and locations. 

            // Note 2: We'll have to come back later to change these values to the character objects once they've been created. I tried to code them now to character Anne and characterAndy but it raised an error.

            Location locationAnne = new Location();

            locationAnne.setLocationName("Anne in the Courtyard");
            locationAnne.setLocationScene("Scene1");
            locationAnne.setLocationCharacters("Anne");

            String locationInfo = locationAnne.toString();
            System.out.println(locationInfo);
            
    // Map Test
            Map mainMap = new Map();
            
            mainMap.setLocations("Anne");
            
            String mapInfo = mainMap.toString();
            System.out.println(mapInfo);
    
    // Inventory Item Test
            InventoryItem itemTest = new InventoryItem();
            
            itemTest.setName ("Item1");
            itemTest.setDescription ("description");
            
            String inventoryInfo = itemTest.toString();
            System.out.println(inventoryInfo);
          
                   /*
                   *[class name] [variableName] = new "className"()
                   *
                   *[variableName].value1("value")
                   *[variableName].value2("value")
                   *
                   * [variable type] [variableName] = [variableName].toString();
                   * System.out.println([variableName]);
                   */
    }
    
}
