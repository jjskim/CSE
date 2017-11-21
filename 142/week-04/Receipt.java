import java.util.Scanner;

public class Receipt {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("How many people? ");
      int numPeople = console.nextInt();
      double subtotal = 0.0;
      
      for (int i = 1; i <= numPeople; i++) {
         System.out.print("Person #" + i + ": Cost of meal? ");
         subtotal += console.nextDouble();
      }
      System.out.println();
      printReceipt(subtotal);
   }
   
   public static void printReceipt(double subtotal) {
      double tax = subtotal * 0.08;
      double tip = subtotal * 0.15;
      double total = subtotal + tax + tip;
   
      System.out.printf("Subtotal: $%.2f\n", subtotal);
      System.out.printf("Tax: $%.2f\n", tax);
      System.out.printf("Tip: $%.2f\n", tip);
      System.out.printf("Total: $%.2f\n", total);
   }

}