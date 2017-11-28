import java.util.Scanner;

public class PascalTriangle {

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      System.out.print("How many rows? ");
      int numRows = console.nextInt();
      drawPascal(numRows);
      
   }
   
   public static void drawPascal(int numRows) {
      for (int i = 0; i < numRows; i++) {
         int number = 1;
         System.out.printf("%" + (numRows - i) * 2 + "s", "");
         for (int j = 0; j <= i; j++) {
            System.out.printf("%4d", number);
            number = number * (i - j) / (j + 1);
         }
         System.out.println();
      }
   }
}