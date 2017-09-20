/* Program to compute an overall grade in the course.
 *
 * Uses variables to factor out redundant data and make
 * it easier to read.
 */
public class Grade {
    public static void main(String[] args) {
        // homework points possible:
        //     hw1=10, hw2=16, hw3-8=20, section=20
        int hwTotal = 10 + 16 + 6 * 20 + 20;
        int hwEarned = 8 + 14 + 6 * 18 + 20;
        System.out.println("Homework total = " + hwTotal);
        System.out.println("Homework earned = " + hwEarned);
        
        int midPercent = 81;
        int finPercent = 74;
        System.out.println("Midterm = " + midPercent);
        System.out.println("Final = " + finPercent);
        
        // Bug in the following line, makes the hwPercent
        // 0.0 because of integer division, we need to cast
        // to a double or swap the order of the expression
        // double hwPercent = (hwEarned / hwTotal * 100);
        
        // multiplying the hwEarned by 100.0 (type double) converts the integer operations to double
        // this is needed for percentile precision (common mistake)
        double hwPercent = hwEarned * 100.0 / hwTotal;
        
        System.out.println("Overall = " + ((0.45 * hwPercent) + 
                          (0.2 * midPercent) + (0.35 * finPercent)));
    }
}