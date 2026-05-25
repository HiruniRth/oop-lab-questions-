
package com.mycompany.lab7;

public class StudentAverageCalculator {
    private int totalMarks;
    private int numberOfStudents;
    
    public StudentAverageCalculator(int totalMarks,int numberOfStudents){
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }
    
    public int calculateAverage(){
        int average = totalMarks/numberOfStudents;
        return average;
    }   
}
