// This client program shows an example of creating and using
// Point objects created from our Point class template.
public class PointClient {
   public static void main(String[] args) {
   	Point p1 = new Point();
   	p1.x = 5;
   	p1.y = 10;
         
   	Point p2 = new Point();
   	p2.x = 3;
   	p2.y = -8;
         
   	System.out.println("p1 = " + p1.x + ", " + p1.y);
   	System.out.println("p2 = " + p2.x + ", " + p2.y);
    
   	p1.translate(2, 3); // translate(p1, 2, 3);
   	p2.translate(4, 8); // translate(p2, 4, 8);
   
   	System.out.println("p1 = " + p1.x + ", " + p1.y);
   	System.out.println("p2 = " + p2.x + ", " + p2.y);
   }
}