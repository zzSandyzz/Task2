import java.util.Comparator;

public class PriceAndTitleComparator implements Comparator<Stationery> {

    @Override
    public int compare(Stationery st1, Stationery st2) {
        double price1 =st1.price;
        double price2 =st2.price;
        if (price1<price2) {
            return -1;
        } else if(price1 == price2){
            return (st1.title).compareTo(st2.title);
        }else {
            return 1;
        }


    }
}



