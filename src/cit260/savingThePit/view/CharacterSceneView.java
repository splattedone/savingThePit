/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.view;

/**
 *
 * @author bethanyellis
 */
public class CharacterSceneView extends View{
    
    private String menu;
    private String promptMessage = "Let's get those items!";
    private Object savingThePit;

    public CharacterSceneView() {
        
        super("\n"
                  + "\n------------------------------"
                  + "\n| Character Scene Menu                  |"
                  + "\n------------------------------"
                  + "\nT - Talk to The Person"
                  + "\nB - Do the Bribe"
                  + "\nI - Take The Item"
                  + "\nS - Save Game"
                  + "\nQ - Quit"
                  + "\n------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //Convert choice to uppercase
        
        switch (value) {
            case "T": //Talk to the person
                this.talkToPerson();
                break;
            case "B": //Accomplish the bribe
                this.doTheBribe();
                break;
            case "I": //Try to take the item 
                this.takeAnItem();
                break;                
            case "S": // Save Game
                this.saveGame();
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
                break;
        }
        
        return false;
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void talkToPerson() {
        System.out.println("*** talkToPerson function called ***");
    }

    private void doTheBribe() {
        System.out.println("*** doTheBribe function called ***");
    }

    private void takeAnItem() {
        System.out.println("*** takeAnItem function called ***");
    }
 
    
}
