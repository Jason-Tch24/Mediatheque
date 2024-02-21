import javax.print.attribute.standard.Media;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Document livre1 = new Livre("Tribue de Capitoline","PC Ombete Bella");
        Document livre2 = new Livre("L'avare","Moliere");
        Document cd1 = new CdAudio("Titre","Inter","Compo");
        Adherent membre = new Adherent("Jason","Tchaga","tchagajason@gmail.com");
        Emprunt emprunt1 = new Emprunt();
        emprunt1.setDate();
        emprunt1.setDocument(livre2);
        emprunt1.setMembre(membre);
        System.out.println(emprunt1);

        Mediatheque listDoc = new Mediatheque();
        listDoc.add(livre1);
        listDoc.add(livre2);
        listDoc.add(cd1);
        Mediatheque listAdh = new Mediatheque();
        listAdh.addAdh(membre);

        String titre1= "Tribue de Capitoline";

        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(cd1);
        System.out.println(listDoc.rechercher(titre1));
        System.out.println(membre);
        System.out.println(emprunt1);
    }
}