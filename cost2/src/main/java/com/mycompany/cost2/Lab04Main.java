
package com.mycompany.cost2;

public class Lab04Main {

    public static void main(String[] args) {

        Lecturer lec = new Lecturer("Nimal", "L001", "IT", 3, 50000);
        LabAssistant lab = new LabAssistant("Kamal", "A001", "IT", 40, 2000);

        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);

        System.out.println();
        double lecturerBonus = lec.calculateMonthlyPayment();
        double assistantBonus = lab.calculateMonthlyPayment();

        System.out.println("Lecturer Bonus: " + UniversityPolicy.calculateBonus(lecturerBonus));
        System.out.println("Lab Assistant Bonus: " + UniversityPolicy.calculateBonus(assistantBonus));
    }
}


