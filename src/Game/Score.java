/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.Serializable;

/**
 *
 * @author nyz5034
 */
public class Score implements Serializable{
    String name; 
    int score;
    
    public Score(String theName, int theScore){
            
        name = theName;
        score = theScore;
    
    }
    
    public String getName() {
        
        return name;
        
    }
    
    public int getScore() {
    
        return score;
        
    }
}
