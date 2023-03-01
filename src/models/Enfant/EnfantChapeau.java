package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantChapeau {

    private EnfantStandard enfant;

    public EnfantChapeau(EnfantStandard enfant) {
        this.enfant = enfant;
        enfant.setTypeEnfant(TypeEnfant.AVEC_CHAPEAU);
    }

    public void mettreChapeau() {
        System.out.println("Enfant chapeau met un chapeau sur sa tête");
    }

    public void seDeplacerVers(Position position) {
        enfant.seDeplacerVers(position);

    }

    public void mourir() {
        enfant.mourir();
    }
}
