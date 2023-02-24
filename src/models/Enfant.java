package models;

import models.deplacement.TypeDeplacement;

import java.util.ArrayList;

public class Enfant {
    public static int NB_ENFANTS = 0;
    private Position position;
    private TypeEnfant typeEnfant;
    private EtatEnfant etat;
    private TypeDeplacement typeDeplacement;


    public enum EtatEnfant {
        VIVANT,
        TOMBE,
        POUSSIERE,
        OSSEMENTS
    }

    public enum TypeEnfant {
        STANDARD,
        FILLE,
        GARCON,
        CHAPEAU,
        INSTRUMENT
    }

    public Enfant(int x, int y, TypeEnfant type) {
        this.position = new Position(x, y);
        this.typeEnfant = type;
        this.etat = EtatEnfant.VIVANT;
    }

    // Getters et setters

    public TypeEnfant getTypeEnfant() {
        return this.typeEnfant;
    }

    public void setTypeEnfant(TypeEnfant type) {
        this.typeEnfant = type;
    }

    public EtatEnfant getEtat() {
        return this.etat;
    }

    public void setEtat(EtatEnfant etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Enfant{" +
                "position=" + position +
                ", typeEnfant=" + typeEnfant +
                ", etat=" + etat +
                '}';
    }

    /**
     * @TODO Gerer le changement d'état aléatoirement (voir le sujet)
     */
    public void mourrir() {
       // this.etat = nouvelle etat
        NB_ENFANTS--;
        if(NB_ENFANTS == 0) {
            System.out.println("Vous avez perdu");
            System.exit(0);
        }
        if(NB_ENFANTS<0){
            throw new RuntimeException("Nombre d'enfants négatif");
        }

    }

    public ArrayList<Integer> getPosition() {
        return this.position.getPosition();
    }

    public static int getNbEnfants() {
        return NB_ENFANTS;
    }

}
