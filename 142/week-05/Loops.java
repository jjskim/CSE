// Examples of fencepost loops and while loops
import java.util.*;

public class Loops {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("max? ");
      int num = console.nextInt();
      
      System.out.println("numbers up to max:"); 
      printNums(num);
      System.out.println();
      
      System.out.println("powers of 2 up to 256:");
      printPowTwos();
      System.out.println();
      
      System.out.println("Welcome to the summation program.  " +
                         "Please type integers:");
      cumulativeSum(console);
      System.out.println();
      
      System.out.println("Welcome to the String summation program.  " +
                         "Please type tokens:");
      cumulativeStringSum(console);
      System.out.println();
   }

   // prints out the numbers from 1 to the given max, separated by commas
   public static void printNums(int max) {
      // fencepost problem
      // |   -|-|-|-|-|-|-|-|-|-|
      System.out.print(1); // post
      for (int i = 2; i <= max; i++) {
                     // wire  // post
         System.out.print(", " + i);
      }
      System.out.println();
   }
   
   // prints out the powers of two from 1 to 256, separated by commas
   public static void printPowTwos() {
      int n = 1;
      // |-|-|-|-|-|-|-|-|-|-     |
      while (n < 200) {
	              // post  // wire
         System.out.print(n + ", ");
         n = n * 2;
      }
      System.out.println(n);  // post
   }
   
   // repeatedly prompts the user for a number or -1 to quit
   // prints out the sum of those numbers, not including the -1
   public static void cumulativeSum(Scanner console) {
      int sum = 0;
      System.out.print("next (-1 to quit)? ");
      int number = console.nextInt();
      while (number != -1) {
         sum = sum + number;
         System.out.print("next (-1 to quit)? ");
         number = console.nextInt();
      }
      System.out.println("sum = " + sum);      
   }
   
   // repeatedly prompts the user for a token or "quit" quit
   // prints out the concatenation of those tokens, not including the "quit"
   public static void cumulativeStringSum(Scanner console) {
      String stringSum = "";
      System.out.print("next token or \"quit\"? ");
      String word = console.next();
      while (!word.equals("quit")) {
         stringSum = stringSum + word;
         System.out.print("next token or \"quit\"? ");
         word = console.next();
      }
      System.out.println("concatenated strings: " + stringSum);      
   } 
}