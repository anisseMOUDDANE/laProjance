package models.deplacement;

import models.Map;
import models.Position;
import models.Case;

public class DeplacementGauche extends DeplacementAdapter{
    public DeplacementGauche(Position position, Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        Case[][] mapArray = Map.getInstance().getMap();

        int posX = position.getX();
        int posY = position.getY();

        if(mapArray[posX][posY].getHoteEnfant() != null && mapArray[posX - 1][posY].isBloquant() == false ) {
            mapArray[posX][posY].getHoteEnfant().setPosition(new Position(posX - 1, posY));
            mapArray[posX][posY].setHoteEnfant(null);
        }
        

        // System.out.println("deplacement bas");
    }

}
