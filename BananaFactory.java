public class BananaFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        Banana banana = new Banana();
        double price = getPriceFromDatabase("Banana"); // Simulated database lookup
        banana.setPrice(price);
        return banana;
    }

    private double getPriceFromDatabase(String productName) {
        // In a real implementation, this would read from a database or file
        return 0.99; //Used as example of price of banana
    }
}
