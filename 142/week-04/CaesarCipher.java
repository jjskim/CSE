// This program takes in (1) a message from the user and (2) a number representing an encryption key.
// The message will be encrypted using a Caesar cipher which shifts each letter alphabetically by the encryption number.
// The encrypted message then outputed to the user.

import java.util.*;

public class CaesarCipher {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Your secret message ");
      String message = console.nextLine().toLowerCase();
      System.out.print("Your secret key: ");
      int shift = console.nextInt() % 26; 
      String encryptedMessage = encrypt(message, shift);
      System.out.println("Here is your encoded message: \"" + encryptedMessage);
   }
   
   public static String encrypt(String message, int shift) {
      String encrypted = "";
      for (int i = 0; i < message.length(); i++) {
         char thisChar = message.charAt(i);
         if (thisChar <= 'z' && thisChar >= 'a') {
            thisChar = (char) (message.charAt(i) + shift);
            if (thisChar > 'z') {
               thisChar -= (char) 26;
            } else if (thisChar < 'a') {
               thisChar += (char) 26;
            }
         }
         encrypted += thisChar;
      }
      return encrypted;
   }
}