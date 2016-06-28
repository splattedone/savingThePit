package cit260.savingThePit.model;

import java.io.Serializable;
import java.util.ArrayList;
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
    private int row;
    private int column;

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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.locationName);
        hash = 11 * hash + Objects.hashCode(this.locationScene);
        hash = 11 * hash + Objects.hashCode(this.locationCharacters);
        hash = 11 * hash + (this.visited ? 1 : 0);
        hash = 11 * hash + Objects.hashCode(this.scene);
        return hash;
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
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "locationName=" + locationName + ", locationScene=" + locationScene + ", locationCharacters=" + locationCharacters + ", visited=" + visited + ", scene=" + scene + '}';
    }

    
    

}
