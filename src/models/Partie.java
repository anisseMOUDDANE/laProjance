package models;

import models.Enfant.EnfantStandard;
import models.Enfant.EtatEnfant;

import java.util.List;
import java.util.ArrayList;
import models.Map;
import models.Ogre;

public class Partie {
    private Map map;
    private ArrayList<EnfantStandard> enfants;
    private Ogre angel;

    public Partie(Map map, ArrayList<EnfantStandard> enfants, Ogre angel) {
        this.map = map;
        this.enfants = enfants;
        this.angel = angel;
    }

    public void jouer() {

        map.genererMap(this.map, this.enfants, this.angel);
    
        while(true) {
       map.refreshMap();
       System.out.println("\n\n\n");
        int cpt = 0;
        while (cpt < enfants.size()) {
            for (EnfantStandard enfant : enfants) {
                enfant.getTypeDeplacement().seDeplacer(enfant.getPosition());
                angel.seDeplacer(angel.getPosition());
                //System.out.println("Enfant : " + enfant.getPosition());
                //System.out.println("Ogre : " + angel.getPosition());
                if (enfant.getPosition().equals(angel.getPosition())) {
                    System.out.println("MAANNNGEEERR__--------");
                    enfants.remove(enfant);
                    enfant.setEtat(randomMort());
                    break;
                }
            }
            cpt++;
        }

        try {
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }    
        
        map.effacerMap();

    }

}

public EtatEnfant randomMort() {
    EtatEnfant typeMort = null;
    double random = Math.round(Math.random() * 100) / 100.0;
    if ((random > 0 && random <= 0.30)) {
        typeMort = EtatEnfant.OSSEMENTS;
    }
    else if ((random > 0.30 && random <= 0.60)) {
        typeMort = EtatEnfant.POUSSIERE;
   }
    else if ((random > 0.60 && random <= 1)) {
        typeMort = EtatEnfant.TOMBE;
   }
    return typeMort;
}

}


