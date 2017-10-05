// This client program constructs three points by calling constructors,
// translates two of the points, prints them, and then reports the distance
// between two of them.

public class PointClient2 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(12, 4);
        Point p3 = new Point();

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

        p1.translate(-1, -2);
        p2.translate(6, 8);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println("p1 distance = " + p1.distanceFromOrigin());
        System.out.println("p2 distance = " + p2.distanceFromOrigin());
        
        // can't say p1.x + p1.y because of private fields
        // instead, we added getter methods to access that data
        int sum = p1.getX() + p1.getY();
        System.out.println("sum of p1 coordinates = " + sum);
    }
}