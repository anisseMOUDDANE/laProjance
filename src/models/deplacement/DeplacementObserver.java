package models.deplacement;

import models.deplacement.Enfant;

import java.util.Observable;
import java.util.Observer;

public class DeplacementObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Enfant) {
            Enfant enfant = (Enfant) o;
            String direction = (String) arg;
            System.out.println("L'enfant se déplace vers " + direction + ".");
        }
    }

}
