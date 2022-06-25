public class Product {
    private final String name;
    private String price;
    private final int barCode;

    public Product (String name, int barCode) {
        this.name = name;
        this.barCode = 310;
    }
    public String getName () {
        return name;
    }
    public String getPrice () {
        return price;
    }
}