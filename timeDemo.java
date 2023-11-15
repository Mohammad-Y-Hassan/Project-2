/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cscilab1;

import java.util.Locale;

/**
 *
 * @author soblab
 */
public class timeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time getupTime = new Time(6, 14, 1); 
        System.out.println(getupTime); 
        
        Time departureTime = new Time(4, 23, 1); 
        System.out.println(departureTime); 
        
        Time lunchTime = new Time(12, 2, 10); 
        System.out.println(lunchTime); 
        
        Time csc211 = new Time(lunchTime); 
        
        System.out.println(csc211); 
        if (lunchTime.equals(csc211)) { 
            System.out.println("They are equal"); 
        } else { 
            System.out.println("They are different"); 
        } 
    }
} 
    
    
