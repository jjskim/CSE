/* Sample program, third iteration of the class, that produces
 * output with two diamonds and an X.  This version has good 
 * structure and eliminates redundancy.
 */
public class Figure3 {
    public static void main(String[] args) {
        drawDiamond();
        drawDiamond();
        drawX();
    }

    // Draws a diamond shape out of slashes and backslashes
    // by printing out ascii art to the console.
    public static void drawDiamond() {
        drawMountain();
        drawValley();
        System.out.println();
    }

    // Draws an X shape out of slashes and backslashes
    // by printing out ascii art to the console.
    public static void drawX() {
        drawValley();
        drawMountain();
        System.out.println();
    }

    // Draws a mountain shape out of slashes and backslashes
    // by printing out ascii art to the console.
    public static void drawMountain() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
    }

    // Draws a valley shape out of slashes and backslashes
    // by printing out ascii art to the console.
    public static void drawValley() {
        System.out.println("\\    /");
        System.out.println(" \\  /");        
        System.out.println("  \\/");
    }
}