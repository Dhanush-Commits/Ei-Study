// Use the shopping cart and payment strategies in the demo class
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9876-5432"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalStrategy("user@example.com"));
        cart.checkout(200);

        cart.setPaymentStrategy(new BitcoinStrategy("1A2b3C4D5e6F"));
        cart.checkout(300);
    }
}