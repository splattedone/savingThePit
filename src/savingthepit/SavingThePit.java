/*
 *
 */
package savingthepit;

import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.InventoryItem;
import cit260.savingThePit.model.Item;
import cit260.savingThePit.model.Location;
import cit260.savingThePit.model.Map;
import cit260.savingThePit.model.Player;
import cit260.savingThePit.view.StartProgramView;
import java.util.HashSet;

/**
 *
 * @author M@ Appel and Bethany Ellis
 */
public class SavingThePit {
  
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SavingThePit.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SavingThePit.player = player;
    }
   
    public static void main(String[] args) {
       
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.displayStartProgramView();
        } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
   
    }
    
}
