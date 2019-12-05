//task 1
public class Pen extends WritingSupplies {
    public Pen() {
        this.colour = "blue";
        this.title = "ballpen";
        this.price = 20.50;
    }

    public Pen(String colour, String title, double price) {
        this.colour = colour;
        this.title = title;
        this.price = price;
    }
}
