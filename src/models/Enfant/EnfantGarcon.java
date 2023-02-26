package models.Enfant;

import models.Position;
import models.deplacement.Enfant;

public class EnfantGarcon implements Enfant {

    private Enfant enfant;

    public EnfantGarcon(Enfant enfant) {
        this.enfant = enfant;
    }

    public void etreUnGarcon() {
        System.out.println("Enfant garcon montre que c'est un garcon");
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
