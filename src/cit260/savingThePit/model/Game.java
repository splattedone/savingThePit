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
    private String gameName;
    private String resumeGame;
    
    public Game() {
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getResumeGame() {
        return resumeGame;
    }

    public void setResumeGame(String resumeGame) {
        this.resumeGame = resumeGame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.gameName);
        hash = 67 * hash + Objects.hashCode(this.resumeGame);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "gameName=" + gameName + ", resumeGame=" + resumeGame + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameName, other.gameName)) {
            return false;
        }
        if (!Objects.equals(this.resumeGame, other.resumeGame)) {
            return false;
        }
        return true;
    }
    
    
    
}
