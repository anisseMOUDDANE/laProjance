package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantChapeau implements Enfant {

    private Enfant enfant;

    public EnfantChapeau(Enfant enfant) {
        this.enfant = enfant;
    }

    public void mettreChapeau() {
        System.out.println("Enfant chapeau met un chapeau sur sa tête");
    }

    @Override
    public void seDeplacerVers(Position position) {
        enfant.seDeplacerVers(position);

    }

    @Override
    public void mourir() {
        enfant.mourir();
    }
}
