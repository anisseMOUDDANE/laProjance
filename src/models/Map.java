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


    public Map() {
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
        scan.close();
    }

    public void setTailleY() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez choisir l'axe y");
        int y = scan.nextInt();
        this.tailleY = y;
        scan.close();
    }

    // genere une methode d'affichage de la map
    public void afficherMap() {
        Scanner scanner = new Scanner(System.in);
        setTailleX();
        setTailleY();
        boolean stop = false;
        while(!stop) {
            for (int j = 0; j < tailleY; j++) {
                for (int k = 0; k < tailleX; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        System.out.println("Appuyez sur Entrée pour arrêter l'affichage");
        if(scanner.nextLine().isEmpty()) {
            stop = true;
            scanner.close();
        }
      }
      effacerMap();
     }

     public void effacerMap() {
        //Avant nouvelle position de chaque personnage 
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }
     

    }
