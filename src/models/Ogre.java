package models;

import models.Enfant.EnfantStandard;
import models.Enfant.EtatEnfant;
import models.deplacement.Deblacable;
import models.deplacement.Enfant;
import models.deplacement.TypeDeplacement;

import java.util.List;

public class Ogre implements Deblacable {
    private Position position;

    public Ogre(Position position) {
        this.position = position;
    }

    public void seDeplacer(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void mangerEnfant(EnfantStandard enfant, List<EnfantStandard> enfants) {
        enfants.remove(enfant);
        enfant.setEtat(EtatEnfant.TOMBE);
    }

    public void chasser(List<EnfantStandard> enfants) {

    }


}

