package models;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return Objects.equals(position, position1.position);
    }

}
