// This class contains several small examples of array and String manipulation.
// Each is written as a method.

import java.util.*;

public class ArrayTests {
    public static void main(String[] args) {
        int[] data = {-8, 274, -54, 782, 92, 42, -384, 17};
        System.out.println("data = " + Arrays.toString(data));
        applyAbs(data);
        System.out.println("after applyAbs, data = " + Arrays.toString(data));

        String s = "cheese";
        System.out.println("s = " + s);
        s = reverse(s);
        System.out.println("after reverse and reassigning s = " + s);
    }
        
    // This method replaces any negative integers in the given array with the
    // absolute value of the integer.
    public static void applyAbs(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = Math.abs(list[i]);
        }
    }
        
    // This method returns a String that is twice as long as the original
    // with each character from the original appearing twice in the result
    public static String reverse(String text) {
        // String processing is similar to array processing:
        // list.length  =>  s.length()
        // list[i]      =>  s.charAt(i)
                
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = text.charAt(i) + result;
        }
        return result;
    }
}