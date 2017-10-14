/*
CSE 142 Lab 8

This client program uses Point objects.
Expected output:

p1 is (8, 2)
p2 is (4, 3)
p1's distance from origin is 8.246211251235321
p1 is now (9, 4)
p2 is now (3, 13)
*/

public class PointClient {
	public static void main(String[] args) {
   
      // construct two Point objects, one at (8, 2) and one at (4, 3)
      Point p1 = new Point();
      Point p2 = new Point();
      p1.x = 8;
      p1.y = 2;
      p2.x = 4;
      p2.y = 3;
      
      // display the two Point objects' state
      System.out.println("p1 is " + p1);
      System.out.println("p2 is " + p2);
      
      // display p1 distance from origin
      System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());
      
      // translate p1 to (9, 4)
      p1.translate(1, 2);
      // translate p2 to (3, 13)
      p2.translate(-1, 10);
      
      // display the two Point objects' state after translate
      System.out.println("p1 is now " + p1);
      System.out.println("p2 is now " + p2);
	}
}

