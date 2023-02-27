package models.Enfant;

import models.Position;
import models.deplacement.*;

import java.util.ArrayList;

public class EnfantStandard implements Enfant, Deblacable {
    public static int zoneBougePas = 3;
    public static int NB_ENFANTS = 0;
    private Position position;
    private EtatEnfant etat;
    private TypeDeplacement typeDeplacement;
    private TypeEnfant typeEnfant;

    @Override
    public void seDeplacerVers(Position position) {
        System.out.println("Je me déplace vers " + position);
    }


    /**
     * Constructeur de l'enfant
     * @param x
     * @param y
     */
    public EnfantStandard(int x, int y) {
        this.position = new Position(x, y);
        this.etat = EtatEnfant.VIVANT;
        // on vas ici generer un type de deplacement aleatoirement
        this.typeDeplacement = TypeDeplacement.values()[(int) (Math.random() * TypeDeplacement.values().length)];
        System.out.println("Type de deplacement de l'enfant : " + this.typeDeplacement);
    }






    // Getters et setters

    public static int getNbEnfants() {
        return NB_ENFANTS;
    }

    public EtatEnfant getEtat() {
        return this.etat;
    }

    public void setEtat(EtatEnfant etat) {
        this.etat = etat;
    }

    public String  getType() {
        return "EnfantStandard";
    }

    public TypeEnfant getTypeEnfant() {
        return typeEnfant;
    }

    public void setTypeEnfant(TypeEnfant typeEnfant) {
        this.typeEnfant = typeEnfant;
    }


    @Override
    public String toString() {
        return "Enfant{" +
                "position=" + position +
                ", etat=" + etat +
                '}';
    }

    /**
     * @TODO Gerer le changement d'état aléatoirement (voir le sujet)
     */
    public void mourir() {
       // this.etat = nouvelle etat a generer aleatoirement
        NB_ENFANTS--;
        if(NB_ENFANTS == 0) {
            System.out.println("Vous avez perdu");
            System.exit(0);
        }
        if(NB_ENFANTS<0){
            throw new RuntimeException("Nombre d'enfants négatif");
        }

    }

    public Position getPosition() {
        return this.position;
    }


    @Override
    public void seDeplacer(Position position){
        this.seDeplacerVers(position);
    }

    public DeplacementAdapter getTypeDeplacement() {
        //faire un switch sur le type de deplacement et retourner le bon type de deplacement
        switch (this.typeDeplacement){
            case HAUT:
                return new DeplacementHaut(this.position,null);
            case BAS:
                return new DeplacementBas(this.position,null);
            case GAUCHE:
                return new DeplacementGauche(this.position,null);
            case DROITE:
                return new DeplacementDroite(this.position,null);
            case HASARD:
                return new DeplacementAleatoire(this.position,null);
            case NE_BOUGE_PAS:
                return new DeplacementBougePas(this.position,null);
            default:
                return new DeplacementAleatoire(this.position,null);
        }
    }
}
