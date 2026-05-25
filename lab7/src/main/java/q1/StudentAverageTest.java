
package com.mycompany.lab7;

public class StudentAverageTest {
    public static void main(String[] args){
        StudentAverageCalculator std = new StudentAverageCalculator(340,0);
        
        try{
            int average = std.calculateAverage();
            System.out.println("Average = " + average);
        }
        // This causes ArithmeticException because division by zero is not allowed
        catch(ArithmeticException e) {
            System.out.println("Error: Number of students cannot be zero.");
        } 
        
        finally {
            System.out.println("Average calculation completed.");
        }
        
        System.out.println("Program continues...");
    }
}
        
                   
        


