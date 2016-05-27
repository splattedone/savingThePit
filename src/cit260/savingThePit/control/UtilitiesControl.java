/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.control;

/**
 *
 * @author Appel & Ellis
 */
public class UtilitiesControl {
    public String response;
    
    public String calcTomatoAngleApril(int angle){
        if (angle > 25) {
         String response = "Easy there, killer! That's too high!";  
         return response;
        }
        
        if (angle < 10) {
            String response = "That's too low! You throw like Jerry";
            return response;
        }
        
        if (angle > 9 && angle <26){
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String response = "Nice!";
            // You hit him right in the ear. He'll feel that for awhile
            return response;
        }
        
        return response;

    }   
        
    public double calcTablespoonsTom(double tonsOfDirt, double ounces){
        //double VOLUME = 2000;
        if (tonsOfDirt < 20) {
            return -1;
        }
        
        if (ounces != 1) {
            return -1;
        }
        
        double pounds = tonsOfDirt * 2000;
        double Tbs = pounds / ounces;
        
        return Tbs;
    }
    
}
    

