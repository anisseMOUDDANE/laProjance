package models;
import models.Case;

import java.util.Scanner;
import java.util.Random;

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
    public void genererMap() {
        Scanner scanner = new Scanner(System.in);
        setTailleX();
        setTailleY();
        boolean stop = false;
        while(!stop) {
            for (int i = 0; i < tailleX; i++) {
                for (int j = 0; j < tailleY; j++) {
                    this.map[i][j] = new Case(i, j, randomType());
                    //System.out.print("-");
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

     public void refreshMap() {

     }

     // faire une classe random avec dedans randomType et isBloquant

     public TypeCase randomType() {
        TypeCase caseType = null;
        Random r = new Random();
        double random = (r.nextInt(11)) / 10.0;
        if (random <= 0.6) {
             caseType = TypeCase.SOL;
        }
        else if (random > 0.6 && random <= 0.7){
            caseType = TypeCase.PONT;
        }
        else if (random > 0.7 && random <= 0.8){
            caseType = TypeCase.ARBRE;
        }
        else if (random > 0.8 && random <= 0.9){
            caseType = TypeCase.ROCHER;
        }
        else if (random > 0.9 && random <= 1){
            caseType = TypeCase.EAU;
        }
        return caseType;
    }


     public void effacerMap() {
        //Avant nouvelle position de chaque personnage
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }

    }
