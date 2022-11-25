package exercice4;

import java.util.Date;

public class Etudiant {
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

    Etudiant(String codeNip, String codeIne, String nom, String nomUsuel, String prenom, Date dateNaissance, String lieuNaissance, int anneeBac, String email, String domicile, String telephone) {
        this.codeNip = codeNip;
        this.codeIne = codeIne;
        this.nom = nom;
        this.nomUsuel = nomUsuel;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.anneeBac = anneeBac;
        this.email = email;
        this.domicile = domicile;
        this.telephone = telephone;
    }

    public String getCodeNip() {
        return codeNip;
    }

    public String getCodeIne() {
        return codeIne;
    }

    public String getNom() {
        return nom;
    }

    public String getNomUsuel() {
        return nomUsuel;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public int getAnneeBac() {
        return anneeBac;
    }

    public String getEmail() {
        return email;
    }

    public String getDomicile() {
        return domicile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setCodeNip(String codeNip) {
        this.codeNip = codeNip;
    }

    public void setCodeIne(String codeIne) {
        this.codeIne = codeIne;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public void setAnneeBac(int anneeBac) {
        this.anneeBac = anneeBac;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
