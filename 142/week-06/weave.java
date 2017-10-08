// Write a static method called weave that takes in two integers as parameters and returns an integer
// that represents their "weaved" combination.
//
// For example, the call weave(144, 158) --> returns 114548
// The procedure for constructing a weaved number is as follows:
//    1st pair:
//       the last digit of the weaved number is the last digit of y
//       the second-to-last digit of the weaved number is the last digit of x
//    2nd pair:
//       the third-to-last digit of the weaved number is the second to last digit of y
//       the fourth-to-last digit of the weaved number is the secodn to last digit of x
//
//    ... and so on
//
// If one of the numbers has more digits than the other, you should imagine leading zeros are used
// to make the numbers of equal length. 
//
// For example:
//
// weave(2384, 12) --> returns 20308142 -- as if the call were: 'weave(2384, 0012)'
// similarly, weave(9, 318) --> returns 30198 --as if the call were: 'weave(009, 318)'
//    note in this example that the leading zero was removed (030198 was NOT returned)
//
// Solve this problem using only integer types -- you may NOT use strings, arrays, chars, or any other types
// You must solve it using integer arithmetic. You may assume that the numbers passed are always non-negative

public class weave {

   public static void main(String[] args) {
      System.out.println(weave(394, 128));
      System.out.println(weave(2384, 12));
      System.out.println(weave(9, 318));
   }

   public static int weave(int x, int y) {
      int weaved = 0;
      int multiplier = 1;
      while (x != 0 || y != 0) {
         weaved = weaved + multiplier * (x % 10 * 10 + y % 10);
         multiplier = multiplier * 100;
         x = x / 10;
         y = y / 10;
      }
      return weaved;
   }
}