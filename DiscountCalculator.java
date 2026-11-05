
public class DiscountCalculator {

    public static double calculateDiscount(double price, double discountPercentage) {
        double discount = price * discountPercentage / 100;
        return price - discount;
    }

    public static void main(String[] args) {

        double price = 1000;
        double discountPercentage = 10;

        double finalPrice = calculateDiscount(price, discountPercentage);

        System.out.println("Original Price: Rs." + price);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Final Price: Rs." + finalPrice);
    }
}