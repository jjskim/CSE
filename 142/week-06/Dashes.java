// Notes: the test for the index of the dash must be the first test in the || test
//    otherwise a java.lang.StringIndexOutOfBoundsException will be thrown for looking
//    up an out of bounds index of the shorter string
//
// Alternatively, can get rid of the if/else structure in the beginning, and instead do
//    a for loop iterating through both strings. Run time would be identical O(2n) --> O(n)

import java.util.*;

public class Dashes {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("enter the first string ");
      String s1 = console.nextLine();
      System.out.print("enter the second string ");
      String s2 = console.nextLine();
      if (sameDashes(s1, s2)) {
         System.out.println("They have the same dashes");
      } else {
         System.out.println("Dashes do not match");
      }
   }
   
   public static boolean sameDashes(String a, String b) {
      String longer;
      String shorter;
      if (a.length() > b.length()) {
         longer = a;
         shorter = b;
      } else {
         longer = b;
         shorter = a;
      }
      for (int i = 0; i < longer.length(); i++) {
         if (longer.charAt(i) == '-') {
            if (i >= shorter.length() || shorter.charAt(i) != '-') {
               return false;
            }
         }
      }
      return true;
   }
}