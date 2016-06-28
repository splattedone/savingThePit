package cit260.savingThePit.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Appel
 */
public class Map implements Serializable{
    private Location[][] locations;
    private Location currentLocation;
    private int currentRow;
    private int currentColumn;
    private int rowCount;
    private int columnCount;
    
    
    public Map (){
        
    }
    
    public Map (int rowCount, int columnCount) {
      if(rowCount <1 || columnCount<1)
          return;
      this.rowCount = rowCount;
      this.columnCount = columnCount;    
      
      this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                this.locations[row][column] = location;
            }
        }
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Arrays.deepHashCode(this.locations);
        hash = 17 * hash + Objects.hashCode(this.currentLocation);
        hash = 17 * hash + this.currentRow;
        hash = 17 * hash + this.currentColumn;
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", currentLocation=" + currentLocation + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }


    }
