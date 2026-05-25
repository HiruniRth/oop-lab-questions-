
package com.mycompany.lab7.q2;

public class ProductBillTest {
    public static void main(String[] args){
    ProductBill product = new ProductBill("1500.00","two");
    
try {
    double total = product.calculateTotal();
// This causes NumberFormatException because "two" is not a valid integer
    System.out.println("Total Bill = " + total);
}  
catch (NumberFormatException e){
    System.out.println("Error: Price and quantity must be valid numbers.");
}

finally {
    System.out.println("Product bill calculation completed.");
}

System.out.println("Program continues...");
    
}
}
