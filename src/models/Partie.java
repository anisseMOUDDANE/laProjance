package models;

import models.Enfant.EnfantStandard;
import models.Enfant.EtatEnfant;

import java.util.List;

public class Partie {
    private Map map;
    private List<EnfantStandard> enfants;
    private Ogre ogre;

    public Partie(Map map, List<EnfantStandard> enfants, Ogre ogre) {
        this.map = map;
        this.enfants = enfants;
        this.ogre = ogre;
    }

    public void jouer() {
        int cpt = 0;
        while (cpt < enfants.size()) {

            for (EnfantStandard enfant : enfants) {
                enfant.getTypeDeplacement().seDeplacer(enfant.getPosition());
                System.out.println("Enfant : " + enfant.getPosition());
                System.out.println("Ogre : " + ogre.getPosition());
                if (enfant.getPosition().equals(ogre.getPosition())) {
                    System.out.println("MAANNNGEEERR__--------");
                    enfants.remove(enfant);
                    enfant.setEtat(EtatEnfant.TOMBE);
                    break;
                }
            }
            cpt++;
        }
    }
}
