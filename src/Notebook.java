public class Notebook extends Stationery {
    int volume;

    public Notebook() {
        this.volume = 100;
        this.price= 100.0;
        this.title="standart";
    }
    public Notebook(int volume, double price, String title) {
        this.volume = volume;
        this.price= price;
        this.title=title;
    }

    boolean equals (Notebook notebook){
        if((this.title).equals(notebook.title) && (this.volume==notebook.volume) && (this.price == notebook.price)) return true;
        return false;
    }


    public int hashCode(){
        return (int) (100*price + volume+title.hashCode());
    }

    public String toString(){
        return title +" "+volume +" "+price;
    }
}
