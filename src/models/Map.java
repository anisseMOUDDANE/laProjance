package models;
import models.Case;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import models.Enfant.EnfantStandard;
import models.Enfant.EtatEnfant;
import models.Enfant.TypeEnfant;
import models.deplacement.Enfant;

/**
 * • Une carte
 */
public class Map {

    private int tailleX;
    private int tailleY;
    private Case[][] map;
    public static Map instanceMap = null;
    public ArrayList<EnfantStandard> enfants;

    private Map() {
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

    public static Map getInstance() {
        if (instanceMap == null) {
          instanceMap = new Map();
        }
        return instanceMap;
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

    public void genererMap(Map map, ArrayList<EnfantStandard> listeEnfants, Ogre angel) {
        //System.out.print(listeEnfants);
        //Scanner scanner = new Scanner(System.in);
        //boolean stop = false;
        //System.out.println(this.tailleX);
        //System.out.println(this.tailleY);
        //while(!stop) {
            this.enfants = listeEnfants;
            for (int i = 0; i < tailleX; i++) {
                for (int j = 0; j < tailleY; j++) {
                    this.map[i][j] = new Case(i, j, randomType());
                    /* 
                    for(EnfantStandard enfant : listeEnfants) {
                        if(this.map[i][j].getPosition().equals(enfant.getPosition())){
                            this.map[i][j].setHoteEnfant(enfant);
                            System.out.print(getEmoji(this.map[i][j]));
                        }
                    } */
                        System.out.print(getEmoji(this.map[i][j]));
                        System.out.print(" ");
                }
                System.out.println();
            }
        //System.out.println("Appuyez sur Entrée pour arrêter l'affichage");
        //if(scanner.nextLine().isEmpty()) {
          //  stop = true;
          //  scanner.close();
        //}
      }
      //effacerMap();
     //}

     public void refreshMap () {
        for (int i = 0; i < tailleX; i++) {
            for (int j = 0; j < tailleY; j++) {
                for(EnfantStandard enfant : this.enfants) {
                    if(this.map[i][j].getPosition().equals(enfant.getPosition())){
                        this.map[i][j].setHoteEnfant(enfant);
                        System.out.print(getEmoji(this.map[i][j]));
                    }
                }
                    System.out.print(getEmoji(this.map[i][j]));
                    System.out.print(" ");
            }
            System.out.println();
        }
     }

     // faire une classe random avec dedans randomType et isBloquant

     public TypeCase randomType() {
        TypeCase caseType = null;
        double random = Math.round(Math.random() * 100) / 100.0;
        if (random <= 0.92) {
             caseType = TypeCase.SOL;
        }
        else if (random > 0.92 && random <= 0.94){
            caseType = TypeCase.PONT;
        }
        else if (random > 0.94 && random <= 0.96){
            caseType = TypeCase.ARBRE;
        }
        else if (random > 0.96 && random <= 0.98){
            caseType = TypeCase.ROCHER;
        }
        else if (random > 0.98 && random <= 1){
            caseType = TypeCase.EAU;
        }
        return caseType;
    }

    public String getEmojiCase(Case myCase) {
        
        String returnCase = null;
        if(myCase.getType() == TypeCase.SOL){
            returnCase = "🌫";
        }
        else if(myCase.getType() == TypeCase.PONT){
            returnCase = "🛤";
        }
        else if(myCase.getType() == TypeCase.ARBRE){
            returnCase = "🌶";
        }
        else if(myCase.getType() == TypeCase.ROCHER){
            returnCase = "🪨";
        }
        else if(myCase.getType() == TypeCase.EAU){
            returnCase = "🏖";
        }
        return returnCase;
    }

    public String getEmojiEnfant(EnfantStandard enfant) {
        String returnEnfant = null;
        if(enfant.getTypeEnfant() == TypeEnfant.AVEC_CHAPEAU){
            returnEnfant = "🎩";
        }
        if(enfant.getTypeEnfant() == TypeEnfant.AVEC_INSTRUMENT){
            returnEnfant = "🎸";
        }
        if(enfant.getTypeEnfant() == TypeEnfant.FILLE){
            returnEnfant = "👧";
        }
        if(enfant.getTypeEnfant() == TypeEnfant.GARCON){
            returnEnfant = "👦";
        }
        if(enfant.getTypeEnfant() == TypeEnfant.NORMAL){
            returnEnfant = "🎩";
        }
        return returnEnfant;
    }

    public String getEmojiAngel(Case caseE) {
        String returnAngel = "👹";
        return returnAngel;
    }

    public String getEmojiDead(EnfantStandard enfant) {
        String returnAngel = "👹";
        return returnAngel;
    }

    public String getEmoji(Case myCase) {
        if(myCase.getHoteEnfant() != null && myCase.getHoteEnfant().getEtat()==EtatEnfant.VIVANT){
            return getEmojiEnfant(myCase.getHoteEnfant());
        }
        //else if(myCase.getHoteEnfant().getEtat()==EtatEnfant.TOMBE){}
        else if(myCase.getHoteAngel() != null){
            return getEmojiAngel(myCase);
        }
        else return getEmojiCase(myCase);
    }

     public void effacerMap() {
        //Avant nouvelle position de chaque personnage
      System.out.print("\033[H\033[2J");
      System.out.flush();
     }

    }
