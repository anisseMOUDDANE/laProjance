package models.deplacement;

import models.Map;
import models.Position;

public class DeplacementBougePas extends DeplacementAdapter{
    public DeplacementBougePas(Position position , Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        //System.out.println("ne bouge pas");
    }

}
