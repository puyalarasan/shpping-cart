public class CartCalculatorTest {

    public static void main(String[] args) {

        int actual = CartCalculator.calculateTotal(500, 3);

        int expected = 1500;

        if (actual == expected) {
            System.out.println("TEST PASSED!");
        } else {
            throw new AssertionError(
                "TEST FAILED! Expected: " + expected +
                ", Actual: " + actual
            );
        }
    }
}
