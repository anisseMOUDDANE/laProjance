package models.deplacement;

import models.Map;
import models.Position;

public class DeplacementHaut extends DeplacementAdapter{
    public DeplacementHaut(Position position, Map map) {
        super(position , map);
    }

    @Override
    public void seDeplacer(Position position) {
        System.out.println("deplacement Haut");
    }

}
