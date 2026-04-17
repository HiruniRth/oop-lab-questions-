/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cost2;

public class LabAssistant extends StaffMember {

    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffId, String department,
                        int hoursWorked, double hourlyRate) {

        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
    
    // department is protected so child classes can access it directly
}
