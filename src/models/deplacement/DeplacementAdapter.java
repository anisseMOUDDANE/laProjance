package models.deplacement;

import models.Map;
import models.Position;

public abstract class DeplacementAdapter implements Deblacable{
    protected Position position;
    protected Map map;

    public DeplacementAdapter(Position position,  Map map) {
        this.position = position ;
        this.map = map;
    }


   @Override
    public abstract void seDeplacer(Position position);
}
