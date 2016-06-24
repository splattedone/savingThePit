/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Appel 
 */
public class Game implements Serializable{
    
    private double totalTime;
    
    private String map;
    private String player;
    private InventoryItem[] inventory; 
        
    public Game() {
    }


    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getPlayer() {
        return player;
    }
 
    public void setPlayer(String player) {
        this.player = player;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public String toString() {
        return "Game{" + "map=" + map + ", player=" + player + '}';
    }

   
}
