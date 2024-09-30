public class TestGroceryProductFactory {
    public static void main(String[] args) {
        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProduct banana = bananaFactory.createProduct();
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProduct apple = appleFactory.createProduct();
        System.out.println(banana);
        System.out.println(apple);
    }
}
