// This class represents a Point on the cartesian plane
public class Point {
    int x;
    int y;
   
    // Translates this point by the given dx and dy
    public void translate(int dx, int dy) {
	x += dx;
	y += dy;
    }
}