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
        setTailleX();
        setTailleY();
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
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Veuillez choisir l'axe x");
        int x = scan1.nextInt();
        this.tailleX = x;
    }

    public void setTailleY() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Veuillez choisir l'axe y");
        int y = scan2.nextInt();
        this.tailleY = y;
    }

    public void genererMap() {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        System.out.println(this.tailleX);
        System.out.println(this.tailleY);
        while(!stop) {
            for (int i = 0; i < tailleX; i++) {
                for (int j = 0; j < tailleY; j++) {
                    this.map[i][j] = new Case(i, j, randomType());
                    System.out.print(getEmoji(this.map[i][j]));
                    System.out.print(" ");
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
        if (random <= 0.8) {
             caseType = TypeCase.SOL;
        }
        else if (random > 0.8 && random <= 0.85){
            caseType = TypeCase.PONT;
        }
        else if (random > 0.85 && random <= 0.9){
            caseType = TypeCase.ARBRE;
        }
        else if (random > 0.9 && random <= 0.95){
            caseType = TypeCase.ROCHER;
        }
        else if (random > 0.95 && random <= 1){
            caseType = TypeCase.EAU;
        }
        return caseType;
    }

    public String getEmoji(Case myCase) {
        String returnCase = null;
        if(myCase.getType() == TypeCase.SOL){
            returnCase = "🌫";
        }
        else if(myCase.getType() == TypeCase.PONT){
            returnCase = "🥷";
        }
        else if(myCase.getType() == TypeCase.ARBRE){
            returnCase = "🫄";
        }
        else if(myCase.getType() == TypeCase.ROCHER){
            returnCase = "🫃";
        }
        else if(myCase.getType() == TypeCase.EAU){
            returnCase = "🫃";
        }
        return returnCase;
    }

     public void effacerMap() {
        //Avant nouvelle position de chaque personnage
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }

    }
