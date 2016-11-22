/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa06a_mrd3802;

// Max Domingue

import java.util.ArrayList;

// mrd3802
// C00111939
// CMPS 260
// Programming Assignment # 6b
// Due Date 11/23/2016

public class Pa06a_mrd3802 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1 = "Equal";
        String s2 = "Equal";
        //System.out.println(SortStrings(s1, s2));
        
        String s3 = "Two is greater than";
        String s4 = "One";
        //System.out.println(SortStrings(s3, s4));
        
        String s5 = "Three";
        String s6 = "Two is less than";
        
        //System.out.println(SortStrings(s5, s6));
        System.out.println(Append(s1, s2));
        System.out.println(Append(s3, s4));        
        System.out.println(Append(s5, s6));
        
        
        
        
        
        
    }
    
    /*    
    Create a static method that receives two String parameters and returns the 
    concatenation of those two strings.
    
    The larger of the two string parameters is to be placed on the left of the new string
    the smaller on the right of the new string.  
    Use calls to compareTo to determine which of the two strings is larger.
    
In method main, write the code to call this method and output its result three times
         once when the two passed strings are equal, 
         once when the first parameter is greater than the second parameter
         once when the second parameter is greater than the first parameter.   
    */
    public static String Append(String s1, String s2)
    {
        int result = s1.compareTo(s2);        
        return result > 0 ? s1 + s2 : s2 + s1;
    }
    public static String SortStrings(String s1, String s2){
        if (s1.compareTo(s2) > 0 || s1.compareTo(s2) == 0){
            return s1 + " " + s2;
        }
        else 
            return s2 + " " + s1;
    }
    
}
