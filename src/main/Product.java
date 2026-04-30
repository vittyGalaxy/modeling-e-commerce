public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    // getter
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
