public class Etiquettes {
    private static Etiquettes single_instance = null;
    private int compteur;
    // private constructor restricted to this class itself
    private Etiquettes() {
        this.compteur = 0;
    }
    // static method to create instance of Singleton class
    public static Etiquettes getInstance() {
        if (single_instance == null)
            single_instance = new Etiquettes();
        return single_instance;
    }

    public String genererEtiquette() {
        return "ID_" + this.compteur++;
    }
}
