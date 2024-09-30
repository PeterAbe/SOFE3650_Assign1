public class AppleFactory implements GroceryProductFactory {
    @Override
    public GroceryProduct createProduct() {
        Apple apple = new Apple();
        double price = getPriceFromDatabase("Apple");
        apple.setPrice(price);
        return apple;
    }

    private double getPriceFromDatabase(String productName) {
        return 1.49; // Used as exaple of price of apple
    }
}
