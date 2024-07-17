package Exercice2.metier;

public class Adherent extends Personne {
    private int numAdherent;

    public int getNumAdherent() {
        return this.numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    public Adherent() {
    }

    public Adherent(String nom, String prenom, String email, String tel, int age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    public String toString() {
        return super.toString() + " numAdherent=" + this.numAdherent;
    }
}
