package models.deplacement;

import models.Map;
import models.Position;

public class DeplacementGauche extends DeplacementAdapter{
    public DeplacementGauche(Position position, Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        System.out.println("deplacement Gauche");
    }

}
