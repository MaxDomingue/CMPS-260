/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AutoFactory;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author student.admin
 */

class ProductionInProgressException extends Exception
{
    ProductionInProgressException(String s)
    {
        super(s);
    }
}
public class AutoFactory extends Exception
{
    
   
    public static void shutdown(int num) throws ProductionInProgressException
    {        
        if(num > 1)
            throw new ProductionInProgressException("u bad");
        System.out.print("SUCCESS THE NUMBER IS " + num);
    }
    public static void reset()
    {
        System.out.print("reset");
    }
    
    
    
    //Given an initialized String variable fileName, 
    //write a sequence of statements that create a file 
    //whose name is given by the variable and 
    //whose content is a single line consisting of "This Is File:" followed by the name of the file. 
    //Make sure that the data written to the file has been flushed from its buffer and that 
    //any system resources used during the course of running these statements have been released.
    //(Do not concern yourself with any possible exceptions here -- assume they are handled elsewhere.)
    
    
    public static void main(String[] args) 
    {
     String scores = "scores.txt";
     File file = new File(scores);
        if (file.exists()) 
        {
          System.out.println("File already exists");
           
      }
       try{
            PrintWriter pw = new java.io.PrintWriter();
            String var1 = scores;
            String var2 = "This is File: ";
            pw.println(var2 + var1);
            pw.close();
            
       }
       catch(Exception e)
       {          
       }
//       
//       try{
////        Scanner scanner = new Scanner(file);
////        while(scanner.hasNext())
////        {
////            String val = scanner.nextLine();
////            
////            System.out.print(val + "\n" );
////        }
//       }
//       catch(Exception e)
//        {}

    }
}

