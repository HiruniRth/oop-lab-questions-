
package lab05;

public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double charge1 = calculator.calculateCharge(1000);
        System.out.println("Base Charge: " + charge1);
        
        double charge2 = calculator.calculateCharge(1000, 5);
        System.out.println("With Distance: " + charge2);
        
        double charge3 = calculator.calculateCharge(1000, 5, 2);
        System.out.println("With Distance & Weight: " + charge3);
        
        double charge4 = calculator.calculateCharge(1000, true);
        System.out.println("With Express Delivery: " + charge4);
    }
    // This is compile-time polymorphism because method overloading is resolved at compile time.
}
    