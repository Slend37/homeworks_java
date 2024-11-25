public class Supermarket extends Market{

    double marketArea;
    String[] categories;

    // Constructor
    public Supermarket(int cash, int sellers, Product[] products, double marketArea, String[] categories) {
        super(cash, sellers, products);
        this.marketArea = marketArea;
        this.categories = categories;
    }

    // Getters and Setters
    public double getMarketArea() {
        return marketArea;
    }

    public void setMarketArea(double marketArea) {
        this.marketArea = marketArea;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public double SuperEfficiency(){

        double superEfficiency = categories.length * categories.length / marketArea * Efficiency();

        if (superEfficiency >= 1.0) {
            System.err.println("The efficiency is more than 1");
            return 0;
        } else {
            return superEfficiency;
        }
    }
}
