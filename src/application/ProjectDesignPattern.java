package application;

import models.Map;
import utilies.Utilities;

import static utilies.Utilities.print;

public class ProjectDesignPattern {
    public static void main(String[] args) {
        print("La projance est en cours\n");
        Map map = new Map(20,80);
        map.remplirMap();
        map.afficherMap();
    }
}
