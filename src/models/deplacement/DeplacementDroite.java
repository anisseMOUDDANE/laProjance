package models.deplacement;

import models.Map;
import models.Position;

public class DeplacementDroite extends DeplacementAdapter{
    public DeplacementDroite(Position position , Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        System.out.println("deplacement droite");
    }

}
