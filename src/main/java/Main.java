import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<OfertaSprzedazy> ofertaSprzedazy = new ArrayList<OfertaSprzedazy>();
        ofertaSprzedazy.add(new OfertaSprzedazy("p1", 120.1));
        ofertaSprzedazy.add(new OfertaSprzedazy("p2", 110.1));
        ofertaSprzedazy.add(new OfertaSprzedazy("p3", 10.10));
        ofertaSprzedazy.add(new OfertaSprzedazy("p4", 20.11));

        System.out.println(ofertaSprzedazy);



        Collections.sort(ofertaSprzedazy, (o1, o2) -> Double.compare(o1.getCena(), o2.getCena()));

        System.out.println(ofertaSprzedazy);

        Collections.sort(ofertaSprzedazy, (o2, o1) -> Double.compare(o1.getCena(), o2.getCena()));

        System.out.println(ofertaSprzedazy);

        Komparatr comp = new Komparatr(true);

        Collections.sort(ofertaSprzedazy, (o1, o2) -> Double.compare(o1.getCena(), o2.getCena()));

        System.out.println(ofertaSprzedazy);
    }




}
