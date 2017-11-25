package exo1;
public class Livre {
    public String numl , titre , editeur , auteur , date_achat , etat;
    
    Livre(String numl ,String titre ,String editeur ,String auteur ,String date_achat ,String etat){
           this.numl = numl;
           this.titre = titre;
           this.editeur = editeur;
           this.auteur = auteur;
           this.date_achat = date_achat;
           this.etat = etat;
    }
    public void setNuml(String numl) {
        this.numl = numl;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setDate_achat(String date_achat) {
        this.date_achat = date_achat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public String getNuml() {
        return numl;
    }
    public String getTitre() {
        return titre;
    }
    public String getEditeur() {
        return editeur;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getDate_achat() {
        return date_achat;
    }
    public String getEtat() {
        return etat;
    }
}
