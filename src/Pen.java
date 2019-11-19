//task 1
public class Pen {
   private String title;
   private String colour;
   private double price;

    boolean equals (Pen pen){
        if((this.title).equals(pen.title) && (this.colour).equals(pen.colour) && (this.price == pen.price)) return true;
            return false;
    }


    public int hashCode(){
        return (int) (100*price + colour.hashCode()+title.hashCode());
    }

   public String toString(){
     return title +" "+colour +" "+price;
    }
}
