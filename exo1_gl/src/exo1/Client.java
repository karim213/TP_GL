package exo1;
public class Client {
    public String numc , nom , adresse , caution;
    Client(String numc , String nom , String adresse , String caution){
          this.numc = numc;
          this.nom = nom;
          this.adresse = adresse;
          this.caution = caution;
    }

    public void setNumc(String numc) {
        this.numc = numc;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCaution(String caution) {
        this.caution = caution;
    }

    public String getNumc() {
        return numc;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }
    public String getCaution() {
        return caution;
    }
   }
