import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

enum ProductName {
    BREAD, MILK, POTATOES, KETCHUP, WATER, LEMON, SWEETS, COFFEE, TEA, CHEESE, COOKIES
}

class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", weight=" + weight + "}";
    }
}