package cit260.savingThePit.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Appel
 */
public class Location implements Serializable{
    private String locationName;
    private String locationScene;
    private String locationCharacters;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationScene() {
        return locationScene;
    }

    public void setLocationScene(String locationScene) {
        this.locationScene = locationScene;
    }

    public String getLocationCharacters() {
        return locationCharacters;
    }

    public void setLocationCharacters(String locationCharacters) {
        this.locationCharacters = locationCharacters;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.locationName);
        hash = 53 * hash + Objects.hashCode(this.locationScene);
        hash = 53 * hash + Objects.hashCode(this.locationCharacters);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "locationName=" + locationName + ", locationScene=" + locationScene + ", locationCharacters=" + locationCharacters + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        if (!Objects.equals(this.locationScene, other.locationScene)) {
            return false;
        }
        if (!Objects.equals(this.locationCharacters, other.locationCharacters)) {
            return false;
        }
        return true;
    }

    

}
