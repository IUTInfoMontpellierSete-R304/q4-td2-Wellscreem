package exercice5;

import java.util.ArrayList;

/**
 * 
 */
public class UsineAribus extends Usine {

    public UsineAribus() {
    }


    public Avion fabriquerAvion(String marqueAvion, String modeleAvion, ArrayList<Reacteur> reacteurs, Fuselage fuselage) {
        return new AvionAirbus(marqueAvion, modeleAvion, reacteurs, fuselage);
    }


    public Satellite fabriqueSatellite(String modeleSatellite) {
        return new SatelliteTerrestre(modeleSatellite);
    }

}