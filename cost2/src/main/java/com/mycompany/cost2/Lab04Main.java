/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cost2;

public class Lab04Main {

    public static void main(String[] args) {

        Lecturer lec = new Lecturer("Nimal Perera", "L001", "IT", 3, 50000);
        LabAssistant lab = new LabAssistant("K. Rathnayake", "A001", "IT", 40, 2000);

    lec.displayLecturerDetails();
    lab.displayLabAssistantDetails();
}
}

