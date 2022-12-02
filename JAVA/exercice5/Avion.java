package exercice5;

import java.util.*;

/**
 * 
 */
public class Avion {



    /**
     * 
     */
    private String marque;

    /**
     * 
     */
    private String modele;

    /**
     * 
     */
    private ArrayList<Reacteur> listReacteur;

    private Fuselage fuselage;

    private String immatriculation;

    /**
     * Default constructor
     */
    public Avion(String marque, String modele, ArrayList<Reacteur> listReacteur, Fuselage fuselage) {
        this.marque = marque;
        this.modele = modele;
        this.listReacteur = listReacteur;
        this.fuselage = fuselage;
        this.immatriculation = Immatriculation.getInstance().genererImmatriculation();
    }

}