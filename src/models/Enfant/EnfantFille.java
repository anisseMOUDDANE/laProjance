package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantFille {

    private EnfantStandard enfant;

    public EnfantFille(EnfantStandard enfant) {
        this.enfant = enfant;
    }

    public void etreUneFille() {
        System.out.println("Enfant fille montre que c'est une fille");
    }

    public void seDeplacerVers(Position position) {
        enfant.seDeplacerVers(position);

    }

    public void mourir() {
        enfant.mourir();
    }
}
