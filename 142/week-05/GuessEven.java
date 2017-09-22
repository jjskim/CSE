// This is a guessing game in which a user tries to guess a particular
// one-digit even number.  The program reports the total number of guesses
// made.

import java.util.*;

public class GuessEven {
    public static void main(String[] args) {
        System.out.println("Try to guess an even one-digit number.");
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        int answer = r.nextInt(5) * 2;
        // TODO: Comment the next line out after making sure code works
        System.out.println("answer = " + answer);
 
        int guess = -1; // priming the loop!
        int numGuesses = 0;
        while (guess != answer) {
            System.out.print("Your guess? ");
            guess = console.nextInt();
            numGuesses++;
        }
        // guaranteed that guess == answer
        // loop zen (aka loop factoring), this next thing should happen only once
        System.out.println("You got it right in " + numGuesses+ " guesses!");
    }
}