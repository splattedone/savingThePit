/*
 *
 */
package savingthepit;

import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.Player;

/**
 *
 * @author M@ Appel and Bethany Ellis
 */
public class SavingThePit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Player playerOne = new Player();   
     
     playerOne.setName("Leslie");
     playerOne.setBestScore(7.00);
     
     String playerInfo = playerOne.toString();
     System.out.println(playerInfo);
     
     Game gameSaveOne = new Game();
     
     gameSaveOne.setGameName("MattsGame");
     gameSaveOne.setResumeGame("Save1");
     
     String gameInfo = gameSaveOne.toString();
     System.out.println(gameInfo);
    }
    
}
