package models.deplacement;

import models.Case;
import models.Map;
import models.Position;

public class DeplacementBougePas extends DeplacementAdapter{
    public DeplacementBougePas(Position position , Map map) {
        super(position, map);
    }

    @Override
    public void seDeplacer(Position position) {
        System.out.println("ne bouge pas");
        Position positionOgre = Map.getInstance().getAngel().getPosition();
        System.out.println("positionOgre: " + positionOgre);
        /**
         * Si l'ogre est à côté de l'enfant, a 3 cases d'espace , l'enfant ne bouge pas
         */
        if (positionOgre.getX() == position.getX() && positionOgre.getY() == position.getY() + 1) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() && positionOgre.getY() == position.getY() - 1) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() + 1 && positionOgre.getY() == position.getY()) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() - 1 && positionOgre.getY() == position.getY()) {
            System.out.println("ne bouge pas");
        }
        else if (positionOgre.getX() == position.getX() && positionOgre.getY() == position.getY() + 2) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() && positionOgre.getY() == position.getY() - 2) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() + 2 && positionOgre.getY() == position.getY()) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() - 2 && positionOgre.getY() == position.getY()) {
            System.out.println("ne bouge pas");
        }
        else if (positionOgre.getX() == position.getX() && positionOgre.getY() == position.getY() + 3) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() && positionOgre.getY() == position.getY() - 3) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() + 3 && positionOgre.getY() == position.getY()) {
            System.out.println("ne bouge pas");
        } else if (positionOgre.getX() == position.getX() - 3 && positionOgre.getY() == position.getY()) {
            System.out.println("ne bouge pas");
        }
        else {
            Case[][] mapArray = Map.getInstance().getMap();

            int posX = position.getX();
            int posY = position.getY();
            int aleatoire = (int)(Math.random() * 4);

            // si aleatoire = 0, déplacement vers la droite
            if(aleatoire == 0 && mapArray[posX][posY].getHoteEnfant() != null && mapArray[posX + 1][posY].isBloquant() == false ) {
                mapArray[posX][posY].getHoteEnfant().setPosition(new Position(posX + 1, posY));
                mapArray[posX][posY].setHoteEnfant(null);
            }
            // si aleatoire = 1, déplacement vers le bas
            else if(aleatoire == 1 && mapArray[posX][posY].getHoteEnfant() != null && mapArray[posX][posY + 1].isBloquant() == false ) {
                mapArray[posX][posY].getHoteEnfant().setPosition(new Position(posX, posY + 1));
                mapArray[posX][posY].setHoteEnfant(null);
            }
            // si aleatoire = 2, déplacement vers la gauche
            else if(aleatoire == 2 && mapArray[posX][posY].getHoteEnfant() != null && mapArray[posX - 1][posY].isBloquant() == false ) {
                mapArray[posX][posY].getHoteEnfant().setPosition(new Position(posX - 1, posY));
                mapArray[posX][posY].setHoteEnfant(null);
            }
            // si aleatoire = 3, déplacement vers le haut
            else if(aleatoire == 3 && mapArray[posX][posY].getHoteEnfant() != null && mapArray[posX][posY - 1].isBloquant() == false ) {
                mapArray[posX][posY].getHoteEnfant().setPosition(new Position(posX, posY - 1));
                mapArray[posX][posY].setHoteEnfant(null);
            }
        }

    }

}
