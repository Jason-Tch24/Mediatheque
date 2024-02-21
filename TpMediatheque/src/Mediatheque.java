import java.util.ArrayList;
import java.util.List;

public class Mediatheque{
    List<Document> listLivre= new ArrayList<>();
    List<Adherent> listAdh = new ArrayList<>();
    List<Emprunt> listEmrunt = new ArrayList<>();
    int documentId;
    int adhId;

    public void add(Document d){
        documentId = documentId +1;
        d.setId(documentId);
        listLivre.add(d);
    }

    public void addAdh(Adherent adherent){
        adhId = adhId +1;
        adherent.setIdentifiant(adhId);
        listAdh.add(adherent);
    }

    public String rechercher (String titre){
        for(Document document : listLivre ){
            if(document.getTitre().equals(titre)){
                return titre;
            }
        }
        return  "Livre non trouve";
    }
}
