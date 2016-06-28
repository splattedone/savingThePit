/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.control;

import cit260.savingThePit.model.Location;
import cit260.savingThePit.model.Map;
import cit260.savingThePit.model.Scene;

/**
 *
 * @author Appel
 */
public class MapControl {
    public static Map createMap() {
        // create the map
        Map map = new Map(3, 9);
        
        Scene[] scenes = createScenes();
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
// We need to write our scenes still!
    private static Scene[] createScenes() {
        
        Scene [] scenes = new Scene[SceneType.values().length];
        
        Scene openingScene = new Scene();
        openingScene.setDescription("Front Door");
        openingScene.setMapSymbol("FD");
        scenes[SceneType.openingscene.ordinal()] = openingScene;
        
        Scene april1 = new Scene();
        april1.setDescription("Meet April");
        april1.setMapSymbol("MA");
        scenes[SceneType.april1.ordinal()] = april1;
        
        Scene april2 = new Scene();
        april2.setDescription("Talk April");
        april2.setMapSymbol("TA");
        scenes[SceneType.april2.ordinal()] = april2;
        
        Scene april3 = new Scene();
        april3.setDescription("Help April");
        april3.setMapSymbol("HA");
        scenes[SceneType.april3.ordinal()] = april3;
        
       /* Scene donna1 = new Scene();
        donna1.setDescription("Meet Donna");
        donna1.setMapSymbol("MD");
        scenes[SceneType.start.ordinal()] = donna1;
        
        Scene donna2 = new Scene();
        donna2.setDescription("lorem");
        donna2.setMapSymbol("TD");
        scenes[SceneType.start.ordinal()] = donna2;
        
        Scene donna3 = new Scene();
        donna3.setDescription("lorem");
        donna3.setMapSymbol("HD");
        scenes[SceneType.start.ordinal()] = donna3;
        
        Scene ron1 = new Scene();
        ron1.setDescription("Meet ");
        ron1.setMapSymbol("MR");
        scenes[SceneType.start.ordinal()] = ron1;
        
        Scene ron2 = new Scene();
        ron2.setDescription("lorem");
        ron2.setMapSymbol("TR");
        scenes[SceneType.start.ordinal()] = ron2;
        
        Scene ron3 = new Scene();
        ron3.setDescription("lorem");
        ron3.setMapSymbol("HR");
        scenes[SceneType.start.ordinal()] = ron3;
        
        Scene garry1 = new Scene();
        garry1.setDescription("Meet ");
        garry1.setMapSymbol("MG");
        scenes[SceneType.start.ordinal()] = garry1;
        
        Scene garry2 = new Scene();
        garry2.setDescription("lorem");
        garry2.setMapSymbol("TG");
        scenes[SceneType.start.ordinal()] = garry2;
        
        Scene garry3 = new Scene();
        garry3.setDescription("lorem");
        garry3.setMapSymbol("HG");
        scenes[SceneType.start.ordinal()] = garry3;
        
        Scene tom1 = new Scene();
        tom1.setDescription("Meet ");
        tom1.setMapSymbol("tom1");
        scenes[SceneType.start.ordinal()] = tom1;
        
        Scene tom2 = new Scene();
        tom2.setDescription("lorem");
        tom2.setMapSymbol("tom2");
        scenes[SceneType.start.ordinal()] = tom2;
        
        Scene tom3 = new Scene();
        tom3.setDescription("lorem");
        tom3.setMapSymbol("tom3");
        scenes[SceneType.start.ordinal()] = tom3;
        
        Scene ethel1 = new Scene();
        ethel1.setDescription("Meet ");
        ethel1.setMapSymbol("ethel1");
        scenes[SceneType.start.ordinal()] = ethel1;
        
        Scene ethel2 = new Scene();
        ethel2.setDescription("lorem");
        ethel2.setMapSymbol("ethel2");
        scenes[SceneType.start.ordinal()] = ethel2;
        
        Scene ethel3 = new Scene();
        ethel3.setDescription("lorem");
        ethel3.setMapSymbol("ethel3");
        scenes[SceneType.start.ordinal()] = ethel3;
        
        Scene jamm1 = new Scene();
        jamm1.setDescription("Meet ");
        jamm1.setMapSymbol("jamm1");
        scenes[SceneType.start.ordinal()] = jamm1;
        
        Scene jamm2 = new Scene();
        jamm2.setDescription("lorem");
        jamm2.setMapSymbol("jamm2");
        scenes[SceneType.start.ordinal()] = jamm2;
        
        Scene jamm3 = new Scene();
        jamm3.setDescription("lorem");
        jamm3.setMapSymbol("jamm3");
        scenes[SceneType.start.ordinal()] = jamm3;
        
        Scene anne1 = new Scene();
        anne1.setDescription("Meet ");
        anne1.setMapSymbol("anne1");
        scenes[SceneType.start.ordinal()] = anne1;
        
        Scene anne2 = new Scene();
        anne2.setDescription("lorem");
        anne2.setMapSymbol("anne2");
        scenes[SceneType.start.ordinal()] = anne2;
        
        Scene anne3 = new Scene();
        anne3.setDescription("lorem");
        anne3.setMapSymbol("anne3");
        scenes[SceneType.start.ordinal()] = anne3;      
       */ 
        return scenes;
    }
    
    public static void movePlayerToStartingLocation(Map map) {
        movePlayer(map, 2, 2);
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setCurrentRow(row);
        map.setCurrentColumn(column);
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
    
    public static void assignScenesToLocations (Map map, Scene[] scenes) {
        Location [][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.openingscene.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.april1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.april2.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.april3.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.donna1.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.donna2.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.donna3.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.ron1.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.ron2.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.ron3.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.garry1.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.garry2.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.garry3.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.tom1.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.tom2.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.tom3.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.ethel1.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.ethel2.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.ethel3.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.jamm1.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.jamm2.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.jamm3.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.anne1.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.anne2.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.anne3.ordinal()]);
       // locations[2][7].setScene(scenes[SceneType.blank1.ordinal()]);
       // locations[2][8].setScene(scenes[SceneType.bl.ordinal()]);
        
    }
}
