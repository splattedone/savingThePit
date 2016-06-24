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
    
    // Class instance variables
    
    // We will likely need to change these when we understand better how the save/load commands will work. I'm a little fuzzy on that at this point. MA 5/14/16
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
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.map);
        hash = 59 * hash + Objects.hashCode(this.player);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "map=" + map + ", player=" + player + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }
   
}
