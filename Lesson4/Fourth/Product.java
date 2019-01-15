package SoftServe.Lesson4.Fourth;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static Product whichExpensive(Product product1, Product product2) {
        if (product1.price > product2.price) {
            return product1;
        } else {
            return product2;
        }
    }

    public static Product whichMore(Product product1, Product product2) {
        if (product1.quantity > product2.quantity) {
            return product1;
        } else {
            return product2;
        }
    }

    public String nameQuantity() {
        return name+" quantity: "+quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
