package exercice5;

/**
 * 
 */
public class Immatriculation {


    private static Immatriculation single_instance = null;


    public int compteur = 0;


    public static Immatriculation getInstance() {
        if (single_instance == null)
            single_instance = new Immatriculation();
        return single_instance;
    }

    public String genererImmatriculation() {
        String immatriculation = compteur + "";
        compteur++;
        return immatriculation;
    }

    public Immatriculation() {
    }

}