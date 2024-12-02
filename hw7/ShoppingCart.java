import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class ShoppingCart {
    private List<Product> cart = new ArrayList<>();
    private static final Random random = new Random();
    private static final String FAVORITE_PRODUCT_NAME = "WATER"; // Ваш любимый продукт

    public void addProduct(Product product) {
        for (Product p : cart) {
            if (p.getName().equals(product.getName())) {
                System.out.println("Продукт " + product.getName() + " уже в корзине.");
                return;
            }
        }
        cart.add(product);
        System.out.println("Продукт " + product.getName() + " успешно добавлен.");
    }

    public void removeHeavyAndExpensiveProducts() {
        cart.removeIf(product -> product.getWeight() > 5 || product.getPrice() > 10000);
    }

    public void prioritizeFavoriteProduct() {
        for (Product product : cart) {
            if (product.getName().equals(FAVORITE_PRODUCT_NAME)) {
                cart.remove(product);
                cart.add(0, product);
                break;
            }
        }
    }

    public void printProductsUnder10AndOver2() {
        for (Product product : cart) {
            if (product.getPrice() < 10000 && product.getWeight() > 2) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<ProductName> productNames = new ArrayList<>(EnumSet.allOf(ProductName.class));

        // Генерация случайных продуктов
        for (int i = 0; i < 50; i++) {
            String name = productNames.get(random.nextInt(productNames.size())).name();
            double price = random.nextDouble() * 12000; // Случайная цена от 0 до 20000
            double weight = random.nextDouble() * 7; // Случайный вес от 0 до 10 кг
            shoppingCart.addProduct(new Product(name, price, weight));
        }

        // Удаление тяжелых и дорогих продуктов
        shoppingCart.removeHeavyAndExpensiveProducts();

        // Приоритизация любимого продукта
        shoppingCart.prioritizeFavoriteProduct();

        // Вывод продуктов с ценой < 10 и весом > 2
        System.out.println("Продукты с ценой < 10000 и весом > 2:");
        shoppingCart.printProductsUnder10AndOver2();
    }
}
