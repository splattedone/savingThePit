/*
 *
 */
package savingthepit;

import cit260.savingThePit.model.Game;
import cit260.savingThePit.model.InventoryItem;
import cit260.savingThePit.model.Item;
import cit260.savingThePit.model.Location;
import cit260.savingThePit.model.Map;
import cit260.savingThePit.model.Player;
import cit260.savingThePit.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M@ Appel and Bethany Ellis
 */
public class SavingThePit {
  
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SavingThePit.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SavingThePit.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SavingThePit.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SavingThePit.inFile = inFile;
    }
    
    public static PrintWriter getLogFile(){
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile){
        SavingThePit.logFile = logFile;
    }
   
    public static void main(String[] args) {
       try {
           // open character stream files for end user input and output
           SavingThePit.inFile = new BufferedReader(new InputStreamReader(System.in));
           SavingThePit.outFile = new PrintWriter(System.out, true);
           
           //open log file
           String filePath = "log.txt";
           SavingThePit.logFile = new PrintWriter(filePath);
           
           StartProgramView startProgramView = new StartProgramView();
           //StartProgramView.displayStartProgramView();
           return;    
       } 
       catch (Throwable e){
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();
       } 
       finally {
           try {
               if (SavingThePit.inFile != null)SavingThePit.inFile.close();
               if (SavingThePit.outFile != null)SavingThePit.outFile.close();
               if (SavingThePit.logFile != null)SavingThePit.logFile.close();
           } catch (IOException ex) {
               System.out.println("Error closing files");
               return;
           }
       }
    }
    
}
