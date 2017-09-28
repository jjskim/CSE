// Reads temperatures from the user, computes average and # days above average

import java.util.*;

public class Weather2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
                
        int[] data = new int[days];
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: " );
            data[i] = console.nextInt();
            sum = sum + data[i];
        }
        double average = (double) sum / (double) days;
                
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > average) {
                count++;
            }
        }

        System.out.println("Average temp = " + average);
        System.out.println(count + " days were above average.");
    }
}