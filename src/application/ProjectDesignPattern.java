package application;

import models.Enfant.EnfantStandard;
import models.Map;
import models.Ogre;
import models.Partie;
import models.Position;
import models.deplacement.Enfant;
import utilies.Utilities;

import java.util.ArrayList;
import java.util.List;

import static utilies.Utilities.print;

public class ProjectDesignPattern {
    public static void main(String[] args) {
        print("La projance est en cours\n");
        Map map = new Map(20,80);
        map.remplirMap();
        map.afficherMap();
        EnfantStandard e = new EnfantStandard(2,3);
        e.getTypeDeplacement().seDeplacer(new Position(3,4));

        EnfantStandard e2 = new EnfantStandard(1,7);
        EnfantStandard e3 = new EnfantStandard(5,8);
        EnfantStandard e4 = new EnfantStandard(6,9);
        Ogre ogre = new Ogre(new Position(2,3));
        ArrayList<EnfantStandard> enfants = new ArrayList<>();
        enfants.add(e);
        enfants.add(e2);
        enfants.add(e3);
        enfants.add(e4);
        Partie partie = new Partie(map, enfants, ogre);
        partie.jouer();


    }
}
