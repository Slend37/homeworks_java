public class Main {
    public static void main(String[] args){
        Market market = new Market(5,3, new Market.Product[]{
                new Market.Product("Bread", 0.3, 25.0),
                new Market.Product("Milk", 1.0, 80.0),
                new Market.Product("Ice Cream", 0.15, 100.0),
                new Market.Product("Apples", 1.0, 85.0),
                new Market.Product("Bananas", 1.0, 150.0),
                new Market.Product("Water", 0.5, 35.0),
                new Market.Product("Choco-Pie", 0.1, 90.0),
                new Market.Product("Dobriy Cola", 0.33, 65.0)
        });
        System.out.println("Market efficiency is " + market.Efficiency());
        Supermarket supermarket = new Supermarket(market.cash, market.sellers, market.products, 50, new String[]{
                "Milk products",
                "Fruits",
                "Drinks",
                "Bread products",
                "Sweets"
        });
        System.out.println("Supermarket efficiency is " + supermarket.SuperEfficiency());
    }
}
