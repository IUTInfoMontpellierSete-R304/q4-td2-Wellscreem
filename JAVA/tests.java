import javax.sound.midi.Soundbank;

public class tests {
    public static void main(String[] args) {
        System.out.println(Etiquettes.getInstance().genererEtiquette());
        System.out.println(Etiquettes.getInstance().genererEtiquette());
        System.out.println(Etiquettes.getInstance().genererEtiquette());
        System.out.println(Etiquettes.getInstance().genererEtiquette());
        System.out.println(Etiquettes.getInstance().genererEtiquette());
        System.out.println(Etiquettes.getInstance().genererEtiquette());

        Imprimante.getInstance().imprimerFeuille();
        System.out.println(Imprimante.getInstance().getNbFeuilleImprime());
        for (int i = 0; i < 5; i++) {
            Imprimante.getInstance().imprimerFeuille();
        }
        System.out.println(Imprimante.getInstance().getNbFeuilleImprime());
    }
}
