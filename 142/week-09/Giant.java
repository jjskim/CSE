import java.awt.Color;

public class Giant extends Critter {

   private int age;
   private Color color;
   private String string;
   
   public Giant() {
      age = 0;
      color = Color.GRAY;
      string = "fee";
   }

   public Action getMove(CritterInfo info) {
      age++;
      if (age == 6) {
         age = 0;
         if (string.equalsIgnoreCase("fee")) {
            string = "fie";
         } else if (string.equalsIgnoreCase("fie")) {
            string = "foe";
         } else if (string.equalsIgnoreCase("foe")) {
            string = "fum";
         } else {
            string = "fee";
         }
      }
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.RIGHT;
      }
   }
   
   public Color getColor() {
      return color;
   }
   
   public String toString() {
      return string;
   }
}