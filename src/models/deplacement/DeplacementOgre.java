package models.deplacement;

import models.Case;
import models.Map;
import models.Position;

public class DeplacementOgre extends DeplacementAdapter{


    public DeplacementOgre(Position position, Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        // System.out.println("deplacement aleatoire");
        Case[][] mapArray = Map.getInstance().getMap();

        int posX = position.getX();
        int posY = position.getY();
        // crée un entier au hasard entre 0 et 3
        int aleatoire = (int)(Math.random() * 4);

        // si aleatoire = 0, déplacement vers la droite
        if(aleatoire == 0 && mapArray[posX][posY].getHoteAngel() != null && mapArray[posX + 1][posY].isBloquant() == false ) {
            mapArray[posX][posY].getHoteAngel().setPosition(new Position(posX + 1, posY));
            mapArray[posX][posY].setHoteOgre(null);
        }
        // si aleatoire = 1, déplacement vers le bas
        else if(aleatoire == 1 && mapArray[posX][posY].getHoteAngel() != null && mapArray[posX][posY + 1].isBloquant() == false ) {
            mapArray[posX][posY].getHoteAngel().setPosition(new Position(posX, posY + 1));
            mapArray[posX][posY].setHoteOgre(null);
        }
        // si aleatoire = 2, déplacement vers la gauche
        else if(aleatoire == 2 && mapArray[posX][posY].getHoteAngel() != null && mapArray[posX - 1][posY].isBloquant() == false ) {
            mapArray[posX][posY].getHoteAngel().setPosition(new Position(posX - 1, posY));
            mapArray[posX][posY].setHoteOgre(null);
        }
        // si aleatoire = 3, déplacement vers le haut
        else if(aleatoire == 3 && mapArray[posX][posY].getHoteAngel() != null && mapArray[posX][posY - 1].isBloquant() == false ) {
            mapArray[posX][posY].getHoteAngel().setPosition(new Position(posX, posY - 1));
            mapArray[posX][posY].setHoteOgre(null);
        }

    }

}
