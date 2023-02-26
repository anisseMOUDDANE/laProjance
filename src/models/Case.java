package models;

import models.Enfant.TypeCase;
import static utilies.Utilities.print;
import java.util.Arrays;

public class Case {
    private int x;
    private int y;
    TypeCase type;
    private boolean isBloquant;

    private int[] hotes;

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
        this.hotes = new int[2];
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
                ", hotes=" + Arrays.toString(hotes) +
                '}';
    }

    public int[] getHotes() {
        return hotes;
    }

    public void setHotes(int[] hotes) {
        this.hotes = hotes;
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
