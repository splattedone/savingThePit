/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.savingThePit.control;

import cit260.savingThePit.exceptions.UtilitiesControlException;

/**
 *
 * @author Appel & Ellis
 */
public class UtilitiesControl {
    public int answer;
    
    //UtilitiesControl.calcTomatoAngleApril(7,5))
    
    public static int calcTomatoAngleApril(int angle, int howHard){
        int answer;
 
        if (angle > 25) {
         answer = -1;
         //Error Code 1 : "Easy there, killer! That's too high!";
         return answer;
        }
        
        if (angle <= 0) {
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
    
    public int calcWafflesAnne(double size, double howMany){
        //User will be prompted to enter size. Tiny == .25, Med == .5, Large == 1.0, Child Size == 2.0
        double i = size * howMany;
        int charResponse = 0;
        
        if (i == 0) {
            charResponse = -10;
            //Response Code -1 : "C'mon! Get Cookin!"
            return charResponse;
        }
        
        if (i == 1) {
            charResponse = -1;
            //Response Code -1 : "Just one? That’s it? We are still friends, right?"
            return charResponse;
        }
                
        if (i == 2) {
            charResponse = -2;
            //Response Code -2 : "Keep 'em coming. A woman's gotta eat"
            return charResponse;
        }
                
        if (i == 3) {
            charResponse = -3;
            //Response Code -3 : "Did you just stuff that fresh one in your face? Do I get any more?"
            return charResponse;
        }
                
        if (i == 4) {
            charResponse = -4;
            //Response Code -4 : "That's three! That's the appetizers, now for the main course: more!"
            return charResponse;
        }
                
        if (i == 5) {
            charResponse = -5;
            //Response Code -5 : "Have I mentioned that I love waffles? And that I get really hungry before a 12-hour shift?"
            return charResponse;
        }
                
        if (i == 6) {
            charResponse = -6;
            //Response Code -6 : "Good job Knope! You make a mean Bisquick waffle."
            return charResponse;
        }
             
        if (i == 7) {
            charResponse = -7;
            //Response Code -7 : "Ok seriously, I just ate five. Don't tempt me."
            return charResponse;
        }
                
        if (i >= 8) {
            charResponse = -8;
            //Response Code -8 : "Seriously, please stop."
            return charResponse;
        }
        answer = charResponse;
        return answer;
    }
    
    public static double calcAmountOfDirtEthel(int height, int radius) throws UtilitiesControlException{
        if (height < 10 || height > 25) {
            throw new UtilitiesControlException("Height should be between 10 and 25");
        }
        
        if (radius < 25 || radius > 90) {
            throw new UtilitiesControlException("Radius should be between 25 and 90");
        }
    
        double volume = Math.PI * Math.pow(radius, 2)* height; 
        //This is your original formula. It's not wrong, but I have a feeling it'll come back as missed points somehow. This does the same thing, just in the more [insert air quotes here] proper way.
        //double volume = (3.142 * (radius * radius)) * height;        
        return volume;
    }    
}


    

