import java.awt.*; // for Color

// Chameleon is a Critter that always hops, has a String representation of a '@' symbol,
// starts out as Cyan for color and alternates between Black and Cyan for every other move
public class Chameleon extends Critter {
    private int moveCount;
    
    public Chameleon() {
        moveCount = 0;
    }
    
    public String toString() {
        return "@";
    }
    
    public Action getMove(CritterInfo info) {
        moveCount++;
        return Action.HOP;
    }
    
    public Color getColor() {
        if (moveCount % 2 == 1) {
            return Color.BLACK;
        } else {
            return Color.CYAN;
        }    
    }
}