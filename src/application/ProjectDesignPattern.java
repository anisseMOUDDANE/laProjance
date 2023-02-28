package application;

import utilies.Utilities;
import models.Map;

import static utilies.Utilities.print;

public class ProjectDesignPattern {
    public static void main(String[] args) {
        print("La projance est en cours");
        Map objName = new Map();  
        objName.genererMap();
    }
}
