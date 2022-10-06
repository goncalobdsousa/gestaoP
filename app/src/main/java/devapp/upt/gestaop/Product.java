package devapp.upt.gestaop;

public class Product {
    private String name;
    private float price;

    public Product(String n, float p) {
        name = n;
        price = p;
    }
    public String toString() {
        return getName() + " "
            + getPrice() + " €";
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
