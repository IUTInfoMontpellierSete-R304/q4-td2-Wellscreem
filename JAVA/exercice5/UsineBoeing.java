package exercice5;

import java.util.ArrayList;

/**
 * 
 */
public class UsineBoeing extends Usine {


    public UsineBoeing() {
    }

    public Avion fabriquerAvion(String marqueAvion, String modeleAvion, ArrayList<Reacteur> reacteurs, Fuselage fuselage) {
        return new AvionBoeing(marqueAvion, modeleAvion, reacteurs, fuselage);
    }

    public Satellite fabriqueSatellite(String modeleSatellite) {
        return new SatelliteEspace(modeleSatellite);
    }

}