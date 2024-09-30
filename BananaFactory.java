public class BananaFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        Banana banana = new Banana();
        double price = getPriceFromDatabase("Banana"); 
        banana.setPrice(price);
        return banana;
    }

    private double getPriceFromDatabase(String productName) {
        return 0.99; //Used as example of price of banana
    }
}
