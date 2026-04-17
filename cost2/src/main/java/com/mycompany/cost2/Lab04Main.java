
package com.mycompany.cost2;

public class Lab04Main {

    public static void main(String[] args) {
        
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();
        System.out.println(UniversityPolicy.UNIVERSITY_NAME);
        System.out.println();
        
        Lecturer lec1 = new Lecturer("Nimal Perera", "L001", "IT", 3, 50000);
        Lecturer lec2 = new Lecturer("H.S.Silva", "L002", "Electronics", 5, 60000);
        LabAssistant lab = new LabAssistant("K.Rathnayake", "A001", "IT", 40, 2000);
        
        lec1.changeDepartment("Engineering");
        
        lec1.displayLecturerDetails();
        System.out.println("Monthly payment: " + lec1.calculateMonthlyPayment());
        System.out.println("Monthly Bonus: " + UniversityPolicy.calculateBonus(lec1.calculateMonthlyPayment()));
        lec1.showCommonNotice();
        System.out.println();
        
        lec2.displayLecturerDetails();
        System.out.println("Monthly payment: " + lec2.calculateMonthlyPayment());
        System.out.println("Monthly Bonus: " + UniversityPolicy.calculateBonus(lec2.calculateMonthlyPayment()));
        lec2.showCommonNotice();
        System.out.println();
        
        lab.displayLabAssistantDetails();
        System.out.println("Monthly payment: " + lab.calculateMonthlyPayment());
        System.out.println("Monthly Bonus: " + UniversityPolicy.calculateBonus(lab.calculateMonthlyPayment()));
        lab.showCommonNotice();
        System.out.println();
        
        System.out.println("Total Staff Count: " + StaffMember.getStaffCount());
    }
}


