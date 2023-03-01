package application;

import utilies.Utilities;
import models.Map;
import models.Partie;
import models.Position;
import models.Enfant.EnfantStandard;
import models.Ogre;
import java.util.ArrayList;
import java.util.Arrays;


import static utilies.Utilities.print;

public class ProjectDesignPattern {
    public static void main(String[] args) {

        EnfantStandard e = new EnfantStandard(1, 1);
        EnfantStandard e2 = new EnfantStandard(9,3);
        EnfantStandard e3 = new EnfantStandard(7,5);
        EnfantStandard e4 = new EnfantStandard(5,4);
        Ogre angel = new Ogre(new Position(10,10));
        ArrayList<EnfantStandard> enfants = new ArrayList<>();
        enfants.add(e);
        enfants.add(e2);
        enfants.add(e3);
        enfants.add(e4);

        System.out.println("La projance est en cours");
        Map newMap = Map.getInstance();


        Partie nouvellePartie = new Partie(newMap, enfants, angel);
        nouvellePartie.jouer();
    }
}
