package models;

import static utilies.Utilities.print;
import java.util.Arrays;

import models.Enfant.EnfantStandard;

public class Case {
    private int x;
    private int y;
    TypeCase type;
    private boolean isBloquant;

    private EnfantStandard hoteEnfant;
    private Ogre hoteAngel;

    /**
     * • Des sols
     * • Des ponts
     * • Des arbres
     * • Des rochers
     * • De l’eau
     */

    /**
     *
     * @param x
     * @param y
     * @param type
     */
    public Case(int x, int y, TypeCase type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.hoteEnfant = null;
        this.hoteAngel = null;
        /*
        * Si c'est un arbre, un rocher de l'eau, alors isBloquant = true
        * Sinon isBloquant = false
        * */
        switch (type) {
            case SOL:
                this.isBloquant = false;
                break;
            case PONT:
                this.isBloquant = false;
                break;
            case ARBRE:
                this.isBloquant = true;
                break;
            case ROCHER:
                this.isBloquant = true;
                break;
            case EAU:
                this.isBloquant = true;
                break;
        }

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isBloquant() {
        return isBloquant;
    }

    public void setBloquant(boolean bloquant) {
        isBloquant = bloquant;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public TypeCase getType() {
        return type;
    }

    public void setType(TypeCase type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Case{" +
                "x=" + x +
                ", y=" + y +
                ", type=" + type +
                ", isBloquant=" + isBloquant +
                ", hotes=" + hoteEnfant +
                '}';
    }

    public EnfantStandard getHoteEnfant() {
        return hoteEnfant;
    }

    public Ogre getHoteAngel() {
        return hoteAngel;
    }

    public void setHoteEnfant(EnfantStandard hoteEnfant) {
        this.hoteEnfant = hoteEnfant;
    }

    public void setHoteOgre(Ogre hoteOgre) {
        this.hoteAngel = hoteOgre;
    }

    public Position getPosition() {
        return new Position(x, y);
    }

    public void afficherCase() {
        switch (type) {
            case SOL:
                print(" ");
                break;
            case PONT:
                print("P");
                break;
            case ARBRE:
                print("#");
                break;
            case ROCHER:
                print("R");
                break;
            case EAU:
                print("E");
                break;
            default:
                print(" ");
                break;
        }
    }

}
