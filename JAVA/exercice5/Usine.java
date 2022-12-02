package exercice5;

import java.util.ArrayList;

/**
 * 
 */
public abstract class Usine {

    public Usine() {
    }


    public abstract Avion fabriquerAvion(String marqueAvion, String modeleAvion, ArrayList<Reacteur> reacteurs, Fuselage fuselage);

    public abstract Satellite fabriqueSatellite(String modeleSatellite);

}