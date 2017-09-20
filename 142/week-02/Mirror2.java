// This program produces as output an ASCII art representation of a mirror.
// This version includes a class constant for drawing mirrors of different
// sizes.

public class Mirror2 {
    public static final int SIZE = 7;  // change this to scale the mirror

    public static void main(String[] args) {
        drawLine();
        drawTopHalf();
        drawBottomHalf();
        drawLine();
    }
    
    // outputs a solid line
    public static void drawLine() {
        System.out.print("#");
        for (int i = 1; i <= 4 * SIZE; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
    
    // outputs the top half of the mirror
    public static void drawTopHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    
    // same as top half only in reverse order
    public static void drawBottomHalf() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= (-2 * line + 2 * SIZE); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}