package exercice4;

import java.util.Date;

public class EtudiantBuilder {
    private String codeNip;
    private String codeIne;
    private String nom;
    private String nomUsuel;
    private String prenom;
    private Date dateNaissance;
    private String lieuNaissance;
    private int anneeBac;
    private String email;
    private String domicile;
    private String telephone;

    public EtudiantBuilder(String codeNip, String codeIne, String nom, String prenom) {
        this.codeNip = codeNip;
        this.codeIne = codeIne;
        this.nom = nom;
        this.prenom = prenom;
    }

    public EtudiantBuilder setCodeNip(String codeNip) {
        this.codeNip = codeNip;
        return this;
    }

    public EtudiantBuilder setCodeIne(String codeIne) {
        this.codeIne = codeIne;
        return this;
    }

    public EtudiantBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EtudiantBuilder setNomUsuel(String nomUsuel) {
        this.nomUsuel = nomUsuel;
        return this;
    }

    public EtudiantBuilder setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EtudiantBuilder setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public EtudiantBuilder setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
        return this;
    }

    public EtudiantBuilder setAnneeBac(int anneeBac) {
        this.anneeBac = anneeBac;
        return this;
    }

    public EtudiantBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EtudiantBuilder setDomicile(String domicile) {
        this.domicile = domicile;
        return this;
    }

    public EtudiantBuilder setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public Etudiant createEtudiant() {
        return new Etudiant(codeNip, codeIne, nom, nomUsuel, prenom, dateNaissance, lieuNaissance, anneeBac, email, domicile, telephone);
    }
}