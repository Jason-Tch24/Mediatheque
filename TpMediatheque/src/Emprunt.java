import java.time.LocalDate;

public class Emprunt {

    LocalDate date;
    Adherent membre;
    Document document;

    public LocalDate getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalDate.now();
    }

    public Adherent getMembre() {
        return membre;
    }

    public void setMembre(Adherent membre) {
        this.membre = membre;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "date=" + date +
                ", membre=" + membre +
                ", document=" + document +
                '}';
    }
}
