public abstract class WritingSupplies extends Stationery {

    String colour;

    boolean equals (WritingSupplies set){
        if((this.title).equals(set.title) && (this.colour).equals(set.colour) && (this.price == set.price)) return true;
        return false;
    }


    public int hashCode(){
        return (int) (100*price + colour.hashCode()+title.hashCode());
    }

    public String toString(){
        return title +" "+colour +" "+price;
    }
}
