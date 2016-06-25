package cit260.savingThePit.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Appel
 */
public class Map implements Serializable{
    private String location;
    
    private static Map createMap() {
        Map map = new Map();
        
        Scene[] scenes = createScenes();
        
        return map;
    }
    
    
    // We need to write our scenes still!
    private static Scene[] createScenes() {
        
        Scene [] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("lorem");
        startingScene.setMapSymbol("startingScene");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene april1 = new Scene();
        april1.setDescription("lorem");
        april1.setMapSymbol("april1");
        april1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = april1;
        
        Scene april2 = new Scene();
        april2.setDescription("lorem");
        april2.setMapSymbol("april2");
        april2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = april2;
        
        Scene april3 = new Scene();
        april3.setDescription("lorem");
        april3.setMapSymbol("april3");
        april3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = april3;
        
        Scene donna1 = new Scene();
        donna1.setDescription("lorem");
        donna1.setMapSymbol("donna1");
        donna1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = donna1;
        
        Scene donna2 = new Scene();
        donna2.setDescription("lorem");
        donna2.setMapSymbol("donna2");
        donna2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = donna2;
        
        Scene donna3 = new Scene();
        donna3.setDescription("lorem");
        donna3.setMapSymbol("donna3");
        donna3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = donna3;
        
        Scene ron1 = new Scene();
        ron1.setDescription("lorem");
        ron1.setMapSymbol("ron1");
        ron1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = ron1;
        
        Scene ron2 = new Scene();
        ron2.setDescription("lorem");
        ron2.setMapSymbol("ron2");
        ron2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = ron2;
        
        Scene ron3 = new Scene();
        ron3.setDescription("lorem");
        ron3.setMapSymbol("ron3");
        ron3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = ron3;
        
        Scene garry1 = new Scene();
        garry1.setDescription("lorem");
        garry1.setMapSymbol("garry1");
        garry1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = garry1;
        
        Scene garry2 = new Scene();
        garry2.setDescription("lorem");
        garry2.setMapSymbol("garry2");
        garry2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = garry2;
        
        Scene garry3 = new Scene();
        garry3.setDescription("lorem");
        garry3.setMapSymbol("garry3");
        garry3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = garry3;
        
        Scene tom1 = new Scene();
        tom1.setDescription("lorem");
        tom1.setMapSymbol("tom1");
        tom1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = tom1;
        
        Scene tom2 = new Scene();
        tom2.setDescription("lorem");
        tom2.setMapSymbol("tom2");
        tom2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = tom2;
        
        Scene tom3 = new Scene();
        tom3.setDescription("lorem");
        tom3.setMapSymbol("tom3");
        tom3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = tom3;
        
        Scene ethel1 = new Scene();
        ethel1.setDescription("lorem");
        ethel1.setMapSymbol("ethel1");
        ethel1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = ethel1;
        
        Scene ethel2 = new Scene();
        ethel2.setDescription("lorem");
        ethel2.setMapSymbol("ethel2");
        ethel2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = ethel2;
        
        Scene ethel3 = new Scene();
        ethel3.setDescription("lorem");
        ethel3.setMapSymbol("ethel3");
        ethel3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = ethel3;
        
        Scene jamm1 = new Scene();
        jamm1.setDescription("lorem");
        jamm1.setMapSymbol("jamm1");
        jamm1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = jamm1;
        
        Scene jamm2 = new Scene();
        jamm2.setDescription("lorem");
        jamm2.setMapSymbol("jamm2");
        jamm2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = jamm2;
        
        Scene jamm3 = new Scene();
        jamm3.setDescription("lorem");
        jamm3.setMapSymbol("jamm3");
        jamm3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = jamm3;
        
        Scene anne1 = new Scene();
        anne1.setDescription("lorem");
        anne1.setMapSymbol("anne1");
        anne1.setBlocked(false);
        scenes[SceneType.start.ordinal()] = anne1;
        
        Scene anne2 = new Scene();
        anne2.setDescription("lorem");
        anne2.setMapSymbol("anne2");
        anne2.setBlocked(false);
        scenes[SceneType.start.ordinal()] = anne2;
        
        Scene anne3 = new Scene();
        anne3.setDescription("lorem");
        anne3.setMapSymbol("anne3");
        anne3.setBlocked(false);
        scenes[SceneType.start.ordinal()] = anne3;      
        
        return scenes;
    }
    
    public enum SceneType {
        openingscene,
        april1,
        april2,
        april3,
        donna1,
        donna2,
        donna3,
        ron1,
        ron2,
        ron3,
        garry1,
        garry2,
        garry3,
        tom1,
        tom2,
        tom3,
        ethel1,
        ethel2,
        ethel3,
        jamm1,
        jamm2,
        jamm3,
        anne1,
        anne2,
        anne3;
        
    }
    
    private static void assignScenesToLocations (Map map, Scene[] scenes) {
        Location [] locations = map.getLocations();
        
        locations[1].setScene(scenes[SceneType.april1.ordinal()]);
        locations[2].setScene(scenes[SceneType.april2.ordinal()]);
        locations[3].setScene(scenes[SceneType.april3.ordinal()]);
        locations[4].setScene(scenes[SceneType.donna1.ordinal()]);
        locations[5].setScene(scenes[SceneType.donna2.ordinal()]);
        locations[6].setScene(scenes[SceneType.donna3.ordinal()]);
        locations[7].setScene(scenes[SceneType.ron1.ordinal()]);
        locations[8].setScene(scenes[SceneType.ron2.ordinal()]);
        locations[9].setScene(scenes[SceneType.ron3.ordinal()]);
        locations[10].setScene(scenes[SceneType.garry1.ordinal()]);
        locations[11].setScene(scenes[SceneType.garry2.ordinal()]);
        locations[12].setScene(scenes[SceneType.garry3.ordinal()]);
        locations[13].setScene(scenes[SceneType.tom1.ordinal()]);
        locations[14].setScene(scenes[SceneType.tom2.ordinal()]);
        locations[15].setScene(scenes[SceneType.tom3.ordinal()]);
        locations[16].setScene(scenes[SceneType.ethel1.ordinal()]);
        locations[17].setScene(scenes[SceneType.ethel2.ordinal()]);
        locations[18].setScene(scenes[SceneType.ethel3.ordinal()]);
        locations[19].setScene(scenes[SceneType.jamm1.ordinal()]);
        locations[20].setScene(scenes[SceneType.jamm2.ordinal()]);
        locations[21].setScene(scenes[SceneType.jamm3.ordinal()]);
        locations[22].setScene(scenes[SceneType.anne1.ordinal()]);
        locations[23].setScene(scenes[SceneType.anne2.ordinal()]);
        locations[24].setScene(scenes[SceneType.anne3.ordinal()]);
        locations[25].setScene(scenes[SceneType.openingscene.ordinal()]);
        
    }
    
    private void viewInventory(){
        StringBuilder line;
        
        Game game = savingThePit.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n List of Invtory Items");
        line = new StringBuilder("                        ");
        line.insert(0, "Description");
        line.insert(20, "Required");
        line.insert(30, "In Stock");
        System.out.println(line.toString());
        
       for (InventoryItem item : inventory) {
           line = new StringBuilder("                              ");
           line.insert(0, item.getDescription());
           line.insert(23, item.getRequiredAmount());
           line.insert(33, item.getQuantityInStock());
           
           // Display the line
           System.out.println(line.toString());
       }
        
    }
    
    
    
    public String getLocations() {
        return location;
    }

    public void setLocations(String locations) {
        this.location = locations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + location + '}';
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
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    
    }
