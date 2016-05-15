package cit260.savingThePit.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Appel
 */
public class Map implements Serializable{
    private String locations;

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.locations);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    
    }
