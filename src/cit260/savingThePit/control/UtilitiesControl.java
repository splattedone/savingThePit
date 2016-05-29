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
    
    public int calcTomatoAngleApril(int angle, int howHard){
        int answer;
 
        if (angle > 25) {
         answer = -1;
         //Error Code 1 : "Easy there, killer! That's too high!";
         return answer;
        }
        
        if (angle < 10) {
            answer = -2;
            //Error Code 2 : "That's too low! You're throwing like Jerry";
            return answer;
        }
            
        if (howHard > 10) {
            answer = -3;
            //Error Code 3 : "Lay off the sauce. We want to hit them, not maim them."
            return answer;
        } 
        
        if (howHard < 1) {
            answer = -4 ;
            //Error Code 4 : "Throw it harder! You're an independent woman!"
        }
        
        answer = angle * howHard;
        
        return answer;

    }   
        
    public double calcTablespoonsTom(double tonsOfDirt, double ounces){
        //double VOLUME = 2000;
        
        // A negative result will be translated to an error message on the control layer. -1 will indicate the tonsOfDirt number is bad, -2 will indicate that ounces is incorrect.
        if (tonsOfDirt < 16 || tonsOfDirt > 30) {
            return -1;
        }
        
        if (ounces != 1) {
            return -2;
        }
        
        double pounds = tonsOfDirt * 2000;
        double Tbs = pounds / ounces;
        
        return Tbs;
    }
    
    public String calcWafflesAnne(String make){
        int i = 0;
        
        if (i == 1) {
            String charResponse = "Just one? That’s it? We are still friends, right?";
            return charResponse;
        }
                
        if (i == 2) {
            String charResponse = "Keep 'em coming. A woman's gotta eat";
            return charResponse;
        }
                
        if (i == 3) {
            String charResponse = "Did you just stuff that fresh one in your face? Do I get any more?";
            return charResponse;
        }
                
        if (i == 4) {
            String charResponse = "That's three! That's the appetizers, now for the main course: more!";
            return charResponse;
        }
                
        if (i == 5) {
            String charResponse = "Have I mentioned that I love waffles? And that I get really hungry before a 12-hour shift?";
            return charResponse;
        }
                
        if (i == 6) {
            String charResponse = "Good job Knope! You make a mean Bisquick waffle.";
            return charResponse;
        }
             
        if (i == 7) {
            String charResponse = "Ok seriously, I just ate five. Don't tempt me.";
            return charResponse;
        }
                
        if (i >= 8) {
            String charResponse = "Seriously, please stop.";
            return charResponse;
        }
        
        return response;
    }
    
    public double calcAmountOfDirtEthel(int height, int radius){
        if (height < 10 || height > 25) {
            return -1;
        }
        
        if (radius < 25 || radius > 90) {
            return -2;
        }
    
        int volume = (3.142 * (radius * radius)) * height; 
                
        return volume;
}


    

