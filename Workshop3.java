/**
This program calculates your pace given a time and distance traveled.  
The formula used is:
time / distance 

@author Timothy McWatters
@version 1.0

COP2253    Workshop 3
File Name: Workshop3.java
*/

public class Workshop3 
{
   // Constants for the program's execution
   public static final double distance = 6.21;
   
	public static void main(String[] args)
	{
      // Variable Declarations
	   double time = 35.5;
      double paceRun = time / distance; 

      System.out.println("This program calculates your pace given a time and distance traveled.");      
      System.out.printf("Your pace is %.2f minutes per mile.%n", paceRun);
   }
}