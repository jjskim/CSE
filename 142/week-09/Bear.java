import java.awt.Color;

public class Bear extends Critter {

   private int age;
   private Color color;
   private String string;
   
   public Bear(boolean polar) {
      age = 0;
      if (polar) {
         color = Color.WHITE;
      } else {
         color = Color.BLACK;
      }
      string = "/";
   }
   
   public Action getMove(CritterInfo info) {
      age++;
      if (age % 2 == 0) {
         string = "/";
      } else {
         string = "\\";
      }
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.LEFT;
      }
   }
   
   public Color getColor() {
      return color;
   }
   
   public String toString() {
      return string;
   }
}