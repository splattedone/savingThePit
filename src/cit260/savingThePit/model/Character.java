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
 * @author bethanyellis
 */
public enum Character implements Serializable{
     
    April("Ron's assistant- don't look her in the eye!"),
    Andy("Office Idiot.  Does he even work here?"),
    Tom("Club owner, Business owner, restaurant owner."),
    Ron("He likes steak, wood working, and fire arms"),
    Ann("Leslie's best friend."),
    Garry("Who's Larry?"),
    Ethel(""),
    Jamm("Evil Councilman who is always trying to mess with our plans!"),
    Donna("");
    
    // class instance variables
    private final String items;
    private final String location;

    public Character() {
    }
    Character(String items){
        this.items = items;
        location = new Location();
}
    

    public String getItems() {
        return items;
    }

   

    public String getLocation() {
        return location;
    }


    
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", items=" + items + ", location=" + location + '}';
    }

   
    
    
}
