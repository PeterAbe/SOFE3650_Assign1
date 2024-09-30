public class Apple implements GroceryProduct {
    private double price;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple, Price: $" + this.price;
    }
}
