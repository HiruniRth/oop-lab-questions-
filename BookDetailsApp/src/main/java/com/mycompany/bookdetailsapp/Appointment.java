/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookdetailsapp;

/**
 *
 * @author Dell
 */
public class Appointment {
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;
    
    public Appointment(String patientName, String appointmentType,String patientCategory,double baseFee){
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee; 
    }

    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }
    
    public double calculateFinalFee(){
        double finalFee = baseFee;
        
        if(appointmentType.equals("General"))
            finalFee = baseFee;
        
        if(appointmentType.equals("Specialist"))
            finalFee = finalFee+1500;
        
        if(appointmentType.equals("Online"))
            finalFee = finalFee-500;
         
        if(patientCategory.equals("Child"))
            finalFee = finalFee - 300;
        
        if(patientCategory.equals("Senior"))
            finalFee = finalFee - 500;
        
        if(patientCategory.equals("Adult"))
            finalFee = baseFee;
        
        return finalFee;
        }
    
    public String getAppointmentMessage(){
        return appointmentType + " appointment selected.";
    }
    }

