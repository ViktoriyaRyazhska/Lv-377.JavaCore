package SoftServe.Lesson4.Fourth;

public class ProductDriver {
    public static void main(String[] Args) {
        Product dell = new Product("Dell", 100, 30);
        Product hp = new Product("HP", 120, 20);
        Product asus = new Product("Asus", 90, 40);
        Product acer = new Product("Acer", 60, 50);

        System.out.println("The most expensive product is "+Product.whichExpensive(Product.whichExpensive(dell, hp), Product.whichExpensive(acer, asus)).nameQuantity());
        System.out.println("There a lof of "+Product.whichMore(Product.whichMore(dell, hp), Product.whichMore(acer, asus)).getName());
    }
}
