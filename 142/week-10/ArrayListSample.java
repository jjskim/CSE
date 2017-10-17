// translation from Array to ArrayList:
//    String[]          => ArrayList<String>
//    new String[10]    => new ArrayList<String>()
//    a.length          => list.size()
//    a[i]              => list.get(i)
//    a[i] = value;     => list.set(i, value);
//
//
// new operations:
//     list.remove(i);     --remove the i-th value and return it
//     list.add(value);    --appends a value
//     list.add(i, value); --adds at an index
//     list.clear()        --remove all values

import java.util.*;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("four");
        list.add("score");
        list.add("seven");
        list.add("years");
        list.add("what was next?");
        list.add("ago");
        list.add(2, "and");
        list.remove(5);
        System.out.println("list = " + list);
        System.out.println(list.indexOf("seven"));

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(1);
        list2.add(3);
        System.out.println("list2 = " + list2);

        stutter(list2);
        System.out.println("after stutter list2 = " + list2);

        minToFront(list2);
        System.out.println("after minToFront list2 = " + list2);

        System.out.println("maxLength returns " + maxLength(list));

        removeEvenLength(list);
        System.out.println("after removeEvenLength list = " + list);
    }

    // replaces every value in the list with two of that value
    // ex: [5, 1, 3] -> [5, 5, 1, 1, 3, 3]
    public static void stutter(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i += 2) {
            int next = list.get(i);
            list.add(i, next);
        }
    }

    // moves the minimum value to the front of the given list, otherwise
    // preserving the order of the elements
    public static void minToFront(ArrayList<Integer> list) {
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(min)) {
                min = i;
            }
        }
        int oldValue = list.remove(min);
        list.add(0, oldValue);
        // could also have been written in one line:
        // list.add(0, list.remove(min));
    }

    // returns the length of the longest String in the given list
    public static int maxLength(ArrayList<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    // removes from the list all strings of even length
    public static void removeEvenLength(ArrayList<String> list) {
        int i = 0;
        while (i < list.size()) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }
}