import java.awt.*;
import java.util.*;

public class LabTA extends Critter {

   private int turnCount;
   private Random r;
   
   public LabTA() {
      this.turnCount = 0;
      this.r = new Random();
   }

   public Action getMove(CritterInfo info) {
      turnCount++;
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         int direction = r.nextInt(2);
         if (direction == 1) {
            return Action.LEFT;
         } else {
            return Action.RIGHT;
         }
      }
   }

   public Color getColor() {
      if (turnCount % 2 == 0) {
         return Color.MAGENTA;
      } else {
         return Color.WHITE;
      }
   }

   public String toString() {
      return ":-)";
   }
}