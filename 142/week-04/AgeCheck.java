public class AgeCheck {
    public static void main(String[] args) {
      int myAge = 16;
      message(myAge);
    }

    // Displays message about driving to user based on given age
    public static void message(int age) {
      if (age >= 16) {
         System.out.println("I'm old enough to drive!");
      } else {
         System.out.println("Not old enough yet... :*{");
      }
    }
}