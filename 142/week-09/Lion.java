import java.awt.Color;
import java.util.Random;

public class Lion extends Critter {
   
   private int age;
   private Color color;
   private String string;
   private Random r;
   private int numberRoll;

   public Lion() {
      age = 0;
      string = "L";
      r = new Random();
      randomColor(this);
   }

   public Action getMove(CritterInfo info) {
      age++;
      if (age == 3) {
         age = 0;
         randomColor(this);
      }
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      } else if (info.getFront() == Neighbor.SAME) {
         return Action.RIGHT;
      } else {
         return Action.HOP;
      }
   }
   
   public Color getColor() {
      return color;
   }
   
   public String toString() {
      return string;
   }
   
   private void randomColor(Lion lion) {
      lion.numberRoll = lion.r.nextInt(3);
      if (lion.numberRoll == 0) {
         lion.color = Color.RED;
      } else if (lion.numberRoll == 1) {
         lion.color = Color.GREEN;
      } else {
         lion.color = Color.BLUE;
      }
   }
}