// prints out the number of each type of digit in 889074302

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        int num = 889074302;
        int[] counts = new int[10];
        
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            counts[digit]++;
        }
        System.out.println(Arrays.toString(counts));
   }
}