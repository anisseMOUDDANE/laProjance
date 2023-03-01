package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantAvecInstrument{

    private EnfantStandard enfant;

    public EnfantAvecInstrument(EnfantStandard enfant) {
        this.enfant = enfant;
    }

    public void mettreChapeau() {
        System.out.println("Prendre son instrument");
    }

    public void seDeplacerVers(Position position) {
        enfant.seDeplacerVers(position);

    }

    public void mourir() {
        enfant.mourir();
    }
}
