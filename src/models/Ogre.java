package models;

import models.Enfant.EnfantStandard;
import models.Enfant.EtatEnfant;
import models.deplacement.*;

import java.util.List;

public class Ogre implements Deblacable {
    private Position position;
    private TypeDeplacement typeDeplacement;

    public Ogre(Position position) {
        this.position = position;
        this.typeDeplacement = TypeDeplacement.HASARD;
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

    public void setTypeDeplacement(TypeDeplacement typeDeplacement) {
        this.typeDeplacement = typeDeplacement;
    }

    public DeplacementAdapter getTypeDeplacement() {
        return new DeplacementOgre(this.position,null);
    }


}

