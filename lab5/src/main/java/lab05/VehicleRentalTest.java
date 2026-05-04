
package lab05;

public class VehicleRentalTest {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("C003", "Toyota", 4, 1000);
        Vehicle vehicle2 = new Bike("B025", "Yamaha", 10, 200);

        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());
    }
    // This is runtime polymorphism because method overriding is resolved at runtime based on the object type.
}
    
