import java.util.Comparator;

public class Komparatr implements Comparator<OfertaSprzedazy> {

    private Boolean czyTrue;

    public Komparatr(Boolean czyTrue) {
        this.czyTrue = czyTrue;
    }

    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
  //      return Double.compare(o1.getCena(), o2.getCena());

        if (czyTrue){
            return Double.compare(o1.getCena(), o2.getCena());
        }
        return Double.compare(o2.getCena(), o1.getCena());
    }









    }








