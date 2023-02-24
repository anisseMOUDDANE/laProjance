package models;
import models.Case;

/**
 * • Une carte
 */
public class Map {
    private int tailleX;
    private int tailleY;
    private Case[][] map;


    public Map(int tailleX, int tailleY) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;
        this.map = new Case[tailleX][tailleY];
    }

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public Case[][] getMap() {
        return map;
    }

    public void setMap(Case[][] map) {
        this.map = map;
    }

    public void setTailleX(int tailleX) {
        this.tailleX = tailleX;
    }

    public void setTailleY(int tailleY) {
        this.tailleY = tailleY;
    }

    // genere une methode d'affichage de la map
    public void afficherMap() {
        for (int i = 0; i < tailleX; i++) {
            for (int j = 0; j < tailleY; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
