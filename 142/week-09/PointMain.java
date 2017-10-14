/*
CSE 142 Lab 8

This client program uses Point objects.
Expected output:

p1 (81, 21) quadrant = 1
p2 (-52, 32) quadrant = 2
p3 (-93, -13) quadrant = 3
p4 (64, -44) quadrant = 4
p0 (0, 0) quadrant = 0

p1 after flip = (-21, -81)
p2 after flip = (-32, 52)
p3 after flip = (13, 93)
p4 after flip = (44, -64)
p0 after flip = (0, 0)
*/

public class PointMain {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 81;
		p1.y = 21;
		Point p2 = new Point();
		p2.x = -52;
		p2.y = 32;
		Point p3 = new Point();
		p3.x = -93;
		p3.y = -13;
		Point p4 = new Point();
		p4.x = 64;
		p4.y = -44;
		Point p0 = new Point();
		p0.x = 0;
		p0.y = 0;
		
		// this code tests the quadrant method
		System.out.println("p1 " + p1 + " quadrant = " + p1.quadrant());
		System.out.println("p2 " + p2 + " quadrant = " + p2.quadrant());
		System.out.println("p3 " + p3 + " quadrant = " + p3.quadrant());
		System.out.println("p4 " + p4 + " quadrant = " + p4.quadrant());
		System.out.println("p0 " + p0 + " quadrant = " + p0.quadrant());
		System.out.println();
		
		// this code tests the flip method
		p1.flip();
		System.out.println("p1 after flip = " + p1);
		p2.flip();
		System.out.println("p2 after flip = " + p2);
		p3.flip();
		System.out.println("p3 after flip = " + p3);
		p4.flip();
		System.out.println("p4 after flip = " + p4);
		p0.flip();
		System.out.println("p0 after flip = " + p0);
	}
}

