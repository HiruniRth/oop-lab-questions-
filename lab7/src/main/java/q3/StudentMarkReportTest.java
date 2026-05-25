
package q3;

public class StudentMarkReportTest {
    public static void main(String[] args){
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);
        
        try{
        // This causes ArrayIndexOutOfBoundsException because index 6 does not exist in the array
           
            int mark = report.getMarkAt(6);           
        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Selected mark position does not exist.");            
        }
        
        finally{
            System.out.println("Array access checking completed.");
        }
        
        System.out.println();
        
        try{
        // This causes NumberFormatException because "absent" cannot be converted into an integer
            int mark = report.getMarkAt(2); 
            System.out.println("Mark = " + mark);   
        }
        
        catch ( NumberFormatException e){
            System.out.println("Error: Selected mark is not a valid number.");            
        }
        
        finally{
            System.out.println("Number conversion checking completed.");
        }
        System.out.println("Report checking completed.");
        
    }
       
}
