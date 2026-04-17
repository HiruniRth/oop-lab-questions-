
package com.mycompany.cost2;
public final class UniversityPolicy {

    public static final String UNIVERSITY_NAME = "University Of Kelaniya";
    public static final double BONUS_RATE = 0.1;

    public static void showPolicyHeader() {
        System.out.println(" University Policy ");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }

    // final class cannot be inherited to protect rules
}
