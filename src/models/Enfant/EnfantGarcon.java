package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantGarcon {

    private EnfantStandard enfant;

    public EnfantGarcon(EnfantStandard enfant) {
        this.enfant = enfant;
        enfant.setTypeEnfant(TypeEnfant.GARCON);
    }

    public void etreUnGarcon() {
        System.out.println("Enfant garcon montre que c'est un garcon");
    }

    public void seDeplacerVers(Position position) {
        enfant.seDeplacerVers(position);

    }

    public void mourir() {
        enfant.mourir();
    }

}
