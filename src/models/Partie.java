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
        ArrayList<EnfantStandard> enfantsVivant = new ArrayList<>();
        //parcourir les enfants et ajoute les enfants vivant dans l'arraylist

        for(EnfantStandard enfant : enfants) {
            if(enfant.getEtat() == EtatEnfant.VIVANT) {
                enfantsVivant.add(enfant);
            }
        }

        while(enfantsVivant.size() != 0) {
            System.out.println("Enfant vivant : " + enfantsVivant.size());
       map.refreshMap();
       System.out.println("\n\n\n");
            for (EnfantStandard enfant : enfants) {
                if(enfant.getEtat() == EtatEnfant.VIVANT){
                    enfant.getTypeDeplacement().seDeplacer(enfant.getPosition());

                }
                angel.getTypeDeplacement().seDeplacer(angel.getPosition());
                //System.out.println("Enfant : " + enfant.getPosition());
                //System.out.println("Ogre : " + angel.getPosition());
                if (enfant.getPosition().equals(angel.getPosition())) {
                    System.out.println("MAANNNGEEERR__--------");
                    enfantsVivant.remove(enfant);
                    enfant.setEtat(randomMort());
                   /*
                   recuperer la case et la mettre en bloquant
                    */
                    map.getMap()[enfant.getPosition().getX()][enfant.getPosition().getY()].setBloquant(true);


                    break;
                }
            }

        try {
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }    
        
        map.effacerMap();
        //creee une arraylist de EnfantStandard
        //parroucir les enfants
        for (EnfantStandard enfant : enfants) {
            //ajouter les enfants vivant dans l'arraylist


        }
        if(enfantsVivant.size() == 0) {
            System.out.println("Vous avez perdu");
            break;
        }

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


