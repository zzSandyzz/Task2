import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Task2 {
    public static void main (String[] args){
        {
            Comparator<Stationery> comp = new StationaryPriceComparator();
            TreeSet<Stationery> newbieKit = new TreeSet<Stationery>(comp);

            Pen stabilo = new Pen();
            Notebook spiralBook = new Notebook();

            newbieKit.add(stabilo);
            newbieKit.add(spiralBook);

            for (Stationery st : newbieKit) {
                System.out.println(st.toString());
            }
        }
        {
            Comparator<Stationery> comp = new TitleComparator();
            TreeSet<Stationery> newbieKit = new TreeSet<Stationery>(comp);

            Pen stabilo = new Pen();
            Notebook spiralBook = new Notebook();

            newbieKit.add(stabilo);
            newbieKit.add(spiralBook);

            for (Stationery st : newbieKit) {
                System.out.println(st.toString());
            }
        }
        Comparator<Stationery> comp = new PriceAndTitleComparator();
        TreeSet<Stationery> newbieKit = new TreeSet<Stationery>(comp);

        Pen stabilo = new Pen();
        Notebook spiralBook = new Notebook();

        newbieKit.add(stabilo);
        newbieKit.add(spiralBook);

        for(Stationery st: newbieKit){
            System.out.println(st.toString());
        }




    }
}
