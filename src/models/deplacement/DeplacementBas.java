package models.deplacement;

import models.Map;
import models.Position;

public class DeplacementBas extends DeplacementAdapter{
    public DeplacementBas(Position position , Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        System.out.println("deplacement bas");
    }

}
