package models;

import java.util.Arrays;

public class Case {
    private int x;
    private int y;
    typeCase type;
    private boolean isBloquant;

    private int[] hotes;

    /**
     * • Des sols
     * • Des ponts
     * • Des arbres
     * • Des rochers
     * • De l’eau
     */
    private enum typeCase {
        SOL, PONT, ARBRE, ROCHER, EAU
    }

    public Case(int x, int y, typeCase type, boolean isBloquant) {
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

    public typeCase getType() {
        return type;
    }

    public void setType(typeCase type) {
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
}
