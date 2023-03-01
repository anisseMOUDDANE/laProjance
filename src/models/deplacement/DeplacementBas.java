package models.deplacement;

import models.Map;
import models.Position;
import models.Case;


public class DeplacementBas extends DeplacementAdapter{
    public DeplacementBas(Position position , Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        Case[][] mapArray = Map.getInstance().getMap();

        int posX = position.getX();
        int posY = position.getY();

        if(mapArray[posX][posY].getHoteEnfant() != null && mapArray[posX][posY + 1].isBloquant() == false ) {
            mapArray[posX][posY].getHoteEnfant().setPosition(new Position(posX, posY + 1));
            mapArray[posX][posY].setHoteEnfant(null);
        }

        // System.out.println("deplacement bas");
    }

}
