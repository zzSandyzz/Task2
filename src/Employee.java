import java.util.ArrayList;

public class Employee {
    private String name;
  private  ArrayList<Stationery> stationeryArrList = new ArrayList<Stationery>();

   public void giveStationery(Stationery st){
       stationeryArrList.add(st);
   }


    double showStationeryPrice(){
        double totPr=0.0;
        for(Stationery st: stationeryArrList){
            totPr+=st.price;
        }
        return totPr;
    }

    void showAllStationery(){
        for(Stationery st: stationeryArrList){
            System.out.println(st.title);
        }
    }

}
