import java.io.*;
import java.util.*;

public class KierseySorter {

   public static final int DIMENSIONS = 4;
   public static final String[] PERSONALITY_CATEGORIES = {"E", "I", "S", "N", "T", "F", "J", "P"};

   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      giveIntro();
      Scanner input = new Scanner(new File(promptInputFile(console)));
      PrintStream output = new PrintStream(new File(promptOutputFile(console)));
      processFile(input, output);
   }
   
   // prints an introduction of the program for the user to the console
   public static void giveIntro() {
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter.  It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
      System.out.println();
   }
   
   // small helper file to prompt for the name of the input file
   public static String promptInputFile(Scanner console) {
      System.out.print("input file name? ");
      return console.next();
   }
   
   // small helper file to prompt for the name of the output file
   public static String promptOutputFile(Scanner console) {
      System.out.print("output file name? ");
      return console.next();
   }
   
   // processes the file of input and prints the results to the specified
   // output file -- also echoes the output to the console
   public static void processFile(Scanner input, PrintStream output) {
      while (input.hasNextLine()) {
         String name = input.nextLine();
         String answers = input.nextLine().toLowerCase();
         int[] numA = new int[DIMENSIONS];
         int[] numB = new int[DIMENSIONS];
         for (int i = 0; i < answers.length(); i++) {
            if (answers.charAt(i) == 'a') {
               numA[whichIndex(i)]++;
            } else if (answers.charAt(i) == 'b') {
               numB[whichIndex(i)]++;
            }
         }
         int[] percentB = determinePercentB(numA, numB);
         String personality = determinePersonality(percentB);
         print(output, name, percentB, personality);
      }
   }
   
   // print the results of each person in the input to the specified PrintStream
   public static void print(PrintStream output, String name, int[] percentB, String personality) {
      output.println(name + ": " + Arrays.toString(percentB) + " = " + personality);
   }
   
   // accepts arrays containing the number of A and B answers for each personality trait
   // and returns a new array containing the percent of B answers for each trait
   public static int[] determinePercentB(int[] numA, int[] numB) {
      int[] percentB = new int[DIMENSIONS];
      for (int i = 0; i < DIMENSIONS; i++) {
         int total = numA[i] + numB[i];
         double percent = (double) numB[i] / total * 100;
         percentB[i] = (int) Math.round(percent);
      }
      return percentB;
   }
   
   // returns the personality type as String, corresponding to the percent of B answers given
   // if the percent is 50 (answer were equally A and B) then an X is placed for that category
   public static String determinePersonality(int[] percentB) {
      String result = "";
      for (int i = 0; i < DIMENSIONS; i++) {
         if (percentB[i] > 50) {
            result += PERSONALITY_CATEGORIES[2 * i + 1];
         } else if (percentB[i] < 50) {
            result += PERSONALITY_CATEGORIES[2 * i];
         } else { // percent is exactly 50
            result += "X";
         }
      }
      return result;
   }
   
   // accepts an integer index and determines which dimension the answer corresponds to,
   // returning the index of the dimension. numbers are asked in groups of 7, the first question
   // corresponding to E/I, the next two S/N, the next two T/F, and the last two J/P
   public static int whichIndex(int index) {
      if (index % 7 == 0) {
         return 0;
      } else if (index % 7 == 1 || index % 7 == 2) {
         return 1;
      } else if (index % 7 == 3 || index % 7 == 4) {
         return 2;
      } else { // index % 7 == 5 || index % 7 == 6
         return 3;
      }
   }
}