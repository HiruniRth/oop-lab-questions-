
package com.mycompany.cost2;

public class Lab04Main {

    public static void main(String[] args) {
        
        StaffMember.showSystemName();

        Lecturer lec1 = new Lecturer("Nimal Perera", "L001", "IT", 3, 50000);
        Lecturer lec2 = new Lecturer("H.S.Silva", "L002", "Electronics", 5, 60000);
        LabAssistant lab = new LabAssistant("K.Rathnayake", "A001", "IT", 40, 2000);

        System.out.println("Total Staff Count: " + StaffMember.getStaffCount());
    }
}


