public class Livre extends Document{
    private String auteur;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                super.toString()+
                "auteur='" + auteur + '\'' +
                '}';
    }
}
