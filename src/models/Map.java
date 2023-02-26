package models;
import models.Case;

import java.util.Scanner;

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

    public void setTailleX() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez choisir l'axe x");
        int x = scan.nextInt();
        this.tailleX = x;
    }

    public void setTailleY() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez choisir l'axe y");
        int y = scan.nextInt();
        this.tailleY = y;
    }

    // genere une methode d'affichage de la map
    public void afficherMap() {
        Scanner scanner = new Scanner(System.in);
        setTailleX();
        setTailleY();
        boolean stop = false;
        while(!stop) {
        for (int i = 0; i < tailleX; i++) {
            for (int j = 0; j < tailleY; j++) {
                //System.out.print(map[i][j]);
                System.out.println("-");
            }
            System.out.println();
        }
        System.out.println("Appuyez sur Entrée pour arrêter l'affichage");
        if(scanner.nextLine().isEmpty()) {
            stop = true;
        }
      }
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
     }
    }