public class CdAudio extends Document{
    private String interprete;
    private String compositeur;

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public void setCompositeur(String compositeur) {
        this.compositeur = compositeur;
    }

    public CdAudio(String titre, String interprete, String compositeur) {
        super(titre);
        this.interprete = interprete;
        this.compositeur = compositeur;
    }

    @Override
    public String toString() {
        return "CdAudio{" +super.toString()+
                "interprete='" + interprete + '\'' +
                ", compositeur='" + compositeur + '\'' +
                '}';
    }
}
