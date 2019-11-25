public class Marker extends WritingSupplies {
    double thick;
    public Marker() {
        this.colour="blue";
        this.title="ballpen";
        this.price=20.50;
        this.thick = 0.5;
    }
    public Marker(String colour, String title, double price, double thick) {
        this.colour=colour;
        this.title=title;
        this.price=price;
        this.thick = thick;
    }


    boolean equals (Marker marker){
        if((this.title).equals(marker.title) && (this.colour).equals(marker.colour) &&
                (this.price == marker.price) && (this.thick == marker.thick)) return true;
        return false;
    }


    public int hashCode(){
        return (int) (100*price + 100*thick+ colour.hashCode()+title.hashCode());
    }

    public String toString(){
        return title +" "+colour +" "+price+" "+ thick;
    }

}
