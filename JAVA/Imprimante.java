import java.awt.image.BufferedImageFilter;

public class Imprimante {
    private static Imprimante single_instance = null;

    private int nbFeuilleImprime;

    private Imprimante(){
        this.nbFeuilleImprime = 0;
    }

    public static Imprimante getInstance() {
        if (single_instance == null) {
            single_instance = new Imprimante();
        }
        return single_instance;
    }

    public void imprimerFeuille() {
        this.nbFeuilleImprime++;
    }

    public int getNbFeuilleImprime() {
        return nbFeuilleImprime;
    }
}
