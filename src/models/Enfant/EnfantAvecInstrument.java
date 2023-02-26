package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantAvecInstrument implements Enfant {

    private Enfant enfant;

    public EnfantAvecInstrument(Enfant enfant) {
        this.enfant = enfant;
    }

    public void mettreChapeau() {
        System.out.println("Prendre son instrument");
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
