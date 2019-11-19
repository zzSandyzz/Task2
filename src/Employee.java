import java.util.ArrayList;

public class Employee {
    private String name;
    ArrayList<Object> stationary = new ArrayList<>();

    double totalPrice(){
        double totPr=0.0;
        for(Object o: stationary){
            totPr+=o.price;
        }
    }

}
