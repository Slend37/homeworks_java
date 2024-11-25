public class Market {

    int cash;
    Product[] products;
    int sellers;

    // Constructor (parametrized)
    public Market(int cash, int sellers, Product[] products) {
        this.cash = cash;
        this.sellers = sellers;
        this.products = products;
    }

    // Getters and Setters
    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        if (cash < 1)
            System.err.println("Cash parameter must be more than 0");
        else
            this.cash = cash;
    }

    public int getSellers() {
        return sellers;
    }

    public void setSellers(int sellers) {
        if (sellers < 0)
            System.err.println("Sellers parameter must be more or equals 0");
        else
            this.sellers = sellers;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        if (products.length > 0)
            this.products = products;
        else
            System.err.println("There are no products");
    }

    public static class Product {
        private String title;
        private double weight;
        private double price;

        // Constructor (parametrized)
        public Product(String title, double weight, double price) {
            this.title = title;
            this.weight = weight;
            this.price = price;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            if (title.length() > 2)
                this.title = title;
            else
                System.err.println("The length of the title must be more than 2 symbols");
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            if (weight <= 0)
                System.err.println("Weight must be more than 0");
            else
                this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    // Efficiency of cash counting
    private double CashEfficiency(){
        return (double) sellers / cash;
    }

    // Average weight
    private double AvgWeight(){

        double WeightTotal = 0.0;
        for (Product product : products){
            WeightTotal += product.getWeight();
        }

        return WeightTotal / products.length;
    }

    // Efficiency of Market counting
    public double Efficiency(){
        double efficiency = AvgWeight() / CashEfficiency();
        if (efficiency < 1.0){
            return efficiency;
        } else {
            System.err.println("The efficiency is more than 1");
            return 0;
        }
    }
}
