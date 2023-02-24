package models;

import models.deplacement.Enfant;
import models.deplacement.TypeDeplacement;

import java.util.ArrayList;

public class EnfantStandard implements Enfant {
    public static int NB_ENFANTS = 0;
    private Position position;
    private EtatEnfant etat;
    private TypeDeplacement typeDeplacement;

    @Override
    /**
     * @TODO Gerer le deplacment
     */
    public void seDeplacerVers(Position position) {

    }


    public enum EtatEnfant {
        VIVANT,
        TOMBE,
        POUSSIERE,
        OSSEMENTS
    }



    public EnfantStandard(int x, int y) {
        this.position = new Position(x, y);
        this.etat = EtatEnfant.VIVANT;
    }

    // Getters et setters


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
                ", etat=" + etat +
                '}';
    }

    /**
     * @TODO Gerer le changement d'état aléatoirement (voir le sujet)
     */
    public void mourir() {
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
