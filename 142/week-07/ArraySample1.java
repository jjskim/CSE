// This class contains several small examples of array manipulation.  Each
// is written as a method.

import java.util.*;

public class ArraySample1 {
    public static void main(String[] args) {
        int[] evens = {2, 4, 6, 8, 10, 12, 14};
        String[] taylor = {"we", "never", "go", "out", "of", "style"};
        System.out.println("sum of evens = " + sum(evens));
        mystery();
        System.out.println("evens = " + Arrays.toString(evens));
        int x = 8;
        int y = 24;
        swap(x, y);
        int[] list1 = {8, 17, 4, 93};
        int[] list2 = list1;
        list2[0] = -98;
        System.out.println("list1 = " + Arrays.toString(list1));
        modify(list1);
        System.out.println("after modify, list1 = " + Arrays.toString(list1));
        reverse(evens);
        System.out.println("after reverse, evens = " + Arrays.toString(evens));
    }

    public static void mystery() {
        int[] a = {1, 7, 5, 6, 4, 14, 11};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;
            }
        }
        System.out.println("mystery array = " + Arrays.toString(a));
    }
    
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void modify(int[] list) {
        list[0] = -924;
        list[1] = -42;
    }

    public static int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }
    public static void reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            // compute the index for the other value to swap
            int j = list.length - 1 - i;
            // swap two values
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}