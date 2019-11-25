import java.util.Comparator;

public class TitleComparator implements Comparator<Stationery> {

    @Override
    public int compare(Stationery st1, Stationery st2) {
        String title1 =st1.title;
        String title2 =st2.title;

     return title1.compareTo(title2);

    }
}


