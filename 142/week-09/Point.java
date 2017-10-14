public class Point {
	int x;
	int y;
	
	public double distanceFromOrigin() {
		double dist = Math.sqrt(x*x + y*y);
		return dist;
	}
	
	public double distance(Point other) {
		int dx = other.x - x;
		int dy = other.y - y;
		double dist = Math.sqrt(dx*dx + dy*dy);
		return dist;
	}
	
	public void translate(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public String toString() {
		return "Point[x=" + this.x + ",y=" + this.y + "]";
	}
   
   public int quadrant() {
      if (x > 0) {
         if (y > 0) {
            return 1;
         } else if (y < 0){
            return 4;
         }
      } else if (x < 0) {
         if (y > 0) {
            return 2;
         } else if (y < 0) {
            return 3;
         }
      }
      return 0;
   }
   
   public void flip() {
      int flippedX = this.x * -1;
      int flippedY = this.y * -1;
      this.x = flippedY;
      this.y = flippedX;
   }
   
   public int manhattanDistance(Point other) {
      return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
   }
}
