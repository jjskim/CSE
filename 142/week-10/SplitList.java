// write a static method called split that takes in an ArrayList of Integer values
// as a parameter and that replaces each value in the list with a pair of values,
// each half the original. If a number in the original list is odd, then the first
// number in the pair should be one number higher than the second so that the sum
// of the pair equals the original number

import java.util.*;

public class SplitList {
   public static void main(String[] args) {
      int[] list1 = {2, 4, 6, 8};
      int[] list2 = {3, 5, 7};
      int[] list3 = {18, 7, 4, 24, 11};
      int[] list4 = {-8, 0, -3, 2001};
      int[] list5 = {42};
      int[] list6 = {17};
      int[] list7 = {};
      
      test(list1);
      test(list2);
      test(list3);
      test(list4);
      test(list5);
      test(list6);
      test(list7);
   }
   
   public static void test(int[] data) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for (int n : data) {
         list.add(n);
      }
      System.out.println("Before split: " + list);
      split(list);
      System.out.println("After split:  " + list);
      System.out.println();
   }
   
   public static void split(ArrayList<Integer> list) {
      for (int i = 0; i < list.size(); i += 2) {
         int n = list.get(i);
         list.set(i, n / 2);
         list.add(i, n - n / 2);
      }
   }
}