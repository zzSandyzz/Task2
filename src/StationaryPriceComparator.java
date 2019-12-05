import java.util.Comparator;

public class StationaryPriceComparator implements Comparator<Stationery> {

    @Override
    public int compare(Stationery st1, Stationery st2) {
        double price1 = st1.price;
        double price2 = st2.price;
        if (price1 < price2) {
            return -1;
        } else if (price1 == price2) {
            return 0;
        } else {
            return 1;
        }


    }
}

