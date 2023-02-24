package models;

import java.util.ArrayList;

public class Position {
   private ArrayList<Integer> position;

    public Position(int x, int y) {
        this.position = new ArrayList<>();
        this.position.add(x);
        this.position.add(y);
    }

    public ArrayList<Integer> getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Position{" +
                "position=" + position +
                '}';
    }
}
