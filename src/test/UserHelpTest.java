/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Owner
 */
public class UserHelpTest {
  String rules;
    
      
    public static double getLosingPercentage(int wins, int losses) {
       
        //check for valid values
        if (wins < 0)  {
            System.out.println("Invalid number of wins");
            return -1;}
        if (losses < 0) {
            System.out.println("Invalid number of losses");
            return -1;}
        
        //find total number of games
        double totalGames = wins + losses;
        
        //find losing percentage
        double losingPercentage = losses / totalGames;
        
        //display help prompt or losing percentage
        if (totalGames >= 5 && losingPercentage >= 0.75) 
            System.out.println("Would you like to \n review the instructions?");
        else 
            System.out.println("Your losing percentage is " + losingPercentage);
        
        return losingPercentage;
    
    } 
}
