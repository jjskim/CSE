import java.util.Scanner;

public class PascalTriangle {

   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      System.out.print("How many rows? ");
      int numRows = console.nextInt();

      drawPascal(numRows);
      drawPascalBinomialExpansion(numRows);
      drawPascalRecursive(numRows);
   }
   
   public static void drawPascal(int numRows) {
      for (int i = 0; i < numRows; i++) {
         int number = 1;
         for (int j = 0; j <= i; j++) {
            System.out.print(number + " ");
            number = number * (i - j) / (j + 1);
         }
         System.out.println();
      }
   }
   
      
   public static void drawPascalBinomialExpansion(int numRows) {
      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print(nChooseK(i, j) + " ");
         }
         System.out.println();
      }
   }
   
   public static int nChooseK(int n, int k) {
      int numerator = factorial(n);
      int denominator = factorial(k) * factorial(n - k);
      return numerator / denominator;
      
   }
   
   public static int factorial(int num) {
      int result = 1;
      for (int i = 1; i <= num; i++) {
         result *= i;
      }
      return result;
   }
   
   public static void drawPascalRecursive(int numRows) {
      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print(pascal(i, j) + " ");
         }
         System.out.println();
      }
   }
   
   public static int pascal(int i, int j) {
      if (j == 0 || j == i) {
         return 1;
      } else {
         return pascal(i - 1, j - 1) + pascal(i - 1, j);
      }
   }
}