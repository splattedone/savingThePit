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
public class InventoryItem implements Serializable{
    
    // class instance variables
    private String name;
    private String description;

    public InventoryItem() {
    }

    public static InventoryItem[] createInventoryList(){
        InventoryItem[] inventory = new InventoryItem[7];
        
        InventoryItem iphone = new InventoryItem();
        iphone.setDescription("A shiny new iPhone");
        iphone.setQuantityInStock(0);
        iphone.setRequiredAmount(0);
        inventory[0] = iphone;
        
        InventoryItem bacon = new InventoryItem();
        bacon.setDescription("A whole side of bacon. It looks good - for bacon.");
        bacon.setQuantityInStock(0);
        bacon.setRequiredAmount(0);
        inventory[1] = bacon;       
        
        InventoryItem burrito = new InventoryItem();
        burrito.setDescription("Some's nasty half-eaten bean burrito.");
        burrito.setQuantityInStock(0);
        burrito.setRequiredAmount(0);
        inventory[2] = burrito;        
        
        InventoryItem snakeJuice = new InventoryItem();
        snakeJuice.setDescription("A fancy bottle with liquid inside. It smells like gasoline.");
        snakeJuice.setQuantityInStock(0);
        snakeJuice.setRequiredAmount(0);
        inventory[3] = snakeJuice;        
        
        InventoryItem oldNumber = new InventoryItem();
        oldNumber.setDescription("This yellowed slip of paper says 'Eugene 555-0320 XOXO'.");
        oldNumber.setQuantityInStock(0);
        oldNumber.setRequiredAmount(0);
        inventory[4] = oldNumber;        
        
        InventoryItem petition = new InventoryItem();
        petition.setDescription("A fancy looking petition. With enough support, this will stop Jamm!");
        petition.setQuantityInStock(0);
        petition.setRequiredAmount(0);
        inventory[5] = petition;
        
        InventoryItem keys = new InventoryItem();
        keys.setDescription("A whole set of keys. These look familiar.");
        keys.setQuantityInStock(0);
        keys.setRequiredAmount(0);
        inventory[6] = keys;
        
        return inventory;
                
    }
    
    public enum Item {
        tomatoes,
        iphone,
        bacon,
        burrito,
        snakeJuice,
        oldNumber,
        petition,
        keys;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "inventoryitem{" + "name=" + name + ", description=" + description + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
}
