/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.control;

import cit260.savingThePit.model.Player;
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
    
}
