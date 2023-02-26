package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantFille implements Enfant {

    private Enfant enfant;

    public EnfantFille(Enfant enfant) {
        this.enfant = enfant;
    }

    public void etreUneFille() {
        System.out.println("Enfant fille montre que c'est une fille");
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
