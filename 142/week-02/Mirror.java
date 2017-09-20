// This program produces as output an ASCII art representation of a mirror.

public class Mirror {
    public static void main(String[] args) {
        drawLine();
        drawTopHalf();
        drawBottomHalf();
        drawLine();
    }
    
    // outputs a solid line
    public static void drawLine() {
        System.out.print("#");
        for (int i = 1; i <= 16; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
    
    // outputs the top half of the mirror
    public static void drawTopHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line + 8); spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= (-2 * line + 8); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    
    // outputs the bottom half of the mirror
    public static void drawBottomHalf() {
	// same as top half only in reverse order
        for (int line = 4; line >= 1; line--) {
            System.out.print("|");
            for (int spaces = 1; spaces <= (-2 * line + 8); spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - 4; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= (-2 * line + 8); spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}