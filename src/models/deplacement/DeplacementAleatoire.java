package models.deplacement;

import models.Map;
import models.Position;

public class DeplacementAleatoire extends DeplacementAdapter{

    public DeplacementAleatoire(Position position , Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        System.out.println("deplacement aleatoire");
    }

}
