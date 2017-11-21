// Write a program that reads two employees' hours and displays each employee's total and the overall total hours.
//
// Cap each day's total hours at 8 hours
// Company does not pay overtime

import java.util.Scanner;

public class Hours {

   public static void main(String [] args) {
      Scanner console = new Scanner(System.in);
      
      System.out.print("How many employees? ");
      int numEmployees = console.nextInt();
      int totalHours = 0;
      System.out.println();
      
      for (int i = 1; i <= numEmployees; i++) {
         totalHours += processEmployee(console, i);
      }
      
      System.out.println("Total hours for both = " + totalHours);
   }

   public static int processEmployee(Scanner console, int employeeID) {
      System.out.print("Employee " + employeeID + ": How many days? ");
      int days = console.nextInt();
      int totalHours = 0;
      for (int i = 0; i < days; i++) {
         System.out.print("Hours? ");
         totalHours += Math.min(console.nextInt(), 8);
      }
      double hoursPerDay = (double) totalHours / days;
      System.out.printf("Employee %d's total hours = %d (%.1f / day)\n", employeeID, totalHours, hoursPerDay);
      System.out.println();
      return totalHours; 
   }

}